package com.example.aseel.myfinalapp;

public class TopScorer {
    private String rank;
    private String name;
    private String app;
    private String minutes;
    private String goalspermatch;
    private String goals;
    private int picture;


    public TopScorer(String rank, String name, String app, String minutes, String goalspermatch, String goals, int picture) {
        this.rank=rank;
        this.name = name;
        this.app = app;
        this.minutes = minutes;
        this.goalspermatch = goalspermatch;
        this.goals = goals;
        this.picture = picture;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getGoalspermatch() {
        return goalspermatch;
    }

    public void setGoalspermatch(String goalspermatch) {
        this.goalspermatch = goalspermatch;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
