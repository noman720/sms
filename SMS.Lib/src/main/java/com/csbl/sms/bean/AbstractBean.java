package main.java.com.csbl.sms.bean;

import java.io.Serializable;

public abstract class AbstractBean implements Serializable {

    protected String oid;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }




}
