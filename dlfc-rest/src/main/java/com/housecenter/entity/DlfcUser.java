package com.housecenter.entity;

import java.util.Date;

public class DlfcUser {
    private String id;

    private String uno;

    private String uaccount;

    private String upassword;

    private String uname;

    private Boolean ustatus;

    private String uliaisons;

    private String uliaisonstel;

    private String ucellphone;

    private String uemail;

    private String createuser;

    private Date createtime;

    private String updateuser;

    private Boolean udeleteflag;

    private Date upadtetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno == null ? null : uno.trim();
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount == null ? null : uaccount.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Boolean getUstatus() {
        return ustatus;
    }

    public void setUstatus(Boolean ustatus) {
        this.ustatus = ustatus;
    }

    public String getUliaisons() {
        return uliaisons;
    }

    public void setUliaisons(String uliaisons) {
        this.uliaisons = uliaisons == null ? null : uliaisons.trim();
    }

    public String getUliaisonstel() {
        return uliaisonstel;
    }

    public void setUliaisonstel(String uliaisonstel) {
        this.uliaisonstel = uliaisonstel == null ? null : uliaisonstel.trim();
    }

    public String getUcellphone() {
        return ucellphone;
    }

    public void setUcellphone(String ucellphone) {
        this.ucellphone = ucellphone == null ? null : ucellphone.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
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

    public Boolean getUdeleteflag() {
        return udeleteflag;
    }

    public void setUdeleteflag(Boolean udeleteflag) {
        this.udeleteflag = udeleteflag;
    }

    public Date getUpadtetime() {
        return upadtetime;
    }

    public void setUpadtetime(Date upadtetime) {
        this.upadtetime = upadtetime;
    }
}