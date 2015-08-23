
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.List;
import main.java.com.csbl.sms.bean.PrepareBillBean;
import main.java.com.csbl.sms.bean.SalaryPaymentBean;
import main.java.com.csbl.sms.bean.StudentPaymentBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.PaymentManger;
import main.java.com.csbl.sms.util.Constrant;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class PaymentManagerImpl implements PaymentManger, Constrant{
    
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    
    @Override
    public synchronized String saveStudentPayment(StudentPaymentBean spb)
    {
        try
        {
            String oid = idGenerator.generateOid();
            String moneyReceiptNo = idGenerator.getMoneyReceiptNo(spb.getClassId());
            String sql = "insert into t_studentpayment ("
                    + "oid, moneyReceiptNo, classId, studentId, "
                    + "paymentMonth, paymentYear, totalMonth, "
                    + "totalAmount, paidAmount, dueAmount, "
                    + "paidDate, createdBy"
                    + ") values ("
                    + "?, ?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?)";
            
            Object [] object = new Object[]{
                oid, moneyReceiptNo, spb.getClassId(), spb.getStudentId(), 
                spb.getPaymentMonth(), spb.getPaymentYear(), spb.getTotalMonth(), 
                spb.getTotalAmount(), spb.getPaidAmount(), spb.getDueAmount(), 
                spb.getPaidDate(), spb.getCreatedBy()
            };
            generalDAOSpringJdbc.save(sql, object);           
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when save Student payment : ", e);
            return "Unable to Save Student Payment";
        }
        return "successful";
    }
    
    @Override
    public synchronized List<StudentPaymentBean> getStudetsPaymentByClass(String classId, String paymentYear)
    {
        List<StudentPaymentBean> studentList = new ArrayList<>();
        
        try
        {
            String sql = "select * from t_studentpayment where classId = ? and paymentYear = ?";
            Object [] object = new Object[]{classId, paymentYear};
            studentList = (List<StudentPaymentBean>) generalDAOSpringJdbc.getObjects(sql,StudentPaymentBean.class ,object);           
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get StudentList of Payment : ", e);
            return studentList;
        }
        return studentList;
    }
    
    
    
    @Override
    public synchronized double getMonthlyFee(String classId)
    {
        double monthlyFee = 0.0;
        try
        {
            String sql = "select monthlyFee from t_classes where classId = ?";
            Object [] object = new Object[]{classId};
            monthlyFee = (double) generalDAOSpringJdbc.getObject(sql, object);           
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Student monthlyFee : ", e);
            return monthlyFee;
        }
        return monthlyFee;
    }
    
    @Override
    public synchronized List<PrepareBillBean> getAmountDescription(PrepareBillBean pbb)
    {
        List<PrepareBillBean> billDescriptionList = new ArrayList<>();
        try
        {
            String sql = "select '"+pbb.getClassId()+"' as 'classId','"+pbb.getBillNo()+"' as 'billNo', '"+pbb.getBillMonth()+"' as 'billMonth', "
            + pbb.getBillYear()+" as 'billYear', '"+pbb.getMonthDate()+"' as 'monthDate', "
            + "billDescription, billAmount"
            + " from "+TableName.AMOUNT_DESCRIPTION
            + " where ((classId = ?"
            + " and isCommon = '"+NO+"')"
            + " or isCommon = '"+YES+"') and descriptionStatus = '"+ACTIVE+"'"
            + " order by billDescription";
            Object [] object = new Object[]{pbb.getClassId()};
            billDescriptionList = (List<PrepareBillBean>) generalDAOSpringJdbc.getObjects(sql,PrepareBillBean.class ,object);           
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Bill Description : ", e);
            return billDescriptionList;
        }
        
        return billDescriptionList;
    }
    
    @Override
    public synchronized String savePreparedBill(List<PrepareBillBean> pbbList)
    {
        try
        {
            for(int i=0; i<pbbList.size(); i++)
            {
                pbbList.get(i).setOid(idGenerator.generateOid());
            }
            
            String sql = "insert into "+TableName.BILL+"(oid, classId, billNo, "
                    + "billDescription, billMonth, billYear, "
                    + "monthDate, billAmount"
                    + ") values ("
                    + ":oid, :classId, :billNo, "
                    + ":billDescription, :billMonth, :billYear, "
                    + ":monthDate, :billAmount)";
            generalDAOSpringJdbc.saveList(sql, pbbList);
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when save Prepared Bill : ", e);
            return "Unable to Save Bill";
        }
        return "successful";
    }
    
    @Override
    public synchronized List<PrepareBillBean> getPreparedBill(String billNo)
    {
        List<PrepareBillBean> billDescriptionList = new ArrayList<>();
        try
        {
            String sql = "select * from "+TableName.BILL+" where billNo = ? order by billDescription";
            Object [] object = new Object[]{billNo};
            billDescriptionList = (List<PrepareBillBean>) generalDAOSpringJdbc.getObjects(sql,PrepareBillBean.class ,object);           
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Prepared Bill : ", e);
            return billDescriptionList;
        }
        
        return billDescriptionList;
    }
    
    
    
    @Override
    public synchronized String saveSalaryPayment(SalaryPaymentBean spb)
    {
        try
        {
            String oid = idGenerator.generateOid();
            String moneyReceiptNo = idGenerator.getSalaryReceiptNo();
            String sql = "insert into "+TableName.EMP_SALARY+" ("
                    + "oid, moneyReceiptNo, employeeId, "
                    + "paymentMonth, paymentYear, totalMonth, "
                    + "basicSalary, bonus, paidAmount, "
                    + "dueAmount, paymentDate, createdBy"
                    + ") values ("
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?, ?)";
            
            Object [] object = new Object[]{
                oid, moneyReceiptNo, spb.getEmployeeId(),
                spb.getPaymentMonth(), spb.getPaymentYear(), spb.getTotalMonth(), 
                spb.getBasicSalary(), spb.getBonus(), spb.getPaidAmount(),  
                spb.getDueAmount(), spb.getPaymentDate(), spb.getCreatedBy()
            };
            generalDAOSpringJdbc.save(sql, object);           
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when save Salary payment : ", e);
            return "Unable to Save Salary Payment";
        }
        return "successful";
    }
    
    @Override
    public synchronized SalaryPaymentBean getSalaryInfoByEmployeeId(String employeeId)
    {
        SalaryPaymentBean spb = new SalaryPaymentBean();
        try
        {
            String sql = "select employeeName, basicSalary from "+TableName.EMPLOYEE+" where employeeId = ?";
            Object [] object = new Object[]{employeeId};
            spb = (SalaryPaymentBean) generalDAOSpringJdbc.getObjectBean(sql, SalaryPaymentBean.class, object);           
        }
        catch(Exception e)
        {
            return spb;
        }
        return spb;
    }
    
    
    @Override
    public synchronized List<SalaryPaymentBean> getPaidSalaryList(String paymentYear)
    {
        List<SalaryPaymentBean> employeeList = new ArrayList<>();
        
        try
        {
            String sql = "select * from "+TableName.EMP_SALARY+" where paymentYear = ? order by paymentDate desc";
            Object [] object = new Object[]{paymentYear};
            employeeList = (List<SalaryPaymentBean>) generalDAOSpringJdbc.getObjects(sql,SalaryPaymentBean.class ,object);           
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get EmployeeList of Payment : ", e);
            return employeeList;
        }
        return employeeList;
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
