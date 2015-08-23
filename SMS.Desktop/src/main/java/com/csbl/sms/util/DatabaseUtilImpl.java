package main.java.com.csbl.sms.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DatabaseUtilImpl implements DatabaseUtil
{
    
    private final int BUFFER = 99999;
    private Logger log = Logger.getLogger(this.getClass());
    private DriverManagerDataSource driverManagerDataSource;
    
    private String host;
    private String port;
    private String database;



    public boolean executeBatch(List<String> list){
        Connection con = null;
        Statement stmt = null;
        boolean isSave = true;
        try
        {
            con = driverManagerDataSource.getConnection();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            con.setAutoCommit(false);
            for(String str : list)
            {
               stmt.addBatch(str);
            }
            stmt.executeBatch();
            con.commit();
        }
        catch(Exception e)
        {
            log.error("An Exception occured when execute batch for Save Purchase: ", e);
            isSave = false;
        }
        finally
        {
            try
            {
                if(stmt != null)
                {
                    stmt.close();
                }
                if(con != null && !con.isClosed())
                {
                    con.close();
                }
            }
            catch(Exception e)
            {
                log.error("An Exception occured when close connection : ", e);
            }
        }
        return isSave;
    }

    
    @Override
    public String backupDatabase() {
        Date date = new Date();
        String Mysqlpath = getMysqlBinPath();
        Process run = null;
        //System.out.println("this is working..."+host +"\t"+ port);
        try
        {
            //System.out.println(host +"\t"+ port);
            run = Runtime.getRuntime().exec(Mysqlpath + "mysqldump --host=" + host + " --port=" + port + " --user=" + driverManagerDataSource.getUsername() + " --password=" + driverManagerDataSource.getPassword() + "  " + "--skip-comments --skip-triggers " + database);
            
        } catch (Exception e) {
            log.error("An Exception occured when get Database Backup : ", e);
            return "Fail";
        }        
        InputStream in = run.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringBuffer temp = new StringBuffer();
        int count;
        char[] cbuf = new char[BUFFER];
        try
        {
            while ((count = br.read(cbuf, 0, BUFFER)) != -1)
            {
                temp.append(cbuf, 0, count);
            }
        }
        catch (IOException ex)
        {
            log.error("An Exception occured when write into file for Database Backup : ", ex);
            return "Fail";
        }
        try
        {
            br.close();
            in.close();
        }
        catch (IOException ex)
        {
            log.error("An Exception occured when close File for Database Backup : ", ex);
            return "Fail";
        }
        byte[] data = temp.toString().getBytes();
        if(writeToFile(data, date))
        {
            return "Success";
        }
        return "Fail";
    }


    public boolean writeToFile(byte[] data, Date date){
        FileOutputStream fop = null;
        try
        {
            Properties props = new Properties();
            InputStream inputStreamPath = DBUtil.class.getClassLoader().getResourceAsStream("path.properties");
            props.load(inputStreamPath);
            
            File rootFolder = new File(props.getProperty("path.DBBackup"));
            if(!rootFolder.exists())
            {
                rootFolder.mkdir();
            }
            File file = new File(rootFolder.getAbsoluteFile()+File.separator+"smss_"+DateUtil.getDateAsString(date)+".sql");
            fop = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            fop.write(data);
            fop.flush();
            fop.close();
            log.info("Successfully Backup DB");
            return true;
            
        }
        catch(Exception e)
        {
            log.error("An Exception occured when write file for backup DB : ", e);
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException ex) {
                log.error("An Exception occured when close FileOutputStream to write file for backup DB : ", ex);
                return false;
            }
            return false;
        }
    }

    public String getMysqlBinPath() {
        String path = System.getenv("Path");
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







    public DriverManagerDataSource getDriverManagerDataSource() {
        return driverManagerDataSource;
    }

    public void setDriverManagerDataSource(DriverManagerDataSource driverManagerDataSource) {
        this.driverManagerDataSource = driverManagerDataSource;
    }

        
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }



}
