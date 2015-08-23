
package main.java.com.csbl.sms.bean;

public class SubjectChoiceBean extends AbstractBean
{
    private String studentID;
    private String classID;
    private String academicYear;
    private String compulsory;
    private String elective;
    private String additional;

    public SubjectChoiceBean(String studentID, String classID, String academicYear, String compulsory, String elective, String additional) {
        this.studentID = studentID;
        this.classID = classID;
        this.academicYear = academicYear;
        this.compulsory = compulsory;
        this.elective = elective;
        this.additional = additional;
    }

    public SubjectChoiceBean() {
    }
    
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(String compulsory) {
        this.compulsory = compulsory;
    }

    public String getElective() {
        return elective;
    }

    public void setElective(String elective) {
        this.elective = elective;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    
}
