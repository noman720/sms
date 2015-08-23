
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.bean.SubjectChoiceBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.SubjectChoiceManager;
import main.java.com.csbl.sms.util.DatabaseConnection;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.ReportUtil;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class SubjectChoiceManagerImpl implements SubjectChoiceManager
{
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    private static Map param = new HashMap();
    
    @Override
    public String saveSelectedSubject(SubjectChoiceBean subjectChoiceBean)
    {
        try
        {   
            subjectChoiceBean.setOid(idGenerator.generateOid());
            String sql = "insert into "+TableName.SELECTEDSUBJECT+"(oid, studentID, classID, academicYear, compulsory, elective, additional) values (?, ?, ?, ?, ?, ?, ?)";
            Object[] object = new Object[]{subjectChoiceBean.getOid(), subjectChoiceBean.getStudentID(), subjectChoiceBean.getClassID(), subjectChoiceBean.getAcademicYear(), subjectChoiceBean.getCompulsory(), subjectChoiceBean.getElective(), subjectChoiceBean.getAdditional()};
            generalDAOSpringJdbc.save(sql, object);
                    
        }catch(Exception e){
            log.error("An Exception occured when save Selective Subject: ", e);
            return "Unable to Save Selected Subject";
        }
        return "successful";
    }
    
    
    @Override
    public List<SubjectChoiceBean> getStudentList(String classId, String academicYear)
    {
        List<SubjectChoiceBean> studentList = new ArrayList<>();
        try
        {
            
            String sql = "select studentID, compulsory, elective, additional from "+TableName.SELECTEDSUBJECT+" where classId = ? and academicYear = ? order by studentId ASC";
            Object [] object = new Object[]{classId, academicYear};
            studentList = (List<SubjectChoiceBean>) generalDAOSpringJdbc.getObjects(sql, SubjectChoiceBean.class, object);
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            //log.error("An Exception occured when get Student List for Selective Subject: ", e);
            return studentList;
        }
        return studentList;
    }
    
    @Override
    public List<String> getAcademicYear(String classId)
    {
        List<String> academicIdList = new ArrayList<>();
        try
        {
            String sql = "select distinct academicYear from "+TableName.STD_ACADEMICINFO+" where classId = ? order by academicYear desc";
            Object [] object = new Object[]{classId};
            List<StudentBean> yearList = (List<StudentBean>) generalDAOSpringJdbc.getObjects(sql, StudentBean.class, object);
            
            for(StudentBean sb : yearList)
            {
                academicIdList.add(sb.getAcademicYear());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Subject List : ", e);
            return academicIdList;
        }
        return academicIdList;
    }
    
    @Override
    public List<String> getStudentIdList(String classId, String academicYear)
    {
        List<String> studentIdList = new ArrayList<>();
        try
        {
            String sql = "select studentId from "+TableName.STD_ACADEMICINFO+" where classId = ? and academicYear = ? order by studentId asc";
            Object [] object = new Object[]{classId, academicYear};
            List<StudentBean> studentList = (List<StudentBean>) generalDAOSpringJdbc.getObjects(sql, StudentBean.class, object);
            
            for(StudentBean sb : studentList)
            {
                studentIdList.add(sb.getStudentID());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Subject List : ", e);
            return studentIdList;
        }
        return studentIdList;
    }
    
    
    @Override
    public void showSelectedSubjects(String classId, String academicYear)
    {      
        param.clear();
        param.put("classId", classId);
        param.put("academicYear", academicYear);
        String fileSource = "report/student/SelectedSubjets.jasper";
        ReportUtil.exportReport(fileSource, DatabaseConnection.getConnection(), param);
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
