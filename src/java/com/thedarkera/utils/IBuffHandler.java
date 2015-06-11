package com.thedarkera.utils;

import net.minecraft.entity.player.EntityPlayer;

public interface IBuffHandler {

    public abstract void applyPlayerBuffs(EntityPlayer player);

    public abstract void removePlayerBuffs(EntityPlayer player);
}

