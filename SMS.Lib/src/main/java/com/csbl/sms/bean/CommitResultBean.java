
package main.java.com.csbl.sms.bean;

public class CommitResultBean extends AbstractBean{

    private String classId;
    private String examYear;
    private String examName;

    public CommitResultBean() {
    }

    public CommitResultBean(String classId, String examYear, String examName) {
        this.classId = classId;
        this.examYear = examYear;
        this.examName = examName;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getExamYear() {
        return examYear;
    }

    public void setExamYear(String examYear) {
        this.examYear = examYear;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }
    
    
}
