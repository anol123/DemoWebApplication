package com.mySpringBootProject.demoWebApp.todos;

import java.time.LocalDate;

public class Todos {
    private int id;
    private String username;
    private String Description;
    private LocalDate targetDate;
    private boolean done;

    public Todos(int id, String username, String description, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        Description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return Description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", Description='" + Description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
