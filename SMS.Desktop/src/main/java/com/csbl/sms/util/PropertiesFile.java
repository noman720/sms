package main.java.com.csbl.sms.util;
import com.app.dal.spring.dao.SpringJdbcDao;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.manager.ClassManager;
import main.java.com.csbl.sms.manager.EmployeeManager;
import main.java.com.csbl.sms.manager.ExamManager;
import main.java.com.csbl.sms.manager.ExamRegistrationManager;
import main.java.com.csbl.sms.manager.ExcelSheetManager;
import main.java.com.csbl.sms.manager.ExpenseManager;
import main.java.com.csbl.sms.manager.MailManager;
import main.java.com.csbl.sms.manager.MarkEntryManager;
import main.java.com.csbl.sms.manager.PaymentManger;
import main.java.com.csbl.sms.manager.ResultManager;
import main.java.com.csbl.sms.manager.StudentManager;
import main.java.com.csbl.sms.manager.SubjectChoiceManager;
import main.java.com.csbl.sms.manager.SubjectManager;
import main.java.com.csbl.sms.manager.TransactionManager;
import main.java.com.csbl.sms.manager.UserManager;
import main.java.com.csbl.sms.manager.YearChangeManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesFile
{

    private static ApplicationContext classpathCtx = null;
    private static IDAO generalDAOSpringJdbc;
    private static SpringJdbcDao springJdbcDao;
    private static IdGenerator idGenerator;
    private static DatabaseUtil databaseUtil;
    private static UserManager userManager;            
    private static ClassManager classManager;
    private static ExamManager examManager;
    private static SubjectManager subjectManager;
    private static StudentManager studentManager;
    private static EmployeeManager employeeManager;
    private static PopUpMenu popUpMenu;
    private static SubjectChoiceManager subjectChoiceManager;
    private static ExamRegistrationManager examRegistrationManager;
    private static MarkEntryManager markEntryManager;
    private static ResultManager resultManager;
    private static YearChangeManager yearChangeManager;
    private static PaymentManger paymentManger;
    private static ExcelSheetManager excelSheetManager;
    private static ExpenseManager expenseManager;
    private static TransactionManager transactionManager;
    private static MailManager mailManager;

    
    public static void load()
    {
        if(classpathCtx == null)
        {
            classpathCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        }
        
            setGeneralDAOSpringJdbc((IDAO) classpathCtx.getBean("generalDAOSpringJdbc"));
            setSpringJdbcDao((SpringJdbcDao) classpathCtx.getBean("springJdbcDao"));
            setIdGenerator((IdGenerator) classpathCtx.getBean("idGenerator"));
            setDatabaseUtil((DatabaseUtil) classpathCtx.getBean("databaseUtil"));
            setUserManager((UserManager) classpathCtx.getBean("userManager"));
            setClassManager((ClassManager) classpathCtx.getBean("classManager"));
            setExamManager((ExamManager) classpathCtx.getBean("examManager"));
            setSubjectManager((SubjectManager) classpathCtx.getBean("subjectManager"));
            setStudentManager((StudentManager) classpathCtx.getBean("studentManager"));
            setEmployeeManager((EmployeeManager) classpathCtx.getBean("employeeManager"));
            setSubjectChoiceManager((SubjectChoiceManager) classpathCtx.getBean("subjectChoiceManager"));
            setPopUpMenu((PopUpMenu) classpathCtx.getBean("popUpMenu"));
            setExamRegistrationManager((ExamRegistrationManager) classpathCtx.getBean("examRegistrationManager"));
            setMarkEntryManager((MarkEntryManager) classpathCtx.getBean("markEntryManager"));
            setResultManager((ResultManager) classpathCtx.getBean("resultManager"));
            setYearChangeManager((YearChangeManager) classpathCtx.getBean("yearChangeManager"));
            setPaymentManger((PaymentManger) classpathCtx.getBean("paymentManager"));
            setExcelSheetManager((ExcelSheetManager) classpathCtx.getBean("excelSheetManager"));
            setExpenseManager((ExpenseManager) classpathCtx.getBean("expenseManager"));
            setTransactionManager((TransactionManager) classpathCtx.getBean("transactionManager"));
            setMailManager((MailManager) classpathCtx.getBean("mailManager"));
            
    }

    
    public static IDAO getGeneralDAOSpringJdbc() {
        return generalDAOSpringJdbc;
    }

    public static void setGeneralDAOSpringJdbc(IDAO generalDAOSpringJdbc) {
        PropertiesFile.generalDAOSpringJdbc = generalDAOSpringJdbc;
    }

    public static UserManager getUserManager() {
        return userManager;
    }

    public static void setUserManager(UserManager userManager) {
        PropertiesFile.userManager = userManager;
    }

    public static ClassManager getClassManager() {
        return classManager;
    }

    public static void setClassManager(ClassManager classManager) {
        PropertiesFile.classManager = classManager;
    }

    public static ExamManager getExamManager() {
        return examManager;
    }

    public static void setExamManager(ExamManager examManager) {
        PropertiesFile.examManager = examManager;
    }

    public static SubjectManager getSubjectManager() {
        return subjectManager;
    }

    public static void setSubjectManager(SubjectManager subjectManager) {
        PropertiesFile.subjectManager = subjectManager;
    }

    public static IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(IdGenerator idGenerator) {
        PropertiesFile.idGenerator = idGenerator;
    }

    public static StudentManager getStudentManager() {
        return studentManager;
    }

    public static void setStudentManager(StudentManager studentManager) {
        PropertiesFile.studentManager = studentManager;
    }

    public static EmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public static void setEmployeeManager(EmployeeManager employeeManager) {
        PropertiesFile.employeeManager = employeeManager;
    }

    
    public static PopUpMenu getPopUpMenu() {
        return popUpMenu;
    }

    public static void setPopUpMenu(PopUpMenu popUpMenu) {
        PropertiesFile.popUpMenu = popUpMenu;
    }

    public static SubjectChoiceManager getSubjectChoiceManager() {
        return subjectChoiceManager;
    }

    public static void setSubjectChoiceManager(SubjectChoiceManager subjectChoiceManager) {
        PropertiesFile.subjectChoiceManager = subjectChoiceManager;
    }

    public static ExamRegistrationManager getExamRegistrationManager() {
        return examRegistrationManager;
    }

    public static void setExamRegistrationManager(ExamRegistrationManager examRegistrationManager) {
        PropertiesFile.examRegistrationManager = examRegistrationManager;
    }

    public static MarkEntryManager getMarkEntryManager() {
        return markEntryManager;
    }

    public static void setMarkEntryManager(MarkEntryManager markEntryManager) {
        PropertiesFile.markEntryManager = markEntryManager;
    }

    public static ResultManager getResultManager() {
        return resultManager;
    }

    public static void setResultManager(ResultManager resultManager) {
        PropertiesFile.resultManager = resultManager;
    }

    public static YearChangeManager getYearChangeManager() {
        return yearChangeManager;
    }

    public static void setYearChangeManager(YearChangeManager yearChangeManager) {
        PropertiesFile.yearChangeManager = yearChangeManager;
    }

    public static PaymentManger getPaymentManger() {
        return paymentManger;
    }

    public static void setPaymentManger(PaymentManger paymentManger) {
        PropertiesFile.paymentManger = paymentManger;
    }

    public static ExcelSheetManager getExcelSheetManager() {
        return excelSheetManager;
    }

    public static void setExcelSheetManager(ExcelSheetManager excelSheetManager) {
        PropertiesFile.excelSheetManager = excelSheetManager;
    }

    public static ExpenseManager getExpenseManager() {
        return expenseManager;
    }

    public static void setExpenseManager(ExpenseManager expenseManager) {
        PropertiesFile.expenseManager = expenseManager;
    }

    public static TransactionManager getTransactionManager() {
        return transactionManager;
    }

    public static void setTransactionManager(TransactionManager transactionManager) {
        PropertiesFile.transactionManager = transactionManager;
    }

    public static SpringJdbcDao getSpringJdbcDao() {
        return springJdbcDao;
    }

    public static void setSpringJdbcDao(SpringJdbcDao springJdbcDao) {
        PropertiesFile.springJdbcDao = springJdbcDao;
    }

    public static MailManager getMailManager() {
        return mailManager;
    }

    public static void setMailManager(MailManager mailManager) {
        PropertiesFile.mailManager = mailManager;
    }

    public static DatabaseUtil getDatabaseUtil() {
        return databaseUtil;
    }

    public static void setDatabaseUtil(DatabaseUtil databaseUtil) {
        PropertiesFile.databaseUtil = databaseUtil;
    }
    
    
       
    

}
