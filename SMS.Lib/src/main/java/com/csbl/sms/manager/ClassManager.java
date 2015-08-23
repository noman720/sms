
package main.java.com.csbl.sms.manager;

import java.util.List;
import main.java.com.csbl.sms.bean.ClassBean;

public interface ClassManager 
{
    public String saveTuitionFee(ClassBean classBean);
    public List<ClassBean> getClassList();
    public List<String> getClassName();
    public void showSubjects();
    public void showGroupSubjects();
    
}
