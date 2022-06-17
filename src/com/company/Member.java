package com.company;

public class Member {
    private String name;
    private int highMember;
    private int timeMember;

    public Member(String name, int highMember, int timeMember){
        this.name = name;
        this.highMember = highMember;
        this.timeMember = timeMember;
    }

    public String getName(){
        return this.name;
    }

    public int getHighMember() {
        return highMember;
    }

    public int getTimeMember() {
        return timeMember;
    }
}
