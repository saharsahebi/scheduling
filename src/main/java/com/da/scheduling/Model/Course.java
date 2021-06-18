package com.da.scheduling.Model;

import java.util.ArrayList;

public class Course {
    private int id;
    private String title;
    private int unitsCount;

    private ArrayList<TimeTable> timeTables;
    private ArrayList<Master> masters;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnitsCount() {
        return unitsCount;
    }

    public void setUnitsCount(int unitsCount) {
        this.unitsCount = unitsCount;
    }

    public ArrayList<TimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(ArrayList<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }

    public ArrayList<Master> getMasters() {
        return masters;
    }

    public void setMasters(ArrayList<Master> masters) {
        this.masters = masters;
    }
}

