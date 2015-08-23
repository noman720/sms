
package main.java.com.csbl.sms.bean;

public class StudentTransactionBean {
    private String oid;
    private String classId;
    private int academicYear;
    private String studentId;
    private String billNo;
    private String transactionType;
    private String transactionDescription;
    private double previousAmount;
    private double receivedAmount;
    private double dueAmount;
    private String transactionDate;
    private String createdDate;
    private String createdBy;

    public StudentTransactionBean(String classId, int academicYear, String studentId, String billNo, String transactionType, String transactionDescription, double previousAmount, double receivedAmount, double dueAmount, String transactionDate, String createdBy) {
        this.classId = classId;
        this.academicYear = academicYear;
        this.studentId = studentId;
        this.billNo = billNo;
        this.transactionType = transactionType;
        this.transactionDescription = transactionDescription;
        this.previousAmount = previousAmount;
        this.receivedAmount = receivedAmount;
        this.dueAmount = dueAmount;
        this.transactionDate = transactionDate;
        this.createdBy = createdBy;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public double getPreviousAmount() {
        return previousAmount;
    }

    public void setPreviousAmount(double previousAmount) {
        this.previousAmount = previousAmount;
    }

    public double getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    
    
    
}
