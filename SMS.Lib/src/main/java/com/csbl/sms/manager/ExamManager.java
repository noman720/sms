
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.ExamBean;

public interface ExamManager 
{
    public String saveExam(ExamBean examBean);
    public List<ExamBean> getExamList(String className);
    public List<String> getExamNameList(String classId);
    public void showExams();
}
