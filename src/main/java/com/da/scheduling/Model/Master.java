package com.da.scheduling.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Master {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @OneToOne
    private User user;
    @OneToMany
    private Set<TimeTableBell> timeTableBells;
    @OneToMany
    private Set<TimeTable> timeTables;
    @OneToMany
    private Set<Course> courses;

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

    public Set<TimeTableBell> getTimeTableBells() {
        return timeTableBells;
    }

    public void setTimeTableBells(Set<TimeTableBell> timeTableBells) {
        this.timeTableBells = timeTableBells;
    }

    public Set<TimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(Set<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}

