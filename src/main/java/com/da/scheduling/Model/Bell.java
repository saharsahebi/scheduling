package com.da.scheduling.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bell {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String label;
    private int bellOfDay;

    public int getBellOfDay() { return bellOfDay; }

    public void setBellOfDay(int bellOfDay) { this.bellOfDay = bellOfDay; }

    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
