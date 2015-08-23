
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.SubjectBean;

public interface SubjectManager
{
    public String saveSubject(SubjectBean subjectBean);
    
    public String saveGroupSubject(SubjectBean subjectBean);
    
    public List<SubjectBean> getSubjectList(String className);
    
    public List<String> getSubjectCodeListByClassId(String classId);
    
    public List<SubjectBean> getSubjectGroupList(String classId);
}
