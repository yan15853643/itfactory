package com.housecenter.entity;

public class DlfcUserCompany {
    private String id;

    private String uid;

    private String cid;

    private Boolean ucdeleteflag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Boolean getUcdeleteflag() {
        return ucdeleteflag;
    }

    public void setUcdeleteflag(Boolean ucdeleteflag) {
        this.ucdeleteflag = ucdeleteflag;
    }
}