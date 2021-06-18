package com.da.scheduling.Model;

import java.util.ArrayList;

public class Student {
    private int id;
    private User user;
    private ArrayList<TimeTable> timeTables;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<TimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(ArrayList<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }
}
