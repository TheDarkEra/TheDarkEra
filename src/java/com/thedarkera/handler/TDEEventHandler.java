package com.thedarkera.handler;

import com.thedarkera.ztesting.ExtendedPlayerAchievements;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

import com.thedarkera.shouts.ShoutList;
import com.thedarkera.shouts.SoulBar;
import com.thedarkera.ztesting.ExtendedPlayer;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TDEEventHandler {

    // this is unused and should be removed?
	public void onUpdate(PlayerUseItemEvent event) {
		EntityPlayer entity = event.entityPlayer;
		if (entity instanceof EntityPlayerMP && ((EntityPlayerMP) entity).getCurrentEquippedItem() == null) {
			System.out.println("null");
		}
		System.out.println("works");

	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null) {
            event.entity.registerExtendedProperties(ExtendedPlayer.identifier, new ExtendedPlayer((EntityPlayer) event.entity));
            event.entity.registerExtendedProperties(ExtendedPlayerAchievements.identifier, new ExtendedPlayerAchievements((EntityPlayer) event.entity));
        }
	}
}