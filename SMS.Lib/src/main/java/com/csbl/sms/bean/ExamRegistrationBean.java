
package main.java.com.csbl.sms.bean;

import java.util.List;


public class ExamRegistrationBean {
    private String className;
    private String session;
    private String examName;
    private String examYear;
    private List<StudentRegistrationBean> studentList;

    public ExamRegistrationBean(String className, String session, String examName, String examYear, List<StudentRegistrationBean> studentList) {
        this.className = className;
        this.session = session;
        this.examName = examName;
        this.examYear = examYear;
        this.studentList = studentList;
    }

    public ExamRegistrationBean() {
    }

    public ExamRegistrationBean(String className, String session, String examName, String examYear) {
        this.className = className;
        this.session = session;
        this.examName = examName;
        this.examYear = examYear;
    }
    

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
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

    public List<StudentRegistrationBean> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentRegistrationBean> studentList) {
        this.studentList = studentList;
    }

    
    
    
 }
