
package main.java.com.csbl.sms.bean;

public class MarkSheetBean extends AbstractBean{
   
    private String subjectType;
    private String subjectCode;
    private String subjectName;
    private double mark;
    private double gradePoint;
    private String gradeLetter;
    private double netTotal;

    public MarkSheetBean() {
    }

    public MarkSheetBean(String subjectType, String subjectCode, String subjectName, double mark) {
        this.subjectType = subjectType;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.mark = mark;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }
    
    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    public String getGradeLetter() {
        return gradeLetter;
    }

    public void setGradeLetter(String gradeLetter) {
        this.gradeLetter = gradeLetter;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
    
    
    
}
