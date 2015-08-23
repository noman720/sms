
package main.java.com.csbl.sms.dao.impl;

import java.util.List;
import java.util.Map;
import main.java.com.csbl.sms.bean.AbstractBean;
import main.java.com.csbl.sms.dao.IDAO;
import main.java.com.csbl.sms.exception.SMSDataAccessException;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class GeneralDAOSpringJdbcImpl extends SimpleJdbcDaoSupport implements IDAO {
    protected Logger log = Logger.getLogger(this.getClass());
    
    
    @Override
    public void save(String sql, Object[] object) throws SMSDataAccessException
    {
        try
        {
            //String sql = "insert into t_customer (name, age) VALUES (:name, :age)";
            getSimpleJdbcTemplate().update(sql, object);
        }
        catch (Exception e)
        {
            logger.error(e);
            throw new SMSDataAccessException(e.getCause());
        }  
        
        
    }
    
    @Override
    public void saveList(String sql, List<? extends AbstractBean> beanList) throws SMSDataAccessException
    {
        try{
        //String sql = "insert into t_customer (name, age) VALUES (:name, :age)";
        SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(beanList.toArray());
        getSimpleJdbcTemplate().batchUpdate(sql,params);
        }
        catch (Exception e)
        {
            logger.error(e);
            throw new SMSDataAccessException(e.getCause());
        }
    }
    
    @Override
    public List<? extends AbstractBean> getObjects(String sql, Class< ? extends AbstractBean> beanClass, Object[] object) throws SMSDataAccessException
    {
        try
        {
            //String sql = "SELECT * FROM t_classes";
            @SuppressWarnings("deprecation")
            List<? extends AbstractBean> list = getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(beanClass), object);
	 
            return list;
        }
        catch (Exception e)
        {
            logger.error(e);
            throw new SMSDataAccessException(e.getCause());
        }
        
    }
    
    @Override
    public List<Map<String, Object>> getObjectList(String sql, Object[] object) throws SMSDataAccessException
    {
        try
        {
            //String sql = "SELECT * FROM t_classes";
            @SuppressWarnings("deprecation")
            List<Map<String, Object>> list = getSimpleJdbcTemplate().queryForList(sql, object);	 
            return list;
        }
        catch (Exception e)
        {
            logger.error(e);
            throw new SMSDataAccessException(e.getCause());
        }
        
    }
    
    
    @Override
    public Object getObject(String sql, Object[] object) throws SMSDataAccessException
    {
        try
        {
            //String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";
            //Object[] object = new Object[]{"1"};
            Object obj = getSimpleJdbcTemplate().queryForObject(sql, Object.class, object);           
            return obj;
        }
        catch (Exception e)
        {
            logger.error(e);
            throw new SMSDataAccessException(e.getCause());
        }
    }
    
    @Override
    public Object getObjectBean(String sql, Class< ? extends AbstractBean> beanClass, Object[] object) throws Exception
    {
        try
        {
            //String sql = "SELECT * FROM t_CUSTOMER WHERE CUST_ID = ?";
            //Object[] object = new Object[]{"1"};
            Object obj = getJdbcTemplate().queryForObject(sql, object, new BeanPropertyRowMapper<>(beanClass));           
            return obj;
        }
        catch (Exception e)
        {
            logger.error(e);
            throw new Exception(e.getCause());
        }
    }
    
    @Override
    public int getIntObject(String sql, Object[] object) throws SMSDataAccessException
    {
        try
        {
            //String sql = "SELECT count(studentId) FROM t_student";
            int obj = getJdbcTemplate().queryForInt(sql, object);
            
            return obj;
        }
        catch (Exception e)
        {
            logger.error(e);
            throw new SMSDataAccessException(e.getCause());
        }
    }
}
