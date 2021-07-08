package com.da.scheduling.Model;


import javax.persistence.*;

@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int timeTablesId;
    @OneToOne
    private TimeTable timeTable;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeTablesId() {
        return timeTablesId;
    }

    public void setTimeTablesId(int timeTablesId) {
        this.timeTablesId = timeTablesId;
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
