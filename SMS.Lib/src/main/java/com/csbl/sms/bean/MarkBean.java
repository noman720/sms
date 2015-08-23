package main.java.com.csbl.sms.bean;


public class MarkBean extends AbstractBean{
    
    private String studentId;
    private String classRoll;
    private String studentName;
    private String examYear;
    private String examName;
    private String subjectCode;
    private String markType;
    private Double mark;

    public MarkBean() {
    }

    public MarkBean(String examYear, String examName, String subjectCode, String markType) {
        this.examYear = examYear;
        this.examName = examName;
        this.subjectCode = subjectCode;
        this.markType = markType;
    }

    

    @Override
    public String getOid() {
        return oid;
    }

    @Override
    public void setOid(String Oid) {
        this.oid = Oid;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassRoll() {
        return classRoll;
    }

    public void setClassRoll(String classRoll) {
        this.classRoll = classRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getMarkType() {
        return markType;
    }

    public void setMarkType(String markType) {
        this.markType = markType;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }
    
    
}
