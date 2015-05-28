package com.thedarkera.init;

import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;

import java.util.Arrays;
import java.util.List;

import net.minecraft.util.EnumChatFormatting;

public class TDEAchievements {

	/** --Categories--
	 * Biomes = Dark Green
	 * Combat = Blue
	 * Tools = Aqua
	 * Dimensions = Grey
	 * Structures = Green
	 * Crafting = Yellow	
	*/
	
    public static Achievement village = new Achievement("Dark Village", Arrays.asList("Locate the Dark Village", EnumChatFormatting.GREEN + "Structures"));
    public static Achievement travelling = new Achievement("The Dark", Arrays.asList("Teleport To The Dark", EnumChatFormatting.GRAY + "Dimensions"));
    public static Achievement stone_upgrade = new Achievement("Stone Upgrade", Arrays.asList("Upgrade to Dark Stone Tools", EnumChatFormatting.AQUA + "Tools"));
    public static Achievement steel_upgrade = new Achievement("Steel Upgrade", Arrays.asList("Upgrade to Steel Tools", EnumChatFormatting.AQUA + "Tools"));
    public static Achievement ancient_upgrade = new Achievement("Ancient Upgrade", Arrays.asList("Find a Ancient Tool", EnumChatFormatting.AQUA + "Tools"));
    public static Achievement dragon_slayer = new Achievement("Dragon Slayer", Arrays.asList("Kill a dragon", EnumChatFormatting.BLUE + "Combat"));
    public static Achievement death_lord = new Achievement("Death Killer", Arrays.asList("Kill the Death Lord and pickup the Death Sword", EnumChatFormatting.BLUE + "Combat"));
    public static Achievement workbench = new Achievement("Workbench Crafter", Arrays.asList("Make a workbench", EnumChatFormatting.GOLD + "Crafting"));
    public static Achievement smeltery = new Achievement("Dark Smelter", Arrays.asList("Make a smeltery", EnumChatFormatting.GOLD + "Crafting"));
    public static Achievement forge = new Achievement("Armor Crafter", Arrays.asList("Make a smithing forge", EnumChatFormatting.GOLD + "Crafting"));
    public static Achievement grind_stone = new Achievement("Tool Crafter", Arrays.asList("Make a grind stone", EnumChatFormatting.GOLD + "Crafting"));
    public static Achievement anvil = new Achievement("Tool Upgrader", Arrays.asList("Make a dark anvil", EnumChatFormatting.GOLD + "Crafting"));
    public static Achievement alchemy_table = new Achievement("Potion Mixer", Arrays.asList("Make a alchemy table", EnumChatFormatting.GOLD + "Crafting"));
    public static Achievement rune_table = new Achievement("Rune Enchanter", Arrays.asList("Make a rune table", EnumChatFormatting.GOLD + "Crafting"));
    public static Achievement biome = new Achievement("Dark Forrest", Arrays.asList("Find the Dark Forrest Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome1 = new Achievement("Dark Jungle", Arrays.asList("Find the Dark Jungle Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome2 = new Achievement("Dark Plains", Arrays.asList("Find the Dark Plains Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome3 = new Achievement("Dark Hills", Arrays.asList("Find the Dark Hills Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome4 = new Achievement("Dead Land", Arrays.asList("Find the Dead Land Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome5 = new Achievement("Dark Ocean", Arrays.asList("Find the Dark Ocean Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome6= new Achievement("Dark Land", Arrays.asList("Find the Dark Land Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome7 = new Achievement("Ancient Land", Arrays.asList("Find the Ancient Land Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome8 = new Achievement("Misty Mountains", Arrays.asList("Find the Misty Mountains Biome", EnumChatFormatting.DARK_RED + "Located inside the Dark Hills biome only", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome9 = new Achievement("Magical Forrest", Arrays.asList("Find the Magical Forrest Biome", EnumChatFormatting.DARK_GREEN + "Biomes"));
    public static Achievement biome10 = new Achievement("Roofed Forrest", Arrays.asList("Find the Dark Roofed Forrest", EnumChatFormatting.DARK_RED + "Located inside the Dark Forrest biome only", EnumChatFormatting.DARK_GREEN + "Biomes"));
    
    
    public static void init(){

    	/*
    	AchievementHandler.add(test);
    	AchievementHandler.add(test2);
    	AchievementHandler.add(test3);
    	AchievementHandler.add(test4);
    	AchievementHandler.add(test5);
    	AchievementHandler.add(test6);
    	*/
    	
    	//Crafting/Pickups
    	AchievementHandler.add(ancient_upgrade);
        AchievementHandler.add(stone_upgrade);
        AchievementHandler.add(steel_upgrade);
        AchievementHandler.add(workbench);
        AchievementHandler.add(smeltery);
        AchievementHandler.add(forge);
        AchievementHandler.add(grind_stone);
        AchievementHandler.add(anvil);
        AchievementHandler.add(alchemy_table);
        AchievementHandler.add(rune_table);
    	
    	//Killing Mobs
        AchievementHandler.add(dragon_slayer);
        AchievementHandler.add(death_lord);;
    	
    	//Travelling
        AchievementHandler.add(village);
        AchievementHandler.add(travelling);
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
