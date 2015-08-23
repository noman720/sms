package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.MarkBean;

public interface MarkEntryManager
{
    public String saveMarks(List<MarkBean> markBeanList, String classId, String markType, String examYear, String examName, String subjectCode);
    public List<MarkBean> getStudentList(MarkBean markBean, String classId);
    public List<String> getExamYear(String classId);
    public List<String> getExamName(String classId, String examYear);
    public List<String> getSubjectCode(String classId, String examYear, String examName);
}
