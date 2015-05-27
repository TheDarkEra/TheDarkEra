package com.thedarkera.init;

import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;

import java.util.Arrays;
import java.util.List;

public class TDEAchievements {

	/*
	public static Achievement test = new Achievement("test1","test1");
	public static Achievement test2 = new Achievement("test2","test2");
	public static Achievement test3 = new Achievement("test3","test3");
	public static Achievement test4 = new Achievement("test4","test4");
	public static Achievement test5 = new Achievement("test5","test5");
	public static Achievement test6 = new Achievement("test6","test6");
	*/
	
    //Real Achievements
    public static Achievement village = new Achievement("Dark Village", Arrays.asList("Locate the Dark Village! This is the beginning!"));
    public static Achievement travelling = new Achievement("The Dark", Arrays.asList("Teleport To The Dark!"));
    public static Achievement stone_upgrade = new Achievement("Stone Upgrade", Arrays.asList("Upgrade to Dark Stone Tools."));
    public static Achievement steel_upgrade = new Achievement("Steel Upgrade", Arrays.asList("Upgrade to Steel Tools."));
    public static Achievement ancient_upgrade = new Achievement("Ancient Upgrade", Arrays.asList("Get a fall set of Ancient Tools."));
    public static Achievement dragon_slayer = new Achievement("Dragon Slayer", Arrays.asList("Kill a dragon!"));
    
    //Biomes	
    public static Achievement biome = new Achievement("Dark Forrest", Arrays.asList("Find the Dark Forrest Biome"));
    public static Achievement biome1 = new Achievement("Dark Jungle", Arrays.asList("Find the Dark Jungle Biome"));
    public static Achievement biome2 = new Achievement("Dark Plains", Arrays.asList("Find the Dark Plains Biome"));
    public static Achievement biome3 = new Achievement("Dark Hills", Arrays.asList("Find the Dark Hills Biome"));
    public static Achievement biome4 = new Achievement("Dead Land", Arrays.asList("Find the Dead Land Biome"));
    public static Achievement biome5 = new Achievement("Dark Ocean", Arrays.asList("Find the Dark Ocean Biome"));
    public static Achievement biome6= new Achievement("Dark Land", Arrays.asList("Find the Dark Land Biome"));
    public static Achievement biome7 = new Achievement("Ancient Land", Arrays.asList("Find the Ancient Land Biome"));
    public static Achievement biome8 = new Achievement("Misty Mountains", Arrays.asList("Find the Misty Mountains Biome - Located inside the Dark Hills biome only", "Dan your extra info here!"));
    public static Achievement biome9 = new Achievement("Magical Forest", Arrays.asList("Find the Magical Forrest Biome"));
    public static Achievement biome10 = new Achievement("Dark Roofed Forrest", Arrays.asList("Find the Dark Roofed Forrest - Located inside the Dark Forrest biome only"));
    
    
    public static void init(){

    	/*
    	AchievementHandler.add(test);
    	AchievementHandler.add(test2);
    	AchievementHandler.add(test3);
    	AchievementHandler.add(test4);
    	AchievementHandler.add(test5);
    	AchievementHandler.add(test6);
    	*/
    	// TODO: Needs ordering better to suit book better.
    	
    	AchievementHandler.add(ancient_upgrade);
        AchievementHandler.add(village);
        AchievementHandler.add(travelling);
        AchievementHandler.add(stone_upgrade);
        AchievementHandler.add(steel_upgrade);
        AchievementHandler.add(dragon_slayer);
        AchievementHandler.add(biome);   // Dark Forrest
        AchievementHandler.add(biome1);  // Dark Jungle
        AchievementHandler.add(biome2);  // Dark Plains
        AchievementHandler.add(biome3);  // Dark Hills
        AchievementHandler.add(biome4);  // Dark Land
        AchievementHandler.add(biome5);  // Dark Ocean
        AchievementHandler.add(biome6);  // Dark Land
        AchievementHandler.add(biome7);  // Ancient Land
        AchievementHandler.add(biome8);  // Misty Mountains
        AchievementHandler.add(biome9);  // Magical Forrest
        AchievementHandler.add(biome10); // Dark Roofed Forrest        
        
        
    }

}
