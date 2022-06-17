package com.company;

public class Team {
    private String name;
    private Member[] members;
    private String result;

    public Team(String name, Member[] members){
        this.name = name;
        this.members = members;

    }

    public String getName(){
        return this.name;
    }

    public Member[] getMembers(){
        return this.members;

    }

    public String getInfoTeam(){
        String result = "Команда \"" + this.name + "\" состоит из:";
        for (Member member : members){
            result = result + "\n " + member.getName();
        }
        return result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void showResult(){
        System.out.println(getResult());


    }

}


