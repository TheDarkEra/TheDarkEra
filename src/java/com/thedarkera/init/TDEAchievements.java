package com.thedarkera.init;

import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;

public class TDEAchievements {

    //Real Achievements
    public static Achievement village = new Achievement("Dark Village", "Locate the Dark Village! This is the beginning!");
    public static Achievement travelling = new Achievement("The Dark", "Teleport To The Dark!");
    public static Achievement stone_upgrade = new Achievement("Dark Stone Tools", "Upgrade to Dark Stone Tools.");
    public static Achievement steel_upgrade = new Achievement("Dark Steel Tools", "Upgrade to Steel Tools.");
    public static Achievement ancient_tools = new Achievement("Ancient Tools", "Get a fall set of Ancient Tools.");
    public static Achievement dragon_slayer = new Achievement("Dragon Slayer", "Kill a dragon!");
    
    //Biomes	
    public static Achievement biome = new Achievement("Dark Forrest", "Find the Dark Forrest Biome");
    public static Achievement biome1 = new Achievement("Dark Jungle", "Find the Dark Jungle Biome");
    public static Achievement biome2 = new Achievement("Dark Plains", "Find the Dark Plains Biome");
    public static Achievement biome3 = new Achievement("Dark Hills", "Find the Dark Hills Biome");
    public static Achievement biome4 = new Achievement("Dead Land", "Find the Dead Land Biome");
    public static Achievement biome5 = new Achievement("Dark Ocean", "Find the Dark Ocean Biome");
    public static Achievement biome6= new Achievement("Dark Land", "Find the Dark Land Biome");
    public static Achievement biome7 = new Achievement("Ancient Land", "Find the Ancient Land Biome");
    public static Achievement biome8 = new Achievement("Misty Mountain", "Find the Misty Mountain Biome");
    
    
    public static void init(){

        //Real Achievements
        AchievementHandler.add(village);
        AchievementHandler.add(travelling);
        AchievementHandler.add(stone_upgrade);
        AchievementHandler.add(steel_upgrade);
        AchievementHandler.add(ancient_tools);
        AchievementHandler.add(dragon_slayer);
        
        //Biomes
        AchievementHandler.add(biome);
        AchievementHandler.add(biome1);
        AchievementHandler.add(biome2);
        AchievementHandler.add(biome3);
        AchievementHandler.add(biome4);
        AchievementHandler.add(biome5);
        AchievementHandler.add(biome6);
        AchievementHandler.add(biome7);
        AchievementHandler.add(biome8);
        
        
    }

}
