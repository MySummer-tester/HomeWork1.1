package com.company;

public class Obstacle {
    private String name;
    private int high;
    private int time;

    public Obstacle(String name, int high, int  time){
        this.name = name;
        this.high = high;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public int getHigh() {
        return high;
    }

    public int getTime() {
        return time;
    }
}
