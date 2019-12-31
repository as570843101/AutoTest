package com.course.bean;


import lombok.Data;

@Data
public class User {
    private String userName;
    private String password;
    private String verdion;
    private String Service;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerdion() {
        return verdion;
    }

    public void setVerdion(String verdion) {
        this.verdion = verdion;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }
}
