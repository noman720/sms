
package main.java.com.csbl.sms.manager;

import java.io.File;
import java.util.List;
import main.java.com.csbl.sms.bean.MarkBean;

public interface ExcelSheetManager {
    
    public List<MarkBean> getMarksFromExcelSheet(File file);
}
