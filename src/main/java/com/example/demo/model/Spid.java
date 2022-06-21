package com.example.demo.model;

import com.example.demo.utils.Status;

import java.util.Date;

public class Spid extends Base {
    private User user;
    private Status status;

    public Spid(long id, Date date, User user) {}

    public Spid(long id, Date createdAt, User user, Status status) {
        super(id, createdAt);
        this.user = user;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
