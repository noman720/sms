
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.CommitResultBean;
import main.java.com.csbl.sms.bean.MarkSheetBean;
import main.java.com.csbl.sms.bean.TabulationSheetBean;
import main.java.com.csbl.sms.bean.TranscriptBean;

public interface ResultManager {
    
    public String setCommitResult(CommitResultBean commitResultBean);
    
    public boolean isCommitedResult(CommitResultBean commitResultBean);
    
    public TranscriptBean getResult(TranscriptBean resultBean);
    
    public List<MarkSheetBean> getMarkSheet(String classId, String studentId, String examYear, String examName);
    
    public List<TabulationSheetBean> getTebulationSheet(String classId, String examYear, String examName);
    
    public List<String> getStudentId(String classId, String examYear, String examName);
    
    public void showTranscript(TranscriptBean transcriptBean);
    
    public void showTabulationSheet(List<TabulationSheetBean> tabulationSheetBeans, String classId, String examName, String examYear);
    
}
