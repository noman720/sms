
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.SubjectChoiceBean;

public interface SubjectChoiceManager
{
    public String saveSelectedSubject(SubjectChoiceBean subjectChoiceBean);
    
    public List<SubjectChoiceBean> getStudentList(String className, String session);
    
    public List<String> getAcademicYear(String classId);
    
    public List<String> getStudentIdList(String classId, String academicYear);
    
    public void showSelectedSubjects(String classId, String academicYear);
    
}
