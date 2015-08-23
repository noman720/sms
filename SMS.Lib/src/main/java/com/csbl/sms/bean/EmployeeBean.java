
package main.java.com.csbl.sms.bean;

public class EmployeeBean extends AbstractBean
{
    private String employeeId;
    private String employeeName;
    private String fatherName;
    private String motherName;
    private String gender;
    private String maritalStatus;
    private String presentAddress;
    private String permanentAddress;
    private String mobile;
    private String emailId;
    private String category;
    private String position;
    private Double basicSalary;
    private String bloodGroup;
    private String birthDate;
    private String joinedDate;
    private String resignDate;
    private String pictureUrl;

    public EmployeeBean() {
    }

    public EmployeeBean(String employeeId, String employeeName, String fatherName, String motherName, String gender, String maritalStatus, String presentAddress, String permanentAddress, String mobile, String emailId, String category, String position, Double basicSalary, String bloodGroup, String birthDate, String joinedDate, String pictureUrl) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.mobile = mobile;
        this.emailId = emailId;
        this.category = category;
        this.position = position;
        this.basicSalary = basicSalary;
        this.bloodGroup = bloodGroup;
        this.birthDate = birthDate;
        this.joinedDate = joinedDate;
        this.pictureUrl = pictureUrl;
    }
    
    
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    
    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getResignDate() {
        return resignDate;
    }

    public void setResignDate(String resignDate) {
        this.resignDate = resignDate;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    
    
}
