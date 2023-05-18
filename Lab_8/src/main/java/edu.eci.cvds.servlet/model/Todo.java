package edu.eci.cvds.servlet.model;

public class Todo {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public void Todo(){}

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int anUserId) {
        this.userId = anUserId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int anId) {
        this.id = anId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String aTitle) {
        this.title = aTitle;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed1) {
        this.completed = completed1;
    }
}