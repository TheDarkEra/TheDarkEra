package com.thedarkera.handler;

import net.minecraft.item.Item;

import com.thedarkera.init.TDEAchievements;
import com.thedarkera.init.TDETools;
import com.thedarkera.init.TDEWeapons;
import com.thedarkera.score.ScoreStat;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class AchievedHandler {

	@SubscribeEvent
	public void onCrafted(ItemCraftedEvent event) {
		Item item = event.crafting.getItem();

		if (item.equals(TDETools.dark_stone_pickaxe) || item.equals(TDETools.dark_stone_axe) || item.equals(TDETools.dark_stone_shovel) || item.equals(TDETools.dark_stone_hoe) || item.equals(TDEWeapons.dark_stone_sword)) {
			AchievementHandler.setAchieved(TDEAchievements.stone_upgrade);
			ScoreStat.addScore(1);
		}

		if (item.equals(TDETools.steel_pickaxe) || item.equals(TDETools.steel_axe) || item.equals(TDETools.steel_shovel) || item.equals(TDETools.steel_hoe) || item.equals(TDEWeapons.steel_sword)) {
			AchievementHandler.setAchieved(TDEAchievements.steel_upgrade);
			ScoreStat.addScore(1);
		}
	}

	@SubscribeEvent
	public void onItemPickup(ItemPickupEvent event){
		Item item = event.pickedUp.getEntityItem().getItem();
		
		if(item.equals(TDETools.ancient_pickaxe) || item.equals(TDETools.ancient_axe) || item.equals(TDETools.ancient_shovel) || item.equals(TDETools.ancient_hoe) || item.equals(TDEWeapons.ancient_dagger) || item.equals(TDEWeapons.ancient_sword)){
			AchievementHandler.setAchieved(TDEAchievements.ancient_upgrade);
			ScoreStat.addScore(1);
		}
		if(item.equals(TDEWeapons.death_sword)){
			AchievementHandler.setAchieved(TDEAchievements.death_lord);
			ScoreStat.addScore(1);
		}
	}
	

}
