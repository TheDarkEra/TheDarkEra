package com.thedarkera.init;

import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;

public class TDEAchievements {

    public static Achievement test = new Achievement("Test", "This is a test!");
    public static Achievement test2 = new Achievement("Test2", "This is a test!");

    public static void init(){
        AchievementHandler.add(test);
        AchievementHandler.add(test2);
    }

}
