
package main.java.com.csbl.sms.bean;

public class TabulationSheetBean extends AbstractBean implements Comparable<TabulationSheetBean> {
    private int meritPosition;
    private String studentId;
    private String studentName;
    private double totalMark;
    private double gpaWtihoutAdditional;
    private double gpaWithAdditional;
    private String gradeLetter;

    public TabulationSheetBean() {
    }

    public int getMeritPosition() {
        return meritPosition;
    }

    public void setMeritPosition(int meritPosition) {
        this.meritPosition = meritPosition;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public double getGpaWtihoutAdditional() {
        return gpaWtihoutAdditional;
    }

    public void setGpaWtihoutAdditional(double gpaWtihoutAdditional) {
        this.gpaWtihoutAdditional = gpaWtihoutAdditional;
    }

    public double getGpaWithAdditional() {
        return gpaWithAdditional;
    }

    public void setGpaWithAdditional(double gpaWithAdditional) {
        this.gpaWithAdditional = gpaWithAdditional;
    }

    
    public String getGradeLetter() {
        return gradeLetter;
    }

    public void setGradeLetter(String gradeLetter) {
        this.gradeLetter = gradeLetter;
    }

    @Override
    public int compareTo(TabulationSheetBean o) {
        if(new Double(gpaWithAdditional).compareTo(o.gpaWithAdditional)==0) {
            if(new Double(gpaWtihoutAdditional).compareTo(o.gpaWtihoutAdditional)==0) {
                return new Double(totalMark).compareTo( o.totalMark);
            }
            else {
                return new Double(gpaWtihoutAdditional).compareTo( o.gpaWtihoutAdditional);
            }
        }
        
        return new Double(gpaWithAdditional).compareTo( o.gpaWithAdditional);
    }

    
            
}
