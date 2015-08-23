
package main.java.com.csbl.sms.manager;

import main.java.com.csbl.sms.bean.UserBean;

public interface UserManager {
    
    public String saveUser(UserBean userBean);
    
    public String changePassword(UserBean userBean);
    
    public String getUserByUserIdAndPassword(String userID, String password);
    
    public UserBean getLoginUser();
    
    public void setLoginUser(UserBean user);
}
