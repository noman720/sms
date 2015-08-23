
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.StudentBean;

public interface ExamRegistrationManager  
{
    public String registerStudentForExam(List<StudentBean> studentBeans, String classId, String examYear, String examName);
       
    public List<StudentBean> getStudentForRegistration(String classId, String academicYear, String examName);
    
}
