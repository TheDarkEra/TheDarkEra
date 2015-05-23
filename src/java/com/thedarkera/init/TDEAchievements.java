package com.thedarkera.init;

import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;

public class TDEAchievements {

    public static Achievement test = new Achievement("Test", "This is a test!");
    public static Achievement test2 = new Achievement("Test2", "This is a test!");

    //Real Achievements
    public static Achievement village = new Achievement("Locate Dark Village", "Locate the Dark Village! This is the beginning!");
    public static Achievement travelling = new Achievement("Travel To The Dark", "Teleport To The Dark!");
    public static Achievement stone_upgrade = new Achievement("Dark Stone Upgrade", "Upgrade to Dark Stone Tools.");
    public static Achievement steel_upgrade = new Achievement("Dark Steel Upgrade", "Upgrade to Steel Tools.");
    public static Achievement ancient_tools = new Achievement("Ancient Tools", "Get a fall set of Ancient Tools.");
    
    //Biomes	public static Achievement biome = new Achievement("Find the ", "Find the  Biome");
    public static Achievement biome = new Achievement("Find the Dark Forrest", "Find the Dark Forrest Biome");
    public static Achievement biome1 = new Achievement("Find the Dark Jungle", "Find the Dark Jungle Biome");
    
    public static void init(){
        AchievementHandler.add(test);
        AchievementHandler.add(test2);
        
        //Real Achievements
        AchievementHandler.add(village);
        AchievementHandler.add(travelling);
        AchievementHandler.add(stone_upgrade);
        AchievementHandler.add(steel_upgrade);
        AchievementHandler.add(ancient_tools);
        
        //Biomes
        AchievementHandler.add(biome);
        AchievementHandler.add(biome1);
    }

}
