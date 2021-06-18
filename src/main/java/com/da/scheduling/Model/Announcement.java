package com.da.scheduling.Model;

public class Announcement {
    private int id;
    private int timeTableId;
    private TimeTable timeTable;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(int timeTableId) {
        this.timeTableId = timeTableId;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
