package main.java.com.csbl.sms.manager.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import main.java.com.csbl.sms.bean.MarkBean;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.exception.SMSDataAccessException;
import main.java.com.csbl.sms.manager.ExamRegistrationManager;
import main.java.com.csbl.sms.util.DatabaseConnection;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;

public class ExamRegistrationManagerImpl implements ExamRegistrationManager
{

    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    
    @Override
    public synchronized String registerStudentForExam(List<StudentBean> studentBeans, String classId, String examYear, String examName)
    {
        try
        {
            Connection conn = null;
            PreparedStatement pst = null;
            //List<MarkBean> markBeanList = new ArrayList();
            //List<MarkBean> list = getSubjectCodesByStudent(sb, classId, examYear, examName);
            
            for(StudentBean sb : studentBeans)
            {
                List<MarkBean> markBeanList = getSubjectCodesByStudent(sb, classId, examYear, examName);
                if(markBeanList.isEmpty() || markBeanList == null)
                {
                   return "No Selected Subjects For Student";
                } 
                
                try{
                conn = DatabaseConnection.getConnection();
                if(conn == null)
                {
                    return "Database Connection Lost";
                }
                String sql = "insert into t_result_"+classId+"(oid, studentId, examYear, examName, subjectCode) values (?, ?, ?, ?, ?)";
                pst = conn.prepareStatement(sql);
                conn.setAutoCommit(false);
                for(MarkBean mb : markBeanList)
                {
                    pst.setString(1, mb.getOid());
                    pst.setString(2, mb.getStudentId());
                    pst.setString(3, mb.getExamYear());
                    pst.setString(4, mb.getExamName());
                    pst.setString(5, mb.getSubjectCode());

                    pst.addBatch();
                    //System.out.println(pst.toString());
                }
                pst.executeBatch();
                conn.commit(); 
                }
                finally
                {
                    try
                    {
                        if(pst!= null)
                        {
                            pst.close();
                        }
                        if(conn != null && !conn.isClosed())
                        {
                            conn.close();
                        }
                    }
                    catch(Exception e)
                    {
                        log.error("An Exception occured when close connection : ", e);
                    }
                }
            }
            
            
        }catch(Exception e){
            log.error("An Exception occured when save Registerd Student: ", e);
            return "Unable to Register Student";
        }
        
        return "successful";
    }
    
    private synchronized List<MarkBean> getSubjectCodesByStudent(StudentBean studentBean, String classId, String examYear, String examName)
    {
        List<MarkBean> markBeans = new ArrayList<>();
        try{
            String sql = "select concat(compulsory, ',', elective, ',', additional) as subjects from "+TableName.SELECTEDSUBJECT+" where studentId = ? and classId = ?";
            Object [] object = new Object[]{studentBean.getStudentID(), classId};
            String subjects = (String) generalDAOSpringJdbc.getObject(sql, object);
            //System.out.println(subjects);

            List<String> subjectList = getListByToken(subjects);
            
            for(String s : subjectList)
            {
                MarkBean markBean = new MarkBean();
                markBean.setOid(idGenerator.generateOid());
                markBean.setStudentId(studentBean.getStudentID());
                markBean.setExamYear(examYear);
                markBean.setExamName(examName);
                markBean.setSubjectCode(s);

                markBeans.add(markBean);
                
                //System.out.println(markBean.getOid() + "\t"+markBean.getStudentId()+"\t"+markBean.getSubjectCode());
            }
        }catch(EmptyResultDataAccessException ex)
        {
            return null;
        }
        catch(Exception e)
        {
            //log.error("An Exception occured when getSubjectCodesByStudent for Register : ", e);
            return markBeans;
        }
        
        return markBeans;
    }
    
    private synchronized List<String> getListByToken(String subjects)
    {
        List<String> subjectList = new ArrayList();
        StringTokenizer token = new StringTokenizer(subjects,",");
        while(token.hasMoreTokens()) {
            subjectList.add(token.nextToken().trim());
        }
        
        return subjectList;
    }
    
    private List<StudentBean> getStudentList(String classId, String academicYear)
    {
        List<StudentBean> studentList = new ArrayList<>();
        try
        {
            String sql = "select sp.studentId, classRoll, studentName "
                    + "from "+TableName.STD_PERSONALINFO+" sp, "+TableName.STD_ACADEMICINFO+" sa "
                    + "where sp.studentId = sa.studentId and classId = ? and academicYear = ? "
                    + "order by classRoll asc";
                    
            Object [] object = new Object[]{classId, academicYear};
            
            studentList = (List<StudentBean>) generalDAOSpringJdbc.getObjects(sql, StudentBean.class, object);
        }
        catch(NumberFormatException | SMSDataAccessException e)
        {
            log.error("An Exception occured when get Student List for Register : ", e);
            return studentList;
        }
        return studentList;
    }
    
    
    
    private List<String> getRegisteredStudentList(String classId, String academicYear, String examName)
    {
        List<String> registeredStudentList = new ArrayList();
        try
        {
            String sql = "select distinct studentId from t_result_"+classId+" where examYear = ? and examName = ?";
            
            Object [] object = new Object[]{academicYear, examName};
            
            List<MarkBean> list = (List<MarkBean>) generalDAOSpringJdbc.getObjects(sql, MarkBean.class, object);
            
            for(MarkBean cb : list)
            {
                registeredStudentList.add(cb.getStudentId());
            }
        }
        catch(Exception e)
        {
            log.error("An Exception occured when get Student List for Register : ", e);
            return registeredStudentList;
        }
        return registeredStudentList;
    }
    
    @Override
    public List<StudentBean> getStudentForRegistration(String classId, String academicYear, String examName)
    {   
        List<StudentBean> unregistedStudentList = new ArrayList();
        List<StudentBean> studentList = getStudentList(classId, academicYear);
        List<String> registeredStudents = getRegisteredStudentList(classId, academicYear, examName);
        
        for(StudentBean sb : studentList)
        {
            boolean isRegister = false;
            for(String s : registeredStudents)
            {
                if(sb.getStudentID().equalsIgnoreCase(s))
                {
                    isRegister = true;
                    break;
                }
                //System.out.println(sb.getStudentID());
            }
            if(!isRegister)
            {
                unregistedStudentList.add(sb);
            }
        }
        
        return unregistedStudentList;
    }
    
    
    

    public IDAO getGeneralDAOSpringJdbc() {
        return generalDAOSpringJdbc;
    }

    public void setGeneralDAOSpringJdbc(IDAO generalDAOSpringJdbc) {
        this.generalDAOSpringJdbc = generalDAOSpringJdbc;
    }

    public IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }
    
    
    
    
}
