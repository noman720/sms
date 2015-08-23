package main.java.com.csbl.sms.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import main.java.com.csbl.sms.dao.IDAO;
import org.apache.log4j.Logger;




public class IdGeneratorImpl implements IdGenerator
{
    protected Logger log = Logger.getLogger(this.getClass());
    private IDAO generalDAOSpringJdbc;
    private static final int NUM_CHARS = 20;
    private static String chars = "abcdefghijklmonpqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static Random r = new Random();
    SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd-HHmmss");

    @Override
    public synchronized String generateOid()
    {
        Date today = new Date();        
        String todayAsString = df.format(today);
        return todayAsString + "-" + generateRandormNumber();
    }

    private synchronized String generateRandormNumber()
    {
        char[] buf = new char[NUM_CHARS];
        for (int i = 0; i < buf.length; i++)
        {
            buf[i] = chars.charAt(r.nextInt(chars.length()));
        }
        return new String(buf);
    }

    
    @Override
    public synchronized String getStudentID(String className, String session, String studentGroup)
    {
        int id = 1;
        
        String prefix = "NoPrefix";
        
        if(className.equalsIgnoreCase("1") || className.equalsIgnoreCase("2") || className.equalsIgnoreCase("3") || className.equalsIgnoreCase("4") || className.equalsIgnoreCase("5"))
        {
            prefix = "P";
        }
        if(className.equalsIgnoreCase("6") || className.equalsIgnoreCase("7") || className.equalsIgnoreCase("8"))
        {
            prefix = "J";
        }
        if(className.equalsIgnoreCase("9") || className.equalsIgnoreCase("10"))
        {
            prefix = "S";
        }
        if(className.equalsIgnoreCase("11") || className.equalsIgnoreCase("12"))
        {
            prefix = "H";
        }
        
        String sessionID = session.substring(2);    // i.e : 07 from 2007
        
        int groupID = 0;
        if(studentGroup.equalsIgnoreCase("SCIENCE")) {
            groupID = 1;
        }
        if(studentGroup.equalsIgnoreCase("COMERCE")) {
            groupID = 2;
        }
        if(studentGroup.equalsIgnoreCase("HUMANITIES")) {
            groupID = 3;
        }  
                
        try{
            //id = Integer.parseInt(DBIdGenerator.getData("select count(studentID) from t_student where studentID like '"+prefix+""+sessionID+""+groupID+"%'").get(0).toString().trim())+1;
            Object[] object = new Object[]{prefix+sessionID+groupID+"%"};
            id = generalDAOSpringJdbc.getIntObject("select count(studentID) from t_studentpersonalinfo where studentID like ?", object)+1;
        }catch(Exception e)
        {
            log.error(e);
        }
        
        String idNumber = prefix+sessionID+groupID+String.format("%04d", id);

        return idNumber;
    }

    
    @Override
    public synchronized String getMoneyReceiptNo(String classId)
    {
        int tnumber = 1;
        
        try{
            String sql = "select count(oid) from t_studentPayment";
            Object[] object = new Object[]{};
            tnumber = (int) generalDAOSpringJdbc.getIntObject(sql, object)+1;
        }catch(Exception e)
        {
            log.error("An Exception occured when getMoneyReceiptNo :"+e);
        }
        
        String moneyReceiptNo = "MR-"+classId+"-"+String.format("%08d", tnumber);
        
        return moneyReceiptNo;
    }
    
    @Override
    public synchronized String getSalaryReceiptNo()
    {
        int tnumber = 1;
        
        try{
            String sql = "select count(oid) from t_salaryPayment";
            Object[] object = new Object[]{};
            tnumber = (int) generalDAOSpringJdbc.getIntObject(sql, object)+1;
        }catch(Exception e)
        {
            log.error("An Exception occured when getSalaryReceiptNo :"+e);
        }
        
        String moneyReceiptNo = "SMR-"+String.format("%08d", tnumber);
        
        return moneyReceiptNo;
    }
    
    @Override
    public synchronized String getEmployeeId()
    {
        int tnumber = 1;
        
        try{
            String sql = "select count(oid) from t_employee";
            Object[] object = new Object[]{};
            tnumber = (int) generalDAOSpringJdbc.getIntObject(sql, object)+1;
        }catch(Exception e)
        {
            log.error("An Exception occured when getMoneyReceiptNo :"+e);
        }
        
        String employeeId = "EID-"+String.format("%08d", tnumber);
        
        return employeeId;
    }
    
    public IDAO getGeneralDAOSpringJdbc() {
        return generalDAOSpringJdbc;
    }

    public void setGeneralDAOSpringJdbc(IDAO generalDAOSpringJdbc) {
        this.generalDAOSpringJdbc = generalDAOSpringJdbc;
    }
    
    
    
	
}
