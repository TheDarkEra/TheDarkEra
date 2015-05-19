package com.thedarkera.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEPotionEffects;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class serverTickHandler {

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		EntityPlayer thePlayer = event.player;
		if (event.player.dimension == TheDarkEra.dimension){
			thePlayer.addPotionEffect(new PotionEffect(TDEPotionEffects.DarknessID, 10, 0, true));
		}
	}

	// Called when the client ticks.
	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent event) {

	}

	// Called when the server ticks. Usually 20 ticks a second.
	@SubscribeEvent
	public void onServerTick(TickEvent.ServerTickEvent event) {

	}

	// Called when a new frame is displayed (See fps)
	@SubscribeEvent
	public void onRenderTick(TickEvent.RenderTickEvent event) {

	}

	// Called when the world ticks
	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {

	}
}
