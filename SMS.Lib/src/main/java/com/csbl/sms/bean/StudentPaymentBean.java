
package main.java.com.csbl.sms.bean;

public class StudentPaymentBean extends AbstractBean{
    private String moneyReceiptNo;
    private String classId;
    private String studentId;
    private String paymentMonth;
    private String paymentYear;
    private int totalMonth;
    private double totalAmount;
    private double paidAmount;
    private double dueAmount;
    private String paidDate;
    private String createdBy;

    public StudentPaymentBean(String classId, String studentId, String paymentMonth, String paymentYear, int totalMonth, double totalAmount, double paidAmount, double dueAmount, String paidDate, String createdBy) {
        this.classId = classId;
        this.studentId = studentId;
        this.paymentMonth = paymentMonth;
        this.paymentYear = paymentYear;
        this.totalMonth = totalMonth;
        this.totalAmount = totalAmount;
        this.paidAmount = paidAmount;
        this.dueAmount = dueAmount;
        this.paidDate = paidDate;
        this.createdBy = createdBy;
    }

    
    public StudentPaymentBean() {
    }

    public String getMoneyReceiptNo() {
        return moneyReceiptNo;
    }

    public void setMoneyReceiptNo(String moneyReceiptNo) {
        this.moneyReceiptNo = moneyReceiptNo;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(String paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    public String getPaymentYear() {
        return paymentYear;
    }

    public void setPaymentYear(String paymentYear) {
        this.paymentYear = paymentYear;
    }

    public int getTotalMonth() {
        return totalMonth;
    }

    public void setTotalMonth(int totalMonth) {
        this.totalMonth = totalMonth;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    
    
}
