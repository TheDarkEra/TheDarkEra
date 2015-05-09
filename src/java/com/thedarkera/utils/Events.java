package com.thedarkera.utils;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;

import com.thedarkera.ztesting.SoulBar;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Events {
	int width = 0;

	@SubscribeEvent
	public void onRenderGameOverlay(RenderGameOverlayEvent event) {
		SoulBar.SoulBarRun(event);
	}
	@SubscribeEvent
	public void ItemTossEvent(ItemTossEvent event) {
		SoulBar.addMana(1);
	}
}
