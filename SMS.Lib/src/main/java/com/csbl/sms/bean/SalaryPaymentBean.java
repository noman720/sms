
package main.java.com.csbl.sms.bean;

public class SalaryPaymentBean extends AbstractBean
{
    private String moneyReceiptNo;
    private String employeeId;
    private String employeeName;
    private String paymentMonth;
    private String paymentYear;
    private int totalMonth;
    private Double basicSalary;
    private Double bonus;
    private double paidAmount;
    private double dueAmount;
    private String paymentDate;
    private String createdBy;

    public SalaryPaymentBean() {
    }

    public SalaryPaymentBean(String employeeId, String paymentMonth, String paymentYear, int totalMonth, Double basicSalary, Double bonus, double paidAmount, double dueAmount, String paymentDate, String createdBy) {
        this.employeeId = employeeId;
        this.paymentMonth = paymentMonth;
        this.paymentYear = paymentYear;
        this.totalMonth = totalMonth;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.paidAmount = paidAmount;
        this.dueAmount = dueAmount;
        this.paymentDate = paymentDate;
        this.createdBy = createdBy;
    }

    public String getMoneyReceiptNo() {
        return moneyReceiptNo;
    }

    public void setMoneyReceiptNo(String moneyReceiptNo) {
        this.moneyReceiptNo = moneyReceiptNo;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
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

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    
    

}
