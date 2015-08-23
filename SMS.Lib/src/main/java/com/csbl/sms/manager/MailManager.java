
package main.java.com.csbl.sms.manager;

import java.util.List;

public interface MailManager {
    
    public String sendMail(String from, String[] to, String subject, String msg);
    
    public List<String> getStudentEmailList(String classId, String academicYear);
}
