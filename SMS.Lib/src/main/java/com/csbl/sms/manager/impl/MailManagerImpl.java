package main.java.com.csbl.sms.manager.impl;

import com.app.dal.spring.dao.SpringJdbcDao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import main.java.com.csbl.sms.bean.StudentBean;
import main.java.com.csbl.sms.manager.MailManager;
import main.java.com.csbl.sms.util.TableName;
import org.apache.log4j.Logger;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailManagerImpl implements MailManager{
    private  Logger log = Logger.getLogger(this.getClass());
    private SpringJdbcDao springJdbcDao;
    private MailSender mailSender;
	
    @Override
    public String sendMail(String from, String[] to, String subject, String msg)
    {
            try{ 
            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom(from);
            message.setTo(to);
            message.setSubject(subject);
            message.setText(msg);
            message.setSentDate(new Date());
                        
            //mailSender.send(message);
            for(int i=0; i<100000; i++)
            {
                System.out.println(i);
            }
                        
            }catch(Exception e){
                log.error("An Exception occured when Send Email List : ", e);
                return "Failed to Send Mail";
            }
            
            return "successful";
    }
    
    @Override
    public List<String> getStudentEmailList(String classId, String academicYear)
    {
        List<String> studentEmailList = new ArrayList<>();
        try
        { 
            String sql = "select email from "+TableName.STD_PERSONALINFO+" sp, "+TableName.STD_ACADEMICINFO+" sa where sp.studentId = sa.studentId and classId = ? and academicYear = ?";
            //System.out.println(sql);
            Object [] object = new Object[]{classId, academicYear};
            List<StudentBean> studentBeanList = (List<StudentBean>) springJdbcDao.getObjectList(sql, object, StudentBean.class);
            for(StudentBean sb : studentBeanList)
            {
                if(!sb.getEmail().isEmpty())
                {
                    studentEmailList.add(sb.getEmail());
                }
            }
        }
        catch(Exception e)
        {
            log.error("An Exception occured when get Student Email List : ", e);
            return studentEmailList;
        }
        return studentEmailList;
    }

    public MailSender getMailSender() {
        return mailSender;
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public SpringJdbcDao getSpringJdbcDao() {
        return springJdbcDao;
    }

    public void setSpringJdbcDao(SpringJdbcDao springJdbcDao) {
        this.springJdbcDao = springJdbcDao;
    }

        
        
}
