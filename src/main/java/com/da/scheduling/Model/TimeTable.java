package com.da.scheduling.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class TimeTable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @OneToOne
    private Master master;
    @OneToMany
    private Set<Student> students;
    @OneToMany
    private Set<TimeTableBell> timeTableBells;
    @OneToOne
    private Course course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<TimeTableBell> getTimeTableBells() {
        return timeTableBells;
    }

    public void setTimeTableBells(Set<TimeTableBell> timeTableBells) {
        this.timeTableBells = timeTableBells;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
