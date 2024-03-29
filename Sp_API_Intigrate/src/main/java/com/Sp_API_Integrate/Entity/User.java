package com.Sp_API_Integrate.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private int userId;
    //private int id;
    private String title;
    //private boolean completed;
    @JsonProperty("completed")
    private boolean status;

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
/*  public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }   */
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
/*  public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }   */
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
