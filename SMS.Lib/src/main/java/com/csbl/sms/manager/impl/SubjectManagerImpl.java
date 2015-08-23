
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.List;
import main.java.com.csbl.sms.bean.SubjectBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.SubjectManager;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class SubjectManagerImpl implements SubjectManager
{
    private  Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    @Override
    public String saveSubject(SubjectBean subjectBean)
    {
        try
        {
            subjectBean.setOid(idGenerator.generateOid());
            String sql = "insert into "+TableName.SUBJECT+" (oid, classID, subjectCode, subjectName, groupStatus, subjectType) values (?, ?, ?, ?, ?, ?)";
            Object[] object = new Object[]{subjectBean.getOid(), subjectBean.getClassId(), subjectBean.getSubjectCode(), subjectBean.getSubjectName(), subjectBean.getGroupStatus(), subjectBean.getSubjectType()};
            generalDAOSpringJdbc.save(sql, object);
            
        }catch(Exception e){
            log.error("An Exception occured when save Subject: ", e);
            return "Unable to Save Subject";
        }
        return "successful";
    }
    
    @Override
    public String saveGroupSubject(SubjectBean subjectBean)
    {
        try
        {
            subjectBean.setOid(idGenerator.generateOid());
            String sqlOne = "update "+TableName.SUBJECT+" set groupStatus =?, groupCode =? , groupName =? where subjectCode =? ";
            Object[] objectOne = new Object[]{ subjectBean.getGroupStatus(),subjectBean.getGroupCode(),subjectBean.getGroupName(), subjectBean.getSubjectCode()};
            generalDAOSpringJdbc.save(sqlOne, objectOne);
            
            String sqlTwo = "update "+TableName.SUBJECT+" set groupStatus =?, groupCode =? , groupName =? where subjectCode =? ";
            Object[] objectTwo = new Object[]{ subjectBean.getGroupStatus(),subjectBean.getSubjectCode(),subjectBean.getGroupName(),subjectBean.getGroupCode()};
            generalDAOSpringJdbc.save(sqlTwo, objectTwo);
            
        }catch(Exception e){
            log.error("An Exception occured when save Group Subject: ", e);
            return "Unable to Save Subject";
        }
        return "successful";
    }
    
   
    
    @Override
    public List<SubjectBean> getSubjectList(String classId)
    {
        List<SubjectBean> subjectList = new ArrayList<>();
        try
        {
            String sql = "select * from "+TableName.SUBJECT+" where classID = ?";
            Object [] object = new Object[]{classId};
            subjectList = (List<SubjectBean>) generalDAOSpringJdbc.getObjects(sql, SubjectBean.class, object);
        }
        catch(Exception e)
        {
            log.error("An Exception occured when get Subject List : ", e);
            return subjectList;
        }
        return subjectList;
    }
    
    @Override
    public List<SubjectBean> getSubjectGroupList(String classId)
    {
        List<SubjectBean> subjectGroupList = new ArrayList<>();
        try
        {
            String sql = "select * from "+TableName.SUBJECT+" where classID = ? and groupStatus = ? group by groupName";
            Object [] object = new Object[]{classId, 1};
            subjectGroupList = (List<SubjectBean>) generalDAOSpringJdbc.getObjects(sql, SubjectBean.class, object);
            
            /*
            for(SubjectBean sb : list) 
            {
                if(subjectGroupList.isEmpty())
                {
                    subjectGroupList.add(sb);
                }
                else
                {
                    boolean isDuplicate = false;
                    for(SubjectBean sb1 : subjectGroupList)
                    {
                        if(sb.getGroupName().equalsIgnoreCase(sb1.getGroupName()))
                        {
                            isDuplicate = true;
                        }
                    }
                    if(!isDuplicate)
                    {
                        subjectGroupList.add(sb);
                    }
                }
            }
            * */
            
        }
        catch(Exception e)
        {
            log.error("An Exception occured when get Subject List : ", e);
            return subjectGroupList;
        }
        return subjectGroupList;
    }
    
    
    @Override
    public List<String> getSubjectCodeListByClassId(String classId)
    {
        List<String> subjectList = new ArrayList<>();
        try
        {
            String sql = "select subjectCode from "+TableName.SUBJECT+" where classID = ? order by classID asc";
            Object [] object = new Object[] {classId};
            List<SubjectBean> list = (List<SubjectBean>) generalDAOSpringJdbc.getObjects(sql, SubjectBean.class, object);
            
            for(SubjectBean sb : list)
            {
                subjectList.add(sb.getSubjectCode());
            }
            
        }
        catch(Exception e)
        {
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
