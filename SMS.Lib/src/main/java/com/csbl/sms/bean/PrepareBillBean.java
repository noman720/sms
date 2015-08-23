
package main.java.com.csbl.sms.bean;

public class PrepareBillBean extends AbstractBean{
    private String classId;
    private String billNo;
    private String billDescription;
    private String billMonth;
    private int billYear;
    private String monthDate;
    private double billAmount;
    private String createdDate;

    public PrepareBillBean() {
    }

    public PrepareBillBean(String classId, String billNo, String billMonth, int billYear, String monthDate) {
        this.classId = classId;
        this.billNo = billNo;
        this.billMonth = billMonth;
        this.billYear = billYear;
        this.monthDate = monthDate;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    public int getBillYear() {
        return billYear;
    }

    public void setBillYear(int billYear) {
        this.billYear = billYear;
    }

    public String getMonthDate() {
        return monthDate;
    }

    public void setMonthDate(String monthDate) {
        this.monthDate = monthDate;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    
    
    
}
