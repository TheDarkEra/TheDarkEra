package com.thedarkera.utils;

public class Achievement {

    private String name, desc;
    private boolean achieved = false;

    public Achievement(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return desc;
    }

    public void setAchieved(boolean achieved){
        this.achieved = achieved;
    }

    public boolean isAchieved(){
        return achieved;
    }

}
