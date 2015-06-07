package com.thedarkera.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

import com.thedarkera.init.TDEPotionEffects;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TDEPotionEffectHandler {

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event) {
		if (event.entity instanceof EntityPlayer){
		EntityPlayer player = (EntityPlayer) event.entity;
		if (event.entityLiving.isPotionActive(TDEPotionEffects.Suffocation) && !player.capabilities.isCreativeMode) {

			float i =player.getHealth();
			if (i >= 1){
				player.performHurtAnimation();
				player.addExhaustion(10);
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 10, 2, true));
			}
			}
		}
	}
}
