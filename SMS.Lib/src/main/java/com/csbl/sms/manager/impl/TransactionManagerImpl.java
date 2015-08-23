
package main.java.com.csbl.sms.manager.impl;

import com.app.dal.spring.dao.SpringJdbcDao;
import com.app.util.ParamUtil;
import com.app.util.SQLBuilder;
import main.java.com.csbl.sms.bean.StudentTransactionBean;
import main.java.com.csbl.sms.manager.TransactionManager;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class TransactionManagerImpl implements TransactionManager{

    private Logger log = Logger.getLogger(this.getClass());
    private IdGenerator idGenerator;
    private SpringJdbcDao springJdbcDao;
    

    @Override
    public synchronized String saveTransaction(StudentTransactionBean stb)
    {
        stb.setOid(idGenerator.generateOid());
        try{
            String sqlClass = SQLBuilder.getInsert(stb, TableName.STD_TRANSACTION);
            Object[] params = ParamUtil.getParams(stb);
            springJdbcDao.saveObject(sqlClass, params);
            }
        catch(Exception e)
        {
            log.error("An Exception occured while create Transaction for Student ID : " , e);
            return "Unable to Save Transaction";
        }
        
        return "successful";
    }
    
    @Override
    public synchronized double getPayableAmout(String studentId, String billNo)
    {
        double payableAmount = 0;
        try
        {
             String sql = "select ifnull(a.billAmount - b.receivedAmount, 0) as payableAmount"
            + " from ("
            + " select ifnull(sum(billAmount), 0) as billAmount"
            + " from "+TableName.BILL
            + " where billNo = ?) a,"
            + " (select ifnull(sum(receivedAmount), 0) as receivedAmount"
            + " from "+TableName.STD_TRANSACTION
            + " where studentId = ?"
            + " and billNo = ?"
            + " order by createdDate desc "
            + " limit 0,1) b";
            Object [] objcet = new Object[]{billNo, studentId, billNo};
            payableAmount = (double) springJdbcDao.count(sql, objcet);
            
        }
        catch(Exception e)
        {
            log.error("An Exception occured while get Payable Amount for Student ID - "+ studentId , e);
        }
        return payableAmount;
    }
    
    

    public SpringJdbcDao getSpringJdbcDao() {
        return springJdbcDao;
    }

    public void setSpringJdbcDao(SpringJdbcDao springJdbcDao) {
        this.springJdbcDao = springJdbcDao;
    }
  
    public IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }
    
    
    
}
