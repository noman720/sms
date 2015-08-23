
package main.java.sms.desktop;

import main.java.com.csbl.sms.ui.LoginForm;
import main.java.com.csbl.sms.util.PropertiesFile;


public class Main { 
       
    public static void main(String[] args) {
       try
       {
           javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
       }
       catch(javax.swing.UnsupportedLookAndFeelException | java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException e){
       }
       
       PropertiesFile.load();
          
       new LoginForm(null, true).setVisible(true);
       
    }

    
    
    
}
