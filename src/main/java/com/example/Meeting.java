package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Meeting {

    private static final AtomicInteger COUNTER = new AtomicInteger();

    private int id;
    private String description;
    private String date;

    public Meeting(String description, String date) {
        this.description = description;
        this.date = date;
    }

    public Meeting() {
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
