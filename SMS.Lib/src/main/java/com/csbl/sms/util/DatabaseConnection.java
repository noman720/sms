package main.java.com.csbl.sms.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    
    public static Connection getConnection()
    {
        Connection conn = null;
        try
        {       
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inputStream);

            Class.forName(props.getProperty("jdbc.driverClassName"));
            conn = DriverManager.getConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.username"), props.getProperty("jdbc.password"));
        }
        catch(ClassNotFoundException e){}
        catch(SQLException ex){}
        catch(Exception e){}
        return conn;
        
    }

    public static Connection getDefaultConnection()
    {
        
        Connection conn = null;
        try
        {
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inputStream);
            
            Class.forName(props.getProperty("jdbc.driverClassName"));
            conn = DriverManager.getConnection(props.getProperty("jdbc.defaulturl"), props.getProperty("jdbc.username"), props.getProperty("jdbc.password"));
        }
        catch(ClassNotFoundException e){
            return conn;
        }
        catch(SQLException ex){
            return conn;
        }
        catch(Exception e){
            return conn;
        }

        return conn;

    }
    
}

