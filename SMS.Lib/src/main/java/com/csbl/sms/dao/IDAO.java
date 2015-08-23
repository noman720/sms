
package main.java.com.csbl.sms.dao;

import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.AbstractBean;
import main.java.com.csbl.sms.exception.SMSDataAccessException;

public interface IDAO {
    public void save(String sql, Object[] object) throws SMSDataAccessException;
    
    public void saveList(String sql, List<? extends AbstractBean> beanList) throws SMSDataAccessException;
    
    public Object getObject(String sql, Object[] object) throws SMSDataAccessException;
    
    public Object getObjectBean(String sql, Class< ? extends AbstractBean> beanClass, Object[] object) throws Exception;
    
    public List<? extends AbstractBean> getObjects(String sql, Class< ? extends AbstractBean> beanClass, Object[] object) throws SMSDataAccessException;
  
    public List<Map<String, Object>> getObjectList(String sql, Object[] object) throws SMSDataAccessException;
    
    public int getIntObject(String sql, Object[] object) throws SMSDataAccessException;
}
