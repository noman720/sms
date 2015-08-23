
package main.java.com.csbl.sms.util;

import java.util.HashMap;
import java.util.Map;
import main.java.com.csbl.sms.bean.TranscriptBean;


public class ShowReport {
    
    private static Map param = new HashMap();
    public static void showQuotation(TranscriptBean resultBean) {
        param.clear();
        param.put("studentId", resultBean.getStudentId());
        param.put("examName", resultBean.getExamName());
        param.put("examYear", resultBean.getExamYear());
        param.put("GPAWithoutAdd", resultBean.getGPAwithoutAdditional());
        param.put("GPAWithAdd", resultBean.getGPAwithAdditional());
        String fileSource = "com/csbl/sms/report/classic_landscape.jasper";
        ReportUtil.exportReportJavaBean(fileSource, DatabaseConnection.getConnection(), param, resultBean.getMarksList());
    }
    
    public static void showDemo() {
        param.clear();
        String fileSource = "com/csbl/sms/report/TestReportFor4_5_1.jasper";
        ReportUtil.exportReport(fileSource, DatabaseConnection.getConnection(), param);
    }
}
