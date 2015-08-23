
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.exception.SMSDataAccessException;
import main.java.com.csbl.sms.manager.StudentManager;
import main.java.com.csbl.sms.util.DatabaseConnection;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.ReportUtil;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class StudentManagerImpl implements StudentManager
{
    private  Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    private static Map param = new HashMap();
    
    @Override
    public String saveStudent(StudentBean studentBean)
    {
        try
        {
            studentBean.setOid(idGenerator.generateOid());
            String sqlPersonal = "insert into "+TableName.STD_PERSONALINFO+"("
                    + "oid, studentID, studentName, "
                    + "fatherName, motherName, presentAddress, "
                    + "permanentAddress, mobileNo, email, "
                    + "gender, bloodGroup, birthDate, "
                    + "pictureurl) "
                    + "values ("
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?)";
            
            String sqlAcademic = "insert into "+TableName.STD_ACADEMICINFO+" ("
                    + "oid, classId, studentId, "
                    + "academicYear, studentGroup, studentType, "
                    + "medium, shift, sectionName, "
                    + "classRoll) "
                    + "values ("
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?)";
            
            
            Object[] objPersonal = new Object[]
            {
                studentBean.getOid(), studentBean.getStudentID(), studentBean.getStudentName(),
                studentBean.getFatherName(), studentBean.getMotherName(),studentBean.getPresentAddress(),
                studentBean.getPermanentAddress(), studentBean.getMobileNo(), studentBean.getEmail(),
                studentBean.getGender(), studentBean.getBlooldGroup(), studentBean.getBirthDate(), 
                studentBean.getPictureurl()
            };
            
            Object[] objAcademic = new Object[]
            {
                studentBean.getOid(), studentBean.getClassId(), studentBean.getStudentID(),
                studentBean.getAcademicYear(), studentBean.getStudentGroup(), studentBean.getStudentType(),
                studentBean.getMedium(),studentBean.getShift(), studentBean.getSectionName(), 
                studentBean.getClassRoll() 
            };
            
            generalDAOSpringJdbc.save(sqlPersonal, objPersonal);
            generalDAOSpringJdbc.save(sqlAcademic, objAcademic);
            
        }catch(Exception e){
            log.error("An Exception occured when save Student: ", e);
            return "Unable to Save Student";
        }
        return "successful";
    }
    
    
    
    @Override
    public List<StudentBean> getStudentList(String className, String year)
    {
        List<StudentBean> studentList = new ArrayList<>();
        try
        { 
            String sql = "select sp.studentId, classId, classRoll, studentName, mobileNo from "+TableName.STD_PERSONALINFO+" sp, "+TableName.STD_ACADEMICINFO+" sa where sp.studentId = sa.studentId and classId = ? and academicYear = ?";
            Object [] object = new Object[]{className, year};
            studentList = (List<StudentBean>) generalDAOSpringJdbc.getObjects(sql, StudentBean.class, object);
        }
        catch(NumberFormatException | SMSDataAccessException e)
        {
            log.error("An Exception occured when get Student List : ", e);
            return studentList;
        }
        return studentList;
    }
    
    @Override
    public StudentBean getStudentInfo(String classId, String studentId)
    {
        StudentBean studentBean = new StudentBean();
        try
        { 
            String sql = "select sp.studentId, studentName, fatherName, motherName, presentAddress, mobileNo, birthDate, academicYear, studentGroup, studentType, medium, shift, sectionName, classRoll from "+TableName.STD_PERSONALINFO+" sp, "+TableName.STD_ACADEMICINFO+" sa where sp.studentId = sa.studentId and classId = ? and sa.studentId = ?";
            Object [] object = new Object[]{classId, studentId};
            studentBean = (StudentBean) generalDAOSpringJdbc.getObjectBean(sql, StudentBean.class, object);
        }
        catch(Exception e)
        {
            log.error("An Exception occured when get Student Info : ", e);
            return studentBean;
        }
        return studentBean;
    }

    @Override
    public List<String> getShiftNameList(String classId)
    {
        List<String>  shiftNameList = new ArrayList<>();
        try
        {
            String sql = "select shift from "+TableName.SHIFT+" where classId = ? order by oid asc";
            Object [] object = new Object[]{classId};
            List<StudentBean> list = (List<StudentBean>) generalDAOSpringJdbc.getObjects(sql, StudentBean.class, object);
            
            for(StudentBean cb : list)
            {
                shiftNameList.add(cb.getShift());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Shift List : ", e);
            return shiftNameList;
        }
        return shiftNameList;
    }
    
    @Override
    public List<String> getSectionNameList(String classId)
    {
        List<String>  shiftNameList = new ArrayList<>();
        try
        {
            String sql = "select sectionName from "+TableName.SECTION+" where classId = ? order by oid asc";
            Object [] object = new Object[]{classId};
            List<StudentBean> list = (List<StudentBean>) generalDAOSpringJdbc.getObjects(sql, StudentBean.class, object);
            
            for(StudentBean cb : list)
            {
                shiftNameList.add(cb.getSectionName());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Section List : ", e);
            return shiftNameList;
        }
        return shiftNameList;
    }
    
    
    @Override
    public void showStudentByClass(String classId, String academicYear)
    {      
        param.clear();
        param.put("classId", classId);
        param.put("academicYear", academicYear);
        String fileSource = "report/student/StudentByClass.jasper";
        ReportUtil.exportReport(fileSource, DatabaseConnection.getConnection(), param);
    }
    
    @Override
    public void showStudentInfoById(String classId, String studentId)
    {      
        param.clear();
        param.put("classId", classId);
        param.put("studentId", studentId);
        String fileSource = "report/student/StudentInfo.jasper";
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
