
package main.java.com.csbl.sms.manager.impl;

import main.java.com.csbl.sms.bean.ExpenseBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.ExpenseManager;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class ExpenseManagerImpl implements ExpenseManager{
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    
    @Override
    public synchronized String saveExpense(ExpenseBean expenseBean)
    {
        try
        {
            expenseBean.setOid(idGenerator.generateOid());
            String sql = "insert into "+TableName.EXPENSE+" (oid, expenseDate, fieldOfExpense, amount, employeeId, createdBy) values (?, ?, ?, ?, ?, ?)";
            Object[] object = new Object[]{expenseBean.getOid(), expenseBean.getExpenseDate(), expenseBean.getFieldOfExpense(), expenseBean.getAmount(), expenseBean.getEmployeeId(), expenseBean.getCreatedBy()};
            generalDAOSpringJdbc.save(sql, object);           
        }
        catch(Exception e)
        {
            log.error("An Exception occured when save Expense: ", e);
            return "Unable to save Expense";
        }
        return "successful";
    }

    public IDAO getGeneralDAOSpringJdbc() {
        return generalDAOSpringJdbc;
    }

    public void setGeneralDAOSpringJdbc(IDAO generalDAOSpringJdbc) {
        this.generalDAOSpringJdbc = generalDAOSpringJdbc;
    }

    public IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }
    
    
    
}
