package main.java.com.csbl.sms.bean;


public class ClassBean extends AbstractBean{
    private String classId;
    private String className;
    private double monthlyFee;

    public ClassBean() {
    }

    public ClassBean(String classId, double monthlyFee) {
        this.classId = classId;
        this.monthlyFee = monthlyFee;
    }
    
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    
    
}
