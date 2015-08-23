
package main.java.com.csbl.sms.manager;

import main.java.com.csbl.sms.bean.StudentTransactionBean;

public interface TransactionManager {

    public String saveTransaction(StudentTransactionBean stb);
    
    public double getPayableAmout(String studentId, String billNo);
}
