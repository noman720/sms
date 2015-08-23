
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.List;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.bean.TabulationSheetBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.YearChangeManager;
import main.java.com.csbl.sms.util.IdGenerator;
import org.apache.log4j.Logger;

public class YearChangeManagerImpl implements YearChangeManager{
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;

    
    @Override
    public synchronized String saveStudent(List<TabulationSheetBean> tabulationSheetBeans, StudentBean studentBean)
    {
        try
        {
            List<StudentBean> studentBeanList = new ArrayList<>();
            
            for(TabulationSheetBean tsb : tabulationSheetBeans)
            {
                StudentBean sb = new StudentBean(); 
                sb.setOid(idGenerator.generateOid());
                sb.setClassId(studentBean.getClassId());
                sb.setStudentID(tsb.getStudentId());
                sb.setAcademicYear(studentBean.getAcademicYear());
                sb.setStudentGroup(studentBean.getStudentGroup());
                sb.setStudentType(studentBean.getStudentType());
                sb.setMedium(studentBean.getMedium());
                sb.setShift(studentBean.getShift());
                sb.setSectionName(studentBean.getSectionName());
                sb.setClassRoll(tsb.getMeritPosition());
                
                studentBeanList.add(sb);
            }
            
            String sql = "insert into t_studentacademicinfo (oid, classId, studentId, "
                    + "academicYear, studentGroup, studentType, "
                    + "medium, shift, sectionName, "
                    + "classRoll) "
                    + "values(:oid, :classId, :studentID, "
                    + ":academicYear, :studentGroup, :studentType, "
                    + ":medium, :shift, :sectionName, "
                    + ":classRoll)";
            
            generalDAOSpringJdbc.saveList(sql, studentBeanList);
        }catch(Exception e){
            log.error("An Exception occured when save Students Academic Info in Year Change: ", e);
            return "Unable to Save Students";
        }
        
        return "successful";
    }
    
    @Override
    public synchronized List<TabulationSheetBean> getUnregistedStudentList(List<TabulationSheetBean> tabulationSheetBeans, String classId, String academicYear)
    {
        List<String> registedStudentList = getRegistedStudentList(classId, academicYear);
        
        for(String rsl : registedStudentList)
        {
            for(TabulationSheetBean tsb : tabulationSheetBeans)
            {
                if(rsl.equalsIgnoreCase(tsb.getStudentId()))
                {
                    tabulationSheetBeans.remove(tsb);
                    break;
                }

            }
        }
        
        return tabulationSheetBeans;
    }

    
    private synchronized List<String> getRegistedStudentList(String classId, String academicYear)
    {
        List<String> registeredStudentList = new ArrayList<>();
        try
        {
            String sql = "select distinct studentId from t_studentacademicinfo where classId = ? and academicYear = ?";
            
            Object [] object = new Object[]{classId, academicYear};
            
            List<StudentBean> list = (List<StudentBean>) generalDAOSpringJdbc.getObjects(sql, StudentBean.class, object);
            
            for(StudentBean sb : list)
            {
                registeredStudentList.add(sb.getStudentID());
            }
        }
        catch(Exception e)
        {
            log.error("An Exception occured when get Student List for Academic Register : ", e);
            return registeredStudentList;
        }
        return registeredStudentList;
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
