
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.bean.TabulationSheetBean;

public interface YearChangeManager {
   
    public String saveStudent(List<TabulationSheetBean> tabulationSheetBeans, StudentBean studentBean);
    
    public List<TabulationSheetBean> getUnregistedStudentList(List<TabulationSheetBean> tabulationSheetBeans, String classId, String academicYear);
}
