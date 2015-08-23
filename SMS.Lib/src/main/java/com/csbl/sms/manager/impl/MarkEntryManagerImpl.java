
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.List;
import main.java.com.csbl.sms.bean.MarkBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.MarkEntryManager;
import main.java.com.csbl.sms.util.IdGenerator;
import org.apache.log4j.Logger;

public class MarkEntryManagerImpl implements MarkEntryManager
{
    private  Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    
    @Override
    public synchronized String saveMarks(List<MarkBean> markBeanList, String classId, String markType, String examYear, String examName, String subjectCode)
    {
        try
            {
                String sql = "update t_result_"+classId+" set "+markType+"= :mark where studentId = :studentId and examYear = '"+examYear+"' and examName = '"+examName+"' and subjectCode = '"+subjectCode+"'";
                generalDAOSpringJdbc.saveList(sql, markBeanList);
                    
            }catch(Exception e){
                log.error("An Exception occured when save Mark : ", e);
                return "Unable to Save mark for StudentId";
            }
            
        return "successful";
    }
    
    
    @Override
    public synchronized List<MarkBean> getStudentList(MarkBean markBean, String classId)
    {
        List<MarkBean> studentList = new ArrayList<>();
        try
        {
            
            String sql = "select res.studentID, classRoll, studentName, "+markBean.getMarkType()+" as mark "
                    + "from t_result_"+classId+" res, t_studentacademicinfo sa, t_studentpersonalinfo sp "
                    + "where res.studentId = sa.studentId and sa.studentId = sp.studentId and examYear = ? and examName = ? and subjectCode = ? "
                    + "order by classRoll asc";
            Object [] object = new Object[]{markBean.getExamYear(), markBean.getExamName(), markBean.getSubjectCode()};
            studentList = (List<MarkBean>) generalDAOSpringJdbc.getObjects(sql, MarkBean.class, object);
            
        }catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Student List for Mark Entry: ", e);
            return studentList;
        }
        return studentList;
    }
    
    @Override
    public synchronized List<String> getExamYear(String classId)
    {
        List<String> examYearList = new ArrayList<>();
        try
        {
            String sql = "select distinct examYear from t_result_"+classId+" order by examYear desc";
            Object [] object = null;
            List<MarkBean> yearList = (List<MarkBean>) generalDAOSpringJdbc.getObjects(sql, MarkBean.class, object);
            
            for(MarkBean mb : yearList)
            {
                examYearList.add(mb.getExamYear());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Subject List : ", e);
            return examYearList;
        }
        return examYearList;
    }
    
    @Override
    public synchronized List<String> getExamName(String classId, String examYear)
    {
        List<String> examNameList = new ArrayList<>();
        try
        {
            String sql = "select distinct examName from t_result_"+classId+" where examYear = ?";
            Object [] object = new Object[]{examYear};
            List<MarkBean> nameList = (List<MarkBean>) generalDAOSpringJdbc.getObjects(sql, MarkBean.class, object);
            
            for(MarkBean mb : nameList)
            {
                examNameList.add(mb.getExamName());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Subject List : ", e);
            return examNameList;
        }
        return examNameList;
    }
    
    @Override
    public synchronized List<String> getSubjectCode(String classId, String examYear, String examName)
    {
        List<String> subjectList = new ArrayList<>();
        try
        {
            String sql = "select distinct subjectCode from t_result_"+classId+" where examYear = ? and examName = ? order by subjectCode";
            Object [] object = new Object[]{examYear, examName};
            List<MarkBean> subjects = (List<MarkBean>) generalDAOSpringJdbc.getObjects(sql, MarkBean.class, object);
            
            for(MarkBean mb : subjects)
            {
                subjectList.add(mb.getSubjectCode());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get Subject List : ", e);
            return subjectList;
        }
        return subjectList;
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
