package com.housecenter.entity;

import java.util.Date;

public class DlfcCompany {
    private String id;

    private String cname;

    private String cfullname;

    private String legalperson;

    private String legeltel;

    private String createuser;

    private Date createtime;

    private String updateuser;

    private Date updatetime;

    private Boolean cdeleteflag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCfullname() {
        return cfullname;
    }

    public void setCfullname(String cfullname) {
        this.cfullname = cfullname == null ? null : cfullname.trim();
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    public String getLegeltel() {
        return legeltel;
    }

    public void setLegeltel(String legeltel) {
        this.legeltel = legeltel == null ? null : legeltel.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Boolean getCdeleteflag() {
        return cdeleteflag;
    }

    public void setCdeleteflag(Boolean cdeleteflag) {
        this.cdeleteflag = cdeleteflag;
    }
}