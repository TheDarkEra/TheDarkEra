package com.thedarkera.handler;

import com.thedarkera.init.TDEAchievements;
import com.thedarkera.init.TDEBiomes;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EnterBiomeHandler {

	@SubscribeEvent
	public void enterBiome(PlayerEvent event) {
		// Item item = event.player.getHeldItem().getItem();
		World world = event.player.worldObj;
		EntityPlayer player = event.player;
		int x = (int) player.posX;
		int z = (int) player.posZ;
		String x1 = ""+x;
		String z1 = ""+z;
		player.addChatMessage(new ChatComponentText(x1 + " _ " + z1));
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);

		if (biome == TDEBiomes.dark_forest) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Dark Forrest biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome);
		}
		
		if (biome == TDEBiomes.dark_jungle) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Dark Jungle biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome1);
		}
		
		/*if (biome == TDEBiomes.dark_plains) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Dark Plains biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome2);
		}*/
		
		if (biome == TDEBiomes.dark_hills) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Dark Hills biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome3);
		}
		
		if (biome == TDEBiomes.dead_land) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Dead Land biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome4);
		}
		
		if (biome == TDEBiomes.dark_ocean) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Dark Ocean biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome5);
		}
		
		if (biome == TDEBiomes.dark_land) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Dark Land biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome6);
		}
		
		if (biome == TDEBiomes.ancient_land) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Ancient Land biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome7);
		}
		
		if (biome == TDEBiomes.misty_mountains) {
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GRAY + "You entered the Misty Mountain biome"));
			AchievementHandler.setAchieved(TDEAchievements.biome8);
		}
		
	}

}