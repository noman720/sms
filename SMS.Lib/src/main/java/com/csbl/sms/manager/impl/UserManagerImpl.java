
package main.java.com.csbl.sms.manager.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.csbl.sms.bean.UserBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.UserManager;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.PasswordUtil;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class UserManagerImpl implements UserManager{
    private final Map<String, UserBean> sessions = new ConcurrentHashMap<>();
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    
    @Override
    public synchronized String saveUser(UserBean userBean)
    {
        try
        {
            userBean.setOid(idGenerator.generateOid());
            userBean.setPassword(PasswordUtil.encrypt(userBean.getPassword()));
            String sql = "insert into "+TableName.USER+" ("
                    + "oid, fullName, userName, "
                    + "roleName, password, mobile, "
                    + "emailId, address, verificationCode"
                    + ") values ("
                    + "?, ?, ?, "
                    + "?, ?, ?, "
                    + "?, ?, ?)";
            Object [] object = new Object[]{
                userBean.getOid(), userBean.getFullName(), userBean.getUserName(), 
                userBean.getRoleName(), userBean.getPassword(), userBean.getMobile(), 
                userBean.getEmailId(), userBean.getAddress(), userBean.getVerificationCode()
            };
            generalDAOSpringJdbc.save(sql, object);
            
        }
        catch(Exception e)
        {
            log.error("An Exception occured when change password : "+e);
            return "Faild to Save User";
        }
        
        return "Success";
    }
    
    
    @Override
    public synchronized String changePassword(UserBean userBean)
    {
        try
        {
            String password = PasswordUtil.encrypt(userBean.getPassword());
            String sql = "update "+TableName.USER+" set password = ? where userName = ?";
            Object [] object = new Object[]{password, userBean.getUserName()};
            generalDAOSpringJdbc.save(sql, object);
            
            setLoginUser(userBean);
        }
        catch(Exception e)
        {
            log.error("An Exception occured when change password : "+e);
            return "Faild to Change Password";
        }
        
        return "Success";
    }
    
    @Override
    public String getUserByUserIdAndPassword(String userName, String password)
    {
        try
        {
            password = PasswordUtil.encrypt(password);
            String sql = "select * from "+TableName.USER+" where userName = ?";
            Object [] object = new Object[]{userName};
            UserBean userBean = (UserBean) generalDAOSpringJdbc.getObjectBean(sql, UserBean.class, object);
            if(userBean == null || !userName.equals(userBean.getUserName()))
            {
                return "Invalid User Name";
            }
            
            if(!userBean.getPassword().equals(password))
            {
                return "Unable to login";
            }
            
            sessions.clear();
            userBean.setPassword(PasswordUtil.decrypt(password));
            sessions.put("loginId", userBean);
            return "Success";
        }
        catch(Exception e)
        {
            log.error("An Exception occured when get user by userid and password : "+e);
            return "Incorrect User Name or Password";
        }
    }
    
    
    
    @Override
    public UserBean getLoginUser()
    {
        return sessions.get("loginId");
    }
    
    @Override
    public void setLoginUser(UserBean user) {
        sessions.clear();
        sessions.put("loginId", user);
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
