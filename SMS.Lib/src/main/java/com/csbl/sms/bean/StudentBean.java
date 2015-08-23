
package main.java.com.csbl.sms.bean;

public class StudentBean extends AbstractBean
{
    private String studentID;
    private String studentName;
    private String fatherName;
    private String motherName;
    private String presentAddress;
    private String permanentAddress;
    private String mobileNo;
    private String email;
    private String gender;
    private String studentGroup;
    private String studentType;
    private String medium;
    private String academicYear;
    private String shift;
    private String classId;
    private String sectionName;
    private int classRoll;
    private String blooldGroup;
    private String birthDate;
    private String pictureurl;

    public StudentBean(String studentID, String studentName, String fatherName, String motherName, String presentAddress, String permanentAddress, String mobileNo, String email, String gender, String studentGroup, String studentType, String medium, String academicYear, String shift, String classId, String section, int classRoll, String bloodGroup, String birthDate, String pictureurl) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.mobileNo = mobileNo;
        this.email = email;
        this.gender = gender;
        this.studentGroup = studentGroup;
        this.studentType = studentType;
        this.medium = medium;
        this.academicYear = academicYear;
        this.shift = shift;
        this.classId = classId;
        this.sectionName = section;
        this.classRoll = classRoll;
        this.blooldGroup = bloodGroup;
        this.birthDate = birthDate;
        this.pictureurl = pictureurl;
    }

    
    public StudentBean() {
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getClassRoll() {
        return classRoll;
    }

    public void setClassRoll(int classRoll) {
        this.classRoll = classRoll;
    }

    
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl;
    }

    public String getBlooldGroup() {
        return blooldGroup;
    }

    public void setBlooldGroup(String blooldGroup) {
        this.blooldGroup = blooldGroup;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    
    
    
    
}
