package com.newcapec.entity;

import java.util.Date;

/**
 * 用户实体类
 * @author Sunyuhang
 * @date 2022/3/13 23:52
 * @param null
 * @return null
 */
public class User {
    private Integer id;
    private String name;
    private String acct;
    private String pwd;
    private Date crtime;
    private Date uptime;

    public User() {
    }

    public User(String name, String acct, String pwd, Date crtime, Date uptime) {
        this.name = name;
        this.acct = acct;
        this.pwd = pwd;
        this.crtime = crtime;
        this.uptime = uptime;
    }

    public User(Integer id, String name, String acct, String pwd) {
        this.id = id;
        this.name = name;
        this.acct = acct;
        this.pwd = pwd;
    }

    public User(Integer id, String name, String acct, String pwd, Date crtime, Date uptime) {
        this.id = id;
        this.name = name;
        this.acct = acct;
        this.pwd = pwd;
        this.crtime = crtime;
        this.uptime = uptime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acct='" + acct + '\'' +
                ", pwd='" + pwd + '\'' +
                ", crtime=" + crtime +
                ", uptime=" + uptime +
                '}';
    }
}