
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.ExamBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.ExamManager;
import main.java.com.csbl.sms.util.DatabaseConnection;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.ReportUtil;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class ExamManagerImpl implements ExamManager
{
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    private static Map param = new HashMap();
    
    @Override
    public String saveExam(ExamBean examBean)
    {
        try
        {
            examBean.setOid(idGenerator.generateOid());
            String sql = "insert into "+TableName.EXAM+" (oid, classId, examName) values (?, ?, ?)";
            Object[] object = new Object[]{examBean.getOid(), examBean.getClassId(), examBean.getExamName()};
            generalDAOSpringJdbc.save(sql, object);
            
        }catch(Exception e){
            log.error("An Exception occured when save Exam: ", e);
            return "Unable to save Exam";
        }
        return "successful";
    }
    
    
    @Override
    public List<ExamBean> getExamList(String classId)
    {
        List<ExamBean> examList = new ArrayList<>();
        try
        {
                        
            String sql = "select classId, examName from "+TableName.EXAM+" where classId = ?";
            Object [] object = new Object[]{classId};
            examList = (List<ExamBean>) generalDAOSpringJdbc.getObjects(sql, ExamBean.class, object);
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Exam List : ", e);
            return examList;
        }
        return examList;
    }
    
    @Override
    public List<String> getExamNameList(String classId)
    {
        List<String> examNameList = new ArrayList<>();
        try
        {
            String sql = "select examName from "+TableName.EXAM+" where classId = ? order by oid asc";
            Object [] object = new Object[]{classId};
            List<ExamBean> examList = (List<ExamBean>) generalDAOSpringJdbc.getObjects(sql, ExamBean.class, object);
            
            for(ExamBean cb : examList)
            {
                examNameList.add(cb.getExamName());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Exam List : ", e);
            return examNameList;
        }
        return examNameList;
    }
    
    @Override
    public void showExams()
    {      
        param.clear();
        String fileSource = "report/exam/Exams.jasper";
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
