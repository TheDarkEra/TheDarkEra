package com.thedarkera.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.thedarkera.init.TDEAchievements;
import com.thedarkera.init.TDETools;
import com.thedarkera.init.TDEWeapons;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class AchievedHandler {

	@SubscribeEvent
	public void onCrafted(ItemCraftedEvent event) {
		EntityPlayer player = event.player;
		Item item = event.crafting.getItem();

		if (item.equals(TDETools.dark_stone_pickaxe) || item.equals(TDETools.dark_stone_axe) || item.equals(TDETools.dark_stone_shovel) || item.equals(TDETools.dark_stone_hoe) || item.equals(TDEWeapons.dark_stone_sword)) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GREEN + "Achievement Get: " + EnumChatFormatting.DARK_RED + "Stone Upgrade!"));
			AchievementHandler.setAchieved(TDEAchievements.stone_upgrade);
		}

		if (item.equals(TDETools.steel_pickaxe) || item.equals(TDETools.steel_axe) || item.equals(TDETools.steel_shovel) || item.equals(TDETools.steel_hoe) || item.equals(TDEWeapons.steel_sword)) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GREEN + "Achievement Get: " + EnumChatFormatting.DARK_RED + "Steel Upgrade!"));
			AchievementHandler.setAchieved(TDEAchievements.steel_upgrade);
		}
	}

	@SubscribeEvent
	public void onItemPickup(ItemPickupEvent event){
		EntityPlayer player = event.player;
		Item item = event.pickedUp.getEntityItem().getItem();
		
		if(item.equals(TDETools.ancient_pickaxe) || item.equals(TDETools.ancient_axe) || item.equals(TDETools.ancient_shovel) || item.equals(TDETools.ancient_hoe) || item.equals(TDEWeapons.ancient_dagger) || item.equals(TDEWeapons.ancient_sword)){
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GREEN + "Achievement Get: " + EnumChatFormatting.DARK_RED + "Stone Upgrade!"));
			AchievementHandler.setAchieved(TDEAchievements.ancient_upgrade);
		}
	}
	
	

}
