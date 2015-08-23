
package main.java.com.csbl.sms.exception;

public class SMSDataAccessException extends SMSBaseException {

    private static final long serialVersionUID = 1L;

    public SMSDataAccessException() {
    }

    public SMSDataAccessException(String message) {
        super(message);
    }

    public SMSDataAccessException(Throwable cause) {
        super(cause);
    }
    
    
}
