package com.solid.domain.models;

public class User {

    private String name;
    private String email;
    private String sms;

    public User(String email, String name, String sms) {
        this.email = email;
        this.name = name;
        this.sms = sms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }
}
