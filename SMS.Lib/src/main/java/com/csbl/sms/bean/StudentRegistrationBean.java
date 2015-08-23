
package main.java.com.csbl.sms.bean;

public class StudentRegistrationBean
{
    private String oid;
    private String studentID;
    private String examName;
    private String examYear;

    public StudentRegistrationBean(String oid, String studentID) {
        this.oid = oid;
        this.studentID = studentID;
    }

    public StudentRegistrationBean() {
    }
    

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamYear() {
        return examYear;
    }

    public void setExamYear(String examYear) {
        this.examYear = examYear;
    }
    
    
    
}
