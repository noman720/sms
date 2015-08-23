
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.ClassBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.ClassManager;
import main.java.com.csbl.sms.util.DatabaseConnection;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.ReportUtil;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class ClassManagerImpl implements ClassManager
{
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    private static Map param = new HashMap();
    
    @Override
    public synchronized String saveTuitionFee(ClassBean classBean)
    {
        try
        {
            String sql = "update "+TableName.CLAZZ+" set monthlyFee = ? where classId = ?";
            Object[] object = new Object[]{classBean.getMonthlyFee(), classBean.getClassId()};
            generalDAOSpringJdbc.save(sql, object);
            
           
        }
        catch(Exception e)
        {
            log.error("An Exception occured when save Tuition Fee: ", e);
            return "Unable to save Tuition Fee";
        }
        return "successful";
    }
    
    
    @Override
    public synchronized List<ClassBean> getClassList()
    {
        List<ClassBean> classList = new ArrayList<>();
        try
        {
            String sql = "select * from "+TableName.CLAZZ+" order by oid asc";
            Object [] object = null;
            classList = (List<ClassBean>) generalDAOSpringJdbc.getObjects(sql, ClassBean.class, object);
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Class List : ", e);
            return classList;
        }
        return classList;
    }
    
    @Override
    public synchronized List<String> getClassName()
    {
        List<String> classIdList = new ArrayList<>();
        try
        {
            String sql = "select className from "+TableName.CLAZZ+" order by oid asc";
            Object [] object = null;
            List<ClassBean> classList = (List<ClassBean>) generalDAOSpringJdbc.getObjects(sql, ClassBean.class, object);
            
            for(ClassBean cb : classList)
            {
                classIdList.add(cb.getClassName());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Class List : ", e);
            return classIdList;
        }
        return classIdList;
    }
    
    
    @Override
    public void showSubjects()
    {      
        param.clear();
        String fileSource = "report/subject/Subjects.jasper";
        ReportUtil.exportReport(fileSource, DatabaseConnection.getConnection(), param);
    }
    
    @Override
    public void showGroupSubjects()
    {      
        param.clear();
        String fileSource = "report/subject/GroupSubjects.jasper";
        ReportUtil.exportReport(fileSource, DatabaseConnection.getConnection(), param);
    }

    public IDAO getGeneralDAOSpringJdbc() {
        return generalDAOSpringJdbc;
    }

    public void setGeneralDAOSpringJdbc(IDAO generalDAOSpringJdbc) {
        this.generalDAOSpringJdbc = generalDAOSpringJdbc;
    }

    public IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }
    
    
}
