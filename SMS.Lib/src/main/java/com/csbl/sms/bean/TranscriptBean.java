
package main.java.com.csbl.sms.bean;

import java.util.List;

public class TranscriptBean extends AbstractBean{

    private String studentId;
    private String studentName;
    private String fatherName;
    private String motherName;
    private String birthDate;
    private String academicYear;
    private String classId;
    private String medium;
    private String group;
    private String section;
    private String shift;
    private String type;
    private int classRoll;
    private String examYear;
    private String examName;
    private double GPAwithAdditional;
    private double GPAwithoutAdditional;
    private List<MarkSheetBean> marksList;

    public TranscriptBean() {
    }

    
    @Override
    public String getOid() {
        return oid;
    }

    @Override
    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getClassRoll() {
        return classRoll;
    }

    public void setClassRoll(int classRoll) {
        this.classRoll = classRoll;
    }

    
    public String getExamYear() {
        return examYear;
    }

    public void setExamYear(String examYear) {
        this.examYear = examYear;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public double getGPAwithAdditional() {
        return GPAwithAdditional;
    }

    public void setGPAwithAdditional(double GPAwithAdditional) {
        this.GPAwithAdditional = GPAwithAdditional;
    }

    public double getGPAwithoutAdditional() {
        return GPAwithoutAdditional;
    }

    public void setGPAwithoutAdditional(double GPAwithoutAdditional) {
        this.GPAwithoutAdditional = GPAwithoutAdditional;
    }

    public List<MarkSheetBean> getMarksList() {
        return marksList;
    }

    public void setMarksList(List<MarkSheetBean> marksList) {
        this.marksList = marksList;
    }

    
}
