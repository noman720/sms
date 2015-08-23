
package main.java.com.csbl.sms.manager.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.CommitResultBean;
import main.java.com.csbl.sms.bean.GradeBean;
import main.java.com.csbl.sms.bean.MarkBean;
import main.java.com.csbl.sms.bean.MarkSheetBean;
import main.java.com.csbl.sms.bean.SubjectBean;
import main.java.com.csbl.sms.bean.SubjectChoiceBean;
import main.java.com.csbl.sms.bean.TabulationSheetBean;
import main.java.com.csbl.sms.bean.TranscriptBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.ResultManager;
import main.java.com.csbl.sms.util.DatabaseConnection;
import main.java.com.csbl.sms.util.DateUtil;
import main.java.com.csbl.sms.util.IdGenerator;
import main.java.com.csbl.sms.util.NumberUtil;
import main.java.com.csbl.sms.util.ReportUtil;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;

public class ResultManagerImpl implements ResultManager{
    private Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private IdGenerator idGenerator;
    private static Map param = new HashMap();

    
    @Override
    public synchronized String setCommitResult(CommitResultBean commitResultBean)
    {
        try
        {
            commitResultBean.setOid(idGenerator.generateOid());
            String sql = "insert into "+TableName.COMMITEDRESULT+" (oid, classId, examYear, examName) values (?, ?, ?, ?)";
            Object[] object = new Object[]{commitResultBean.getOid(), commitResultBean.getClassId(), commitResultBean.getExamYear(), commitResultBean.getExamName()};
            generalDAOSpringJdbc.save(sql, object);
           
        }
        catch(Exception e)
        {
            log.error("An Exception occured when save Commited Result: ");
            return "Unable to Commit Result\nAlready Commited !";
        }
        return "successful";
    }
    
    
    @Override
    public synchronized boolean isCommitedResult(CommitResultBean commitResultBean)
    {
        try
        {
            String sql = "select oid from "+TableName.COMMITEDRESULT+" where classId = ? and examYear = ? and examName = ?";
            System.out.println(sql);
            Object[] object = new Object[]{commitResultBean.getClassId(), commitResultBean.getExamYear(), commitResultBean.getExamName()};
            String oid = (String) generalDAOSpringJdbc.getObject(sql, object);
            
            System.out.println(commitResultBean.getOid());
            
            if(oid.isEmpty() || oid == null || oid.equalsIgnoreCase("null"))
            {
                return false;
            }
            
        }
        catch(Exception e)
        {
            log.error("No Exception occured when get Commited Result: ");
            return false;
        }
        return true;
    }
    
    
    @Override
    public synchronized List<MarkSheetBean> getMarkSheet(String classId, String studentId, String examYear, String examName)
    {
        List<MarkSheetBean> results = new ArrayList();
        
        List<SubjectBean> subjectBeanList = getSubjectsDetailsList(classId, studentId);
        List<MarkSheetBean> markList = getAllMarks(classId, studentId, examYear, examName);
        List<GradeBean> gradeBeans = getGrade();
        
        if(subjectBeanList.isEmpty() || markList.isEmpty())
        {
            return results;
        }
        double netTotal = 0;
        for(MarkSheetBean msb: markList)
        {
            netTotal += msb.getMark();
        }
        
        for(SubjectBean sb : subjectBeanList)
        {
            MarkSheetBean msBean = new MarkSheetBean();
            msBean.setSubjectType(sb.getSubjectType());
            msBean.setNetTotal(netTotal);
            if(sb.getGroupStatus() == 1)
            {
                double mark1 = 0;
                double mark2 = 0;
                
                for(MarkSheetBean smb : markList)
                {
                    if(sb.getSubjectCode().equalsIgnoreCase(smb.getSubjectCode()))
                    {
                        mark1 = smb.getMark();
                    }
                    if(sb.getGroupCode().equalsIgnoreCase(smb.getSubjectCode()))
                    {
                        mark2 = smb.getMark();
                    }
                }
                
                
                msBean.setSubjectCode(sb.getSubjectCode()+"+"+sb.getGroupCode());
                msBean.setSubjectName(sb.getGroupName());
                msBean.setMark(Math.ceil((mark1+mark2)/2));
            
            }
            else
            {
                double mark = 0;
                for(MarkSheetBean smb : markList)
                {
                    if(sb.getSubjectCode().equalsIgnoreCase(smb.getSubjectCode()))
                    {
                        mark = smb.getMark();
                        break;
                    }
                }
                msBean.setSubjectCode(sb.getSubjectCode());
                msBean.setSubjectName(sb.getSubjectName());
                msBean.setMark(Math.ceil(mark));
            }
            
            
            for(GradeBean gb : gradeBeans)
            {
                if(msBean.getMark() >= gb.getStartingMark() && msBean.getMark() <= gb.getEndingMark())
                {
                    msBean.setGradeLetter(gb.getGradeLetter());
                    msBean.setGradePoint(gb.getGradePoint());
                    break;
                }
            }
            
                
            results.add(msBean);
            
        }
        
        return results;
    }
    
    
    private synchronized List<MarkSheetBean> getAllMarks(String classId, String studentId, String examYear, String examName)
    {
        List<MarkSheetBean> subjectMarkBeanList = new ArrayList();
        
        try
        {
            String sql = "select subjectCode, attendenceMark+classtestMark+objectiveMark+theoryMark+practicalMark as mark "
                    + "from t_result_"+classId+" "
                    + "where studentId = ? and examYear = ? and examName = ?";
            Object [] object = new Object[]{studentId, examYear, examName};
            subjectMarkBeanList = (List<MarkSheetBean>) generalDAOSpringJdbc.getObjects(sql, MarkSheetBean.class, object);
            
        }catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when getAllMarks List : ", e);
            return subjectMarkBeanList;
        }
        
        return subjectMarkBeanList;
    }
    
    private synchronized List<GradeBean> getGrade()
    {
        List<GradeBean> gradeBeans = new ArrayList();
        
        try
        {
            String sql = "select * from "+TableName.GRADE+" order by oid asc";
            Object [] object = null;
            gradeBeans = (List<GradeBean>) generalDAOSpringJdbc.getObjects(sql, GradeBean.class, object);
            
        }catch(Exception e)
        {
            //e.printStackTrace();
            //log.error("An Exception occured when getGrade List : ", e);
            return gradeBeans;
        }
        
        return gradeBeans;
    }
    
    private synchronized List<SubjectBean> getSubjectsDetailsList(String classId, String studentId)  // needed only studentId, classID
    {
        List<SubjectBean> subjectBeanList = new ArrayList();
        
        SubjectChoiceBean subjects = getSubjectsForStudent(classId, studentId);
        
        if(subjects == null)
        {
            return subjectBeanList;
        }
        if(!subjects.getCompulsory().isEmpty())
        {
            subjectBeanList.addAll(getSubjectDetails(subjects.getCompulsory(), "COMP"));
        }
        //System.out.println(subjects.getElective().isEmpty());
        if(!subjects.getElective().isEmpty())
        {
            subjectBeanList.addAll(getSubjectDetails(subjects.getElective(), "ELEC"));
        }
        if(!subjects.getAdditional().isEmpty())
        {
            subjectBeanList.addAll(getSubjectDetails(subjects.getAdditional(), "ADDI"));
        }
        
        return subjectBeanList;
    }
    
    private synchronized SubjectChoiceBean getSubjectsForStudent(String classId, String studentId)
    {
        SubjectChoiceBean subjects = new SubjectChoiceBean();
        try
        {
            String sql = "select compulsory, elective, additional "
                    + "from "+TableName.SELECTEDSUBJECT+" "
                    + "where classId = ? and studentId = ?";
            
            Object [] object = new Object[]{classId, studentId};
            subjects = (SubjectChoiceBean) generalDAOSpringJdbc.getObjectBean(sql, SubjectChoiceBean.class, object);
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            //log.error("An Exception occured when get Students Subject List : ", e);
            return null;
        }
        return subjects;
    }
    
    private synchronized List<SubjectBean> getSubjectDetails(String subjects, String subjectType)
    {
        List<SubjectBean> subjectBeanList = new ArrayList();
        try
        {
            String sql = "(select * from "+TableName.SUBJECT+" where subjectCode IN ("+subjects+") group By groupName having groupStatus = 1) "
                    +"union all "
                    +"(select * from "+TableName.SUBJECT+" where subjectCode IN ("+subjects+") and groupStatus = 0) "
                    +"order by subjectCode asc";
            
            //System.out.println(sql);
            Object [] object = null;
            List<SubjectBean> subjectList = (List<SubjectBean>) generalDAOSpringJdbc.getObjects(sql, SubjectBean.class, object);
            for(SubjectBean sb : subjectList)
            {
                sb.setSubjectType(subjectType);
                subjectBeanList.add(sb);
            }
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            //log.error("An Exception occured when get SubjectDetails : ", e);
            return subjectBeanList;
        }
        return subjectBeanList;
    }
    
    
    @Override
    public synchronized TranscriptBean getResult(TranscriptBean transcriptBean)
    {
        
        int subject = 0;
        double totalPoint = 0;
        double additionalPointAbove2 = 0; 
        boolean isFail = false;
        for(MarkSheetBean subjectMarkBean : transcriptBean.getMarksList())
        {   
            
            if(! subjectMarkBean.getSubjectType().equalsIgnoreCase("ADDI"))
            {
                subject ++;
                totalPoint += subjectMarkBean.getGradePoint();
            }
            else
            {
                if(subjectMarkBean.getGradePoint() > 2.0) {
                    additionalPointAbove2 = (subjectMarkBean.getGradePoint() - 2.0);
                }
            }
            
            if(subjectMarkBean.getGradePoint() < 1.0 && !subjectMarkBean.getSubjectType().equalsIgnoreCase("ADDI"))
            {
                isFail = true;
            }
            
        }
        //System.out.println("totalPoint ="+totalPoint+"\t subject ="+subject);
        //System.out.println(String.format("%.2f", totalPoint/subject));        
        
        transcriptBean.setGPAwithoutAdditional(NumberUtil.getValueByRounding(totalPoint/subject));
        transcriptBean.setGPAwithAdditional(NumberUtil.getValueByRounding((totalPoint+additionalPointAbove2)/subject));
        if(transcriptBean.getGPAwithAdditional()>=5.0)
        {
            transcriptBean.setGPAwithAdditional(5.00);
        }
        if(isFail)
        {
            transcriptBean.setGPAwithoutAdditional(0.00);
            transcriptBean.setGPAwithAdditional(0.00);
        }
        
        return transcriptBean;
    }
    
    
    @Override
    public synchronized List<TabulationSheetBean> getTebulationSheet(String classId, String examYear, String examName)
    {
        List<TabulationSheetBean> tabulationSheetBeans = new ArrayList<>();
        List<TabulationSheetBean> students = getStudentIdAndName(classId, examYear, examName);
        List<GradeBean> gradeBeans = getGrade();
        for(TabulationSheetBean tabulationSheetBean : students)
        {
            TranscriptBean transcriptBean = new TranscriptBean();
            transcriptBean.setMarksList(getMarkSheet(classId, tabulationSheetBean.getStudentId(), examYear, examName));
            transcriptBean = getResult(transcriptBean);

            tabulationSheetBean.setTotalMark(transcriptBean.getMarksList().get(0).getNetTotal());
            tabulationSheetBean.setGpaWtihoutAdditional(transcriptBean.getGPAwithoutAdditional());
            tabulationSheetBean.setGpaWithAdditional(transcriptBean.getGPAwithAdditional());
            
            for(GradeBean gb : gradeBeans)
            {
                if(tabulationSheetBean.getGpaWithAdditional() < gb.getGradePoint())
                {
                    continue;
                }
                tabulationSheetBean.setGradeLetter(gb.getGradeLetter());
                break;
            }
            
            tabulationSheetBeans.add(tabulationSheetBean);
        }
        
        return tabulationSheetBeans;
    }
    
    
    
    @Override
    public synchronized List<String> getStudentId(String classId, String examYear, String examName)
    {
        List<String> studentIdList = new ArrayList<>();
        try
        {
            String sql = "select distinct studentId from t_result_"+classId+" where examYear = ? and examName = ? order by studentId asc";
            Object [] object = new Object[]{examYear, examName};
            List<MarkBean> studentList = (List<MarkBean>) generalDAOSpringJdbc.getObjects(sql, MarkBean.class, object);
            
            for(MarkBean mb : studentList)
            {
                studentIdList.add(mb.getStudentId());
            }
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get StudentId List : ", e);
            return studentIdList;
        }
        return studentIdList;
    }
    
    private synchronized List<TabulationSheetBean> getStudentIdAndName(String classId, String examYear, String examName)
    {
        List<TabulationSheetBean> studentList = new ArrayList<>();
        try
        {
            String sql = "select distinct t_result_"+classId+".studentId, studentName from t_result_"+classId+", t_studentpersonalinfo where t_result_"+classId+".studentId = t_studentpersonalinfo.studentId and examYear = ? and examName = ? order by studentId asc";
            //System.out.println(sql);
            Object [] object = new Object[]{examYear, examName};
            studentList = (List<TabulationSheetBean>) generalDAOSpringJdbc.getObjects(sql, TabulationSheetBean.class, object);
            
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            log.error("An Exception occured when get StudentId List : ", e);
            return studentList;
        }
        return studentList;
    }
    
    
    
    
    
    @Override
    public void showTranscript(TranscriptBean transcriptBean)
    {
        param.clear();
        param.put("examName", transcriptBean.getExamName());
        param.put("examYear", transcriptBean.getExamYear());
        param.put("studentId", transcriptBean.getStudentId());
        param.put("studentName", transcriptBean.getStudentName());
        param.put("fatherName", transcriptBean.getFatherName());
        param.put("motherName", transcriptBean.getMotherName());
        param.put("birthDate", DateUtil.getDateFromString(transcriptBean.getBirthDate()));
        param.put("session", transcriptBean.getAcademicYear());
        param.put("classId", transcriptBean.getClassId());
        param.put("medium", transcriptBean.getMedium());
        param.put("groupName", transcriptBean.getGroup());
        param.put("section", transcriptBean.getSection());
        param.put("shiftName", transcriptBean.getShift());
        param.put("studentType", transcriptBean.getType());
        param.put("roll", transcriptBean.getClassRoll()+"");
        param.put("section", transcriptBean.getSection());
        param.put("gpaWithoutAdd", transcriptBean.getGPAwithoutAdditional());
        param.put("gpaWithAdd", transcriptBean.getGPAwithAdditional());
                        
        String fileSource = "report/result/Transcript.jasper";
        ReportUtil.exportReportJavaBean(fileSource, DatabaseConnection.getConnection(), param, transcriptBean.getMarksList());
    }
    
    @Override
    public void showTabulationSheet(List<TabulationSheetBean> tabulationSheetBeans, String classId, String examName, String examYear)
    {
        param.clear();
        param.put("classId", classId);
        param.put("examName", examName);
        param.put("examYear", examYear);
                        
        String fileSource = "report/result/TabulationSheet.jasper";
        ReportUtil.exportReportJavaBean(fileSource, DatabaseConnection.getConnection(), param, tabulationSheetBeans);
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
