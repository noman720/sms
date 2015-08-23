
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.StudentBean;

public interface StudentManager 
{
    
    public String saveStudent(StudentBean studentBean);
   
    public List<StudentBean> getStudentList(String className, String year);
    
    public StudentBean getStudentInfo(String classId, String studentId);
    
    public List<String> getShiftNameList(String classId);
    
    public List<String> getSectionNameList(String classId);
    
    public void showStudentByClass(String classId, String academicYear);
    
    public void showStudentInfoById(String classId, String studentId);
    
    
}