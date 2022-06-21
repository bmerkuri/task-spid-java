package com.example.demo.model;

import java.util.Date;

public class Base {
    private long id;
    private Date createdAt;

    public Base(long id, Date createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }
    public Base() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
