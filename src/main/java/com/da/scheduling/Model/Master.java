package com.da.scheduling.Model;

import java.util.ArrayList;
import java.util.List;

public class Master {
    private int id;
    private User user;
    private List<TimeTableBell> timeTableBells;
    private List<TimeTable> timeTables;
    private List<Course> courses;

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

    public List<TimeTableBell> getTimeTableBells() {
        return timeTableBells;
    }

    public void setTimeTableBells(List<TimeTableBell> timeTableBells) {
        this.timeTableBells = timeTableBells;
    }

    public List<TimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(List<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

