package com.thedarkera.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

import com.google.common.eventbus.Subscribe;
import com.thedarkera.shouts.ShoutList;
import com.thedarkera.shouts.SoulBar;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class TDEEventHandler {

	@SubscribeEvent
	public void onRenderGameOverlay(RenderGameOverlayEvent event) {
		SoulBar.SoulBarRun(event);
		ShoutList.ShoutBarRun(event);
	}

	@SubscribeEvent
	public void onRightClick(PlayerUseItemEvent event) {
		System.out.println(event.entityPlayer.getCurrentEquippedItem());
	}

	public void onUpdate(PlayerUseItemEvent event) {
		EntityPlayer entity = event.entityPlayer;
		if (entity instanceof EntityPlayerMP && ((EntityPlayerMP) entity).getCurrentEquippedItem() == null) {
			System.out.println("null");
		}
		System.out.println("works");

	}

	@Subscribe
    public void entityInteractEvent(EntityInteractEvent event){
		System.out.println("INTERACT");
	  event.entityPlayer.mountEntity(event.target);
	}
}