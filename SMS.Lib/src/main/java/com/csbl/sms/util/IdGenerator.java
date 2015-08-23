package main.java.com.csbl.sms.util;

public interface IdGenerator
{
    public String generateOid();
  
    public String getStudentID(String className, String year, String group);

    public String getMoneyReceiptNo(String classId);
    
    public String getSalaryReceiptNo();
    
    public String getEmployeeId();
	
}
