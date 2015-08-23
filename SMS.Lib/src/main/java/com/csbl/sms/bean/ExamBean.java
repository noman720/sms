
package main.java.com.csbl.sms.bean;

public class ExamBean extends AbstractBean
{
    private String classId;
    private String examName;

    public ExamBean(String classId, String examName) {
        this.classId = classId;
        this.examName = examName;
    }

       
    public ExamBean() {
    }
    

    @Override
    public String getOid() {
        return oid;
    }

    @Override
    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classID) {
        this.classId = classID;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }
    
    
}
