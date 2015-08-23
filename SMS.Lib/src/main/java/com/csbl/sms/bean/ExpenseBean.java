
package main.java.com.csbl.sms.bean;

public class ExpenseBean extends AbstractBean{
    private String expenseDate;
    private String fieldOfExpense;
    private double amount;
    private String employeeId;
    private String createdBy;

    public ExpenseBean() {
    }

    public ExpenseBean(String expenseDate, String fieldOfExpense, double amount, String employeeId, String createdBy) {
        this.expenseDate = expenseDate;
        this.fieldOfExpense = fieldOfExpense;
        this.amount = amount;
        this.employeeId = employeeId;
        this.createdBy = createdBy;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getFieldOfExpense() {
        return fieldOfExpense;
    }

    public void setFieldOfExpense(String fieldOfExpense) {
        this.fieldOfExpense = fieldOfExpense;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    
}
