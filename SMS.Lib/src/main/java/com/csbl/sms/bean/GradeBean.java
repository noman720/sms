
package main.java.com.csbl.sms.bean;

public class GradeBean extends AbstractBean{
    private double startingMark;
    private double endingMark;
    private String gradeLetter;
    private double gradePoint;

    public GradeBean() {
    }

    public double getStartingMark() {
        return startingMark;
    }

    public void setStartingMark(double startingMark) {
        this.startingMark = startingMark;
    }

    public double getEndingMark() {
        return endingMark;
    }

    public void setEndingMark(double endingMark) {
        this.endingMark = endingMark;
    }

    public String getGradeLetter() {
        return gradeLetter;
    }

    public void setGradeLetter(String gradeLetter) {
        this.gradeLetter = gradeLetter;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }
    
    
}
