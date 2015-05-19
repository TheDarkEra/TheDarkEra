package com.thedarkera.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEPotionEffects;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TDEPotionEffectHandler {

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		if (event.entityLiving.isPotionActive(TDEPotionEffects.Darkness)) {
			EntityPlayer player = (EntityPlayer) event.entity;
			float i =player.getHealth();
			if (i >= 1){
				player.performHurtAnimation();
				player.addExhaustion(10);
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 10, 2, true));
			}
		}
	}
}
