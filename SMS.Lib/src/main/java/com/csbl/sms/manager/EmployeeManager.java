
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.EmployeeBean;

public interface EmployeeManager {
    
    public String saveEmployee(EmployeeBean employeeBean);
    
    public List<EmployeeBean> getEmployeeAll();
    
    public void showEmployeeList();
    
    public void showEmployeeById(String employeeId);
    
}
