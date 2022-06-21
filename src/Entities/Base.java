package Entities;

import java.util.Date;

public class Base {
    private long id;
    private Date createdAt;

    public Base() {
    }

    public Base(long id, Date createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    /**
     * get field
     *
     * @return id
     */
    public long getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return createdAt
     */
    public Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * set field
     *
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
