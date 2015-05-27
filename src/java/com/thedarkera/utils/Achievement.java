package com.thedarkera.utils;

import java.util.List;

public class Achievement {

    private String name;
    private List desc;
    private boolean achieved = false;

    public Achievement(String name, List desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName(){
        return name;
    }

    public List getDescription(){
        return desc;
    }

    public void setAchieved(boolean achieved){
        this.achieved = achieved;
    }

    public boolean isAchieved(){
        return achieved;
    }

}
