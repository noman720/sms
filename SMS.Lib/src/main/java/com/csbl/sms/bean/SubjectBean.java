
package main.java.com.csbl.sms.bean;

public class SubjectBean extends AbstractBean
{
    private String classId;
    private String subjectType;
    private String subjectCode;
    private String subjectName;
    private int groupStatus;
    private String groupCode;
    private String groupName;

    public SubjectBean(String classId, String subjectType, String subjectCode, String subjectName, int groupStatus) {
        this.classId = classId;
        this.subjectType = subjectType;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.groupStatus = groupStatus;
    }

    public SubjectBean(String classId, String subjectCode, int groupStatus, String groupCode, String groupName) {
        this.classId = classId;
        this.subjectCode = subjectCode;
        this.groupStatus = groupStatus;
        this.groupCode = groupCode;
        this.groupName = groupName;
    }
    
    
    
    
    public SubjectBean() {
    } 

    @Override
    public String getOid() {
        return oid;
    }

    @Override
    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

   
    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(int groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

      
    
}
