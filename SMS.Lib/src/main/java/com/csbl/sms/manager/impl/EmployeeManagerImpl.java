
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.EmployeeBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.exception.SMSDataAccessException;
import main.java.com.csbl.sms.manager.EmployeeManager;
import main.java.com.csbl.sms.util.DatabaseConnection;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.ReportUtil;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class EmployeeManagerImpl implements EmployeeManager{
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    private static Map param = new HashMap();

    @Override
    public synchronized String saveEmployee(EmployeeBean employeeBean)
    {
        try
        {
            employeeBean.setOid(idGenerator.generateOid());
            employeeBean.setEmployeeId(idGenerator.getEmployeeId());

            String sql = "insert into "+TableName.EMPLOYEE+"("
                    + "oid, employeeID, employeeName, fatherName, "
                    + "motherName, gender, maritalStatus, presentAddress, "
                    + "permanentAddress, mobile, emailId, category, "
                    + "position, basicSalary, bloodGroup, birthDate, "
                    + "joinedDate, pictureUrl"
                    + ") values ("
                    + "?, ?, ?, ?, "
                    + "?, ?, ?, ?, "
                    + "?, ?, ?, ?, "
                    + "?, ?, ?, ?, "
                    + "?, ?)";

            Object[] object = new Object[]{
            employeeBean.getOid(), employeeBean.getEmployeeId(), employeeBean.getEmployeeName(), employeeBean.getFatherName(), 
            employeeBean.getMotherName(), employeeBean.getGender(), employeeBean.getMaritalStatus(), employeeBean.getPresentAddress(), 
            employeeBean.getPermanentAddress(), employeeBean.getMobile(), employeeBean.getEmailId(), employeeBean.getCategory(), 
            employeeBean.getPosition(), employeeBean.getBasicSalary(), employeeBean.getBloodGroup(), employeeBean.getBirthDate(), 
            employeeBean.getJoinedDate(), employeeBean.getPictureUrl()
            };
            
            generalDAOSpringJdbc.save(sql, object);
         }catch(Exception e)
         {
            log.error("An Exception occured when save Employee: ", e);
            return "Unable to Save Employee";
         }
         
         return "successful";
    }
    
    
    @Override
    public synchronized List<EmployeeBean> getEmployeeAll()
    {
        List<EmployeeBean> employeeList = new ArrayList<>();
        try
        { 
            String sql = "select employeeId, employeeName, mobile, category, position, bloodGroup, birthDate from "+TableName.EMPLOYEE+" order by employeeID";
            Object [] object = null;
            employeeList = (List<EmployeeBean>) generalDAOSpringJdbc.getObjects(sql, EmployeeBean.class, object);
        }
        catch(NumberFormatException | SMSDataAccessException e)
        {
            log.error("An Exception occured when get Employee List : ", e);
            return employeeList;
        }
        return employeeList;
    }
    
    @Override
    public void showEmployeeList()
    {      
        param.clear();
        String fileSource = "report/employee/EmployeeList.jasper";
        ReportUtil.exportReport(fileSource, DatabaseConnection.getConnection(), param);
    }
    
    @Override
    public void showEmployeeById(String employeeId)
    {      
        param.clear();
        param.put("employeeId", employeeId);
        String fileSource = "report/employee/EmployeeInfo.jasper";
        ReportUtil.exportReport(fileSource, DatabaseConnection.getConnection(), param);
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
