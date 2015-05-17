package com.thedarkera.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.thedarkera.init.TDEPotionEffects;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TDEPotionEffectHandler {

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		if (event.entityLiving.isPotionActive(TDEPotionEffects.Darkness)) {
			System.out.println("WORKING POTION");
			EntityPlayer player = (EntityPlayer) event.entity;
			player.addChatComponentMessage(new ChatComponentText("TEST"));

		}
	}
}
