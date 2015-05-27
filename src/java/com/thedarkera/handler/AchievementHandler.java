package com.thedarkera.handler;

import com.thedarkera.TheDarkEra;
import com.thedarkera.utils.Achievement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AchievementHandler {

    public static Map<String, Achievement> achievements = new HashMap<>(); //
    public static List<String> achievementNames = new ArrayList<>();

    public static void add(Achievement achievement){
        String name = achievement.getName();
        if(!achievements.containsKey(name)) {
            achievements.put(name, achievement);
            achievementNames.add(name);
        }else{
            TheDarkEra.logger.warn(name + " is already registered!");
        }
    }

    //not needed, but okay
    public static void remove(Achievement achievement){
        String name = achievement.getName();
        if(achievements.containsKey(name)){
            achievements.remove(name);
            achievementNames.remove(name);
        }else{
            TheDarkEra.logger.warn(name + " cannot be removed because it isn't registered!");
        }
    }

    public static Achievement get(String name){
        return achievements.get(name);
    }

    public static void setAchieved(Achievement achievement) {
        String name = achievement.getName();
        if (achievements.containsKey(name)) {
            if(!achievements.get(name).isAchieved()){
                achievements.get(name).setAchieved(true);
            }
        }else{
            TheDarkEra.logger.warn(name + " cannot be achieved because it isn't registered!");
        }
    }

    public static int getAmount(){
        return achievements.size();
    }

    public int getPagesNeeded() {
        double amount = (double) achievements.size() / 16D;
        return (int) Math.ceil(amount) * 2;
    }
}
