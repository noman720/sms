
package main.java.com.csbl.sms.bean;

public class UserBean extends AbstractBean{

    private String fullName;
    private String userName;
    private String roleName;
    private String password;
    private String mobile;
    private String emailId;
    private String address;
    private String verificationCode;

    public UserBean(String fullName, String userName, String roleName, String password, String mobile, String emailId, String address, String verificationCode) {
        this.fullName = fullName;
        this.userName = userName;
        this.roleName = roleName;
        this.password = password;
        this.mobile = mobile;
        this.emailId = emailId;
        this.address = address;
        this.verificationCode = verificationCode;
    }

    
    public UserBean() {
    }

    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    
    
}
