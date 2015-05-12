package com.thedarkera.utils;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

import com.google.common.eventbus.Subscribe;
import com.thedarkera.ztesting.ShoutList;
import com.thedarkera.ztesting.SoulBar;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Events {

	@SubscribeEvent
	public void onRenderGameOverlay(RenderGameOverlayEvent event) {
		SoulBar.SoulBarRun(event);
		ShoutList.ShoutBarRun(event);
	}

	@SubscribeEvent
	public void ItemTossEvent(ItemTossEvent event) {
		SoulBar.removeMana(10);
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