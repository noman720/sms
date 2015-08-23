
package main.java.com.csbl.sms.manager.impl;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import main.java.com.csbl.sms.bean.MarkBean;
import main.java.com.csbl.sms.manager.ExcelSheetManager;
import main.java.com.csbl.sms.util.ExcelSheetConnection;
import org.apache.log4j.Logger;

public class ExcelSheetManagerImpl implements ExcelSheetManager{
    
    private  Logger log = Logger.getLogger(this.getClass());
    
    @Override
    public List<MarkBean> getMarksFromExcelSheet(File file)
    {
        List<MarkBean> markBeans = new ArrayList<>();
        try
        {
            Connection conn = ExcelSheetConnection.getConnection(file);
            if(conn == null)
            {
                return markBeans;
            }
            String sql = "select studentId, mark from [Sheet1$]";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                MarkBean markBean = new MarkBean();
                markBean.setStudentId(rs.getString("studentId"));
                markBean.setMark(rs.getDouble("mark"));
               
                markBeans.add(markBean);
            }
            st.close();
            conn.close();
            
            
        }
        catch(Exception e)
        {
            log.error("An Exception occured when getMarks from Excel Sheet: ", e);
        }
        
        return markBeans;
    }
}
