package com.da.scheduling.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
@Entity
public class TimeTable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Master master;
    private ArrayList<Student> students;
    private ArrayList<TimeTableBell> timeTableBells;
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<TimeTableBell> getTimeTableBells() {
        return timeTableBells;
    }

    public void setTimeTableBells(ArrayList<TimeTableBell> timeTableBells) {
        this.timeTableBells = timeTableBells;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
