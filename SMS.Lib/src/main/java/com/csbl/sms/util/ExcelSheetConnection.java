
package main.java.com.csbl.sms.util;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ExcelSheetConnection {
   
   public static Connection getConnection(File file)
    {
        Connection conn = null;
        try
        {       
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("excel.properties");
            props.load(inputStream);

            Class.forName(props.getProperty("excel.driverClassName"));
            conn = DriverManager.getConnection(String.format(props.getProperty("excel.url"), file.getAbsolutePath()));
        }
        catch(ClassNotFoundException e){}
        catch(SQLException ex){}
        catch(Exception e){}
        return conn;
        
    }
   
}
