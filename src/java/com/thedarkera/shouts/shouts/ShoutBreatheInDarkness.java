package com.thedarkera.shouts.shouts;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;

import com.thedarkera.init.TDEPotionEffects;

public class ShoutBreatheInDarkness extends Shout {

	public ShoutBreatheInDarkness(int duration, EntityPlayer player) {
		super(6, player);
		
	}
	@Override
	public void executeShoutFor(EntityPlayer player){
		player.addPotionEffect(new PotionEffect(TDEPotionEffects.BreatheID, 4000, 0, true));
	}

}
