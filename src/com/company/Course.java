package com.company;

public class Course {
    private Obstacle[] obstacles = new Obstacle[2];

    public Course() {
        Obstacle jump = new Obstacle("Прыжки", 2, 0);
        Obstacle run = new Obstacle("Бег", 0, 100);
        obstacles[0] = jump;
        obstacles[1] = run;

    }

    public void doIt(Team team) {
        String result = "Полосу препятсвий прошли: ";
        for (Member member : team.getMembers()) {
            if (testJump(member) && testRun(member))
                result = result + "\n " + member.getName();
        }
        team.setResult(result);
    }

    private boolean testJump(Member member) {
        return member.getHighMember() > obstacles[0].getHigh();

    }

    private boolean testRun(Member member) {
        return member.getTimeMember() < obstacles[1].getTime();

    }
}
