
package main.java.com.csbl.sms.exception;

public class SMSBaseException extends Exception{

    private static final long serialVersionUID = 1L;

    public SMSBaseException()
    {
        super();
    }

    public SMSBaseException(String message) {
        super(message);
    }

    public SMSBaseException(Throwable cause) {
        super(cause);
    }
    
    
    
    
}
