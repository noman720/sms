
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.PrepareBillBean;
import main.java.com.csbl.sms.bean.SalaryPaymentBean;
import main.java.com.csbl.sms.bean.StudentPaymentBean;

public interface PaymentManger {
    
    public String saveStudentPayment(StudentPaymentBean spb);
    
    public List<StudentPaymentBean> getStudetsPaymentByClass(String classId, String paymentYear);
    
    public double getMonthlyFee(String classId);
    
    public SalaryPaymentBean getSalaryInfoByEmployeeId(String employeeId);
    
    public String saveSalaryPayment(SalaryPaymentBean spb);
    
    public List<SalaryPaymentBean> getPaidSalaryList(String paymentYear);
    
    public List<PrepareBillBean> getAmountDescription(PrepareBillBean pbb);
    
    public String savePreparedBill(List<PrepareBillBean> pbbList);
    
    public List<PrepareBillBean> getPreparedBill(String billNo);
}
