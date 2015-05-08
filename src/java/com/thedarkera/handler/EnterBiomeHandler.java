package com.thedarkera.handler;

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
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);

		if (player instanceof EntityPlayer && biome == TDEBiomes.dark_land) {
			System.out.println("works!");
			player.addChatMessage(new ChatComponentText(
					EnumChatFormatting.DARK_GRAY
							+ "You entered the Dark Land biome"));

		}
		if (player instanceof EntityPlayer && biome == TDEBiomes.dark_forrest) {
			System.out.println("works!");
			player.addChatMessage(new ChatComponentText(
					EnumChatFormatting.DARK_GRAY
							+ "You entered the Dark Forrest biome"));

		}
	}

}