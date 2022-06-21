package com.example.demo.model;

import java.util.Date;

public class User extends Base {
    private String name;
    private String surname;
    private String username;
    private Spid spid;

    public User(long id, Date date, String name, String surname, String username) {}

    public User(long id, Date createdAt, String name, String surname, String username, Spid spid) {
        super(id, createdAt);
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.spid = spid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Spid getSpid() {
        return spid;
    }

    public void setSpid(Spid spid) {
        this.spid = spid;
    }
}
