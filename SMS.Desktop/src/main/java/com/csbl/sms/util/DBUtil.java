package main.java.com.csbl.sms.util;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.Logger;

public class DBUtil
{
    
    private static Logger log = Logger.getLogger(DBUtil.class);
    
    public static String backupDatabase() {
        String Mysqlpath = getMysqlBinPath();
        String date = DateUtil.getDateAsString(new Date());
        try
        {
            Properties props = new Properties();
            InputStream inputStreamJdbc = DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            InputStream inputStreamPath = DBUtil.class.getClassLoader().getResourceAsStream("path.properties");
            props.load(inputStreamJdbc);
            props.load(inputStreamPath);
            
            File folder = new File(props.getProperty("path.DBBackup"));
            //File folder = new File("DBBackup");
            if(!folder.exists())
            {
                folder.mkdir();
            }
            String backupFile = folder.toString()+File.separator+"smss_"+date+".sql";
            System.out.println(Mysqlpath+"mysqldump -u "+props.getProperty("jdbc.username")+" -p"+props.getProperty("jdbc.password")+" "+props.getProperty("jdbc.database")+" -r "+backupFile+"");
            
            Runtime.getRuntime().exec(Mysqlpath+"mysqldump -u "+props.getProperty("jdbc.username")+" -p"+props.getProperty("jdbc.password")+" "+props.getProperty("jdbc.database")+" -r "+backupFile+"");
            
            
            
        } catch (Exception e) {
            log.error("An Exception occured when get Database Backup : ", e);
            return "Fail to Backup Database";
        }        

        return "Successful";
    }

    public static String loadDatabase(String fileLocation) {
        String Mysqlpath = getMysqlBinPath();
        //Process run = null;
        try
        {
            Properties props = new Properties();
            InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inputStream);

            String[] executeCmd = new String[]{Mysqlpath+"mysql",props.getProperty("jdbc.database"), "--user=" + props.getProperty("jdbc.username"), "--password=" + props.getProperty("jdbc.password"), "-e", " source "+fileLocation+""};
            Process runtimeProcess =Runtime.getRuntime().exec(executeCmd);
            runtimeProcess.waitFor();
        } catch (IOException | InterruptedException e) {
            log.error("An Exception occured when Load Database : ", e);
            return "Fail to Load Database";
        }

        return "Successfully Load Database";
    }

    public static String getMysqlBinPath() {
        String path = System.getenv("Path");
        //System.out.println(path);
        String str[] = path.split(";");
        for(int i=0; i<str.length;i++)
        {
            String s = str[i];
            if(s.contains("MySQL"))
            {
                return str[i]+"\\";
            }
        }
        return "";
    }

    public static String getMysqlRootPath() {
        String path = getMysqlBinPath();
        //System.out.println(path);
        String str[] = path.split("bin");
        for(int i=0; i<str.length;i++)
        {
            String s = str[i];
            if(s.contains("MySQL"))
            {
                return str[i];
            }
        }
        return "";
    }


    
}
