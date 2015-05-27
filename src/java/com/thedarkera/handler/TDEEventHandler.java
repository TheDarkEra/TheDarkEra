package com.thedarkera.handler;

import com.thedarkera.ztesting.ExtendedPlayerAchievements;
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

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null) {
            event.entity.registerExtendedProperties(ExtendedPlayer.identifier, new ExtendedPlayer((EntityPlayer) event.entity));
            //event.entity.registerExtendedProperties(ExtendedPlayerAchievements.identifier, new ExtendedPlayerAchievements((EntityPlayer) event.entity));
        }
	}
}

// @SubscribeEvent
// public void onEntityConstructing(EntityConstructing event) {
// if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer)
// event.entity) == null)
// ExtendedPlayer.register((EntityPlayer) event.entity);
//
// if (event.entity instanceof EntityPlayer &&
// event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null)
// event.entity.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new
// ExtendedPlayer((EntityPlayer) event.entity));
// }
//
// @SubscribeEvent
// public void onEntityJoinWorld(EntityJoinWorldEvent event) {
// if (event.entity instanceof EntityPlayer && !event.entity.worldObj.isRemote)
// {
// // Using my SimpleNetworkWrapper implementation:
// TheDarkEra.packetPipeline.sendToServer(new PacketSyncMana((EntityPlayer)
// event.entity));
// }
// }
//
// @SubscribeEvent
// public void onClonePlayer(PlayerEvent.Clone event) {
// ExtendedPlayer.get(event.entityPlayer).copy(ExtendedPlayer.get(event.original));
// }
// }