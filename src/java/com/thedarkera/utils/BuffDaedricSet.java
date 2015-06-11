package com.thedarkera.utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class BuffDaedricSet implements IBuffHandler {

    
    public void applyPlayerBuffs(EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 1));
        player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 0));
    }

    @Override
    public void removePlayerBuffs(EntityPlayer player) {

    }

}

