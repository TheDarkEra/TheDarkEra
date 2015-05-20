package com.thedarkera.shouts.shouts;

import net.minecraft.entity.player.EntityPlayer;

public class Shout {

	public int duration;
	public EntityPlayer player;

	public Shout(int duration, EntityPlayer player) {
		super();
		this.duration = duration;
		this.player = player;
	}

	public void executeShoutFor(EntityPlayer player) {

	}
}
