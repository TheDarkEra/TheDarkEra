package com.thedarkera.shouts.shouts;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class Shout {

	public static int duration;
	public static EntityPlayer player;

	public Shout(int duration, EntityPlayer player) {
		super();
		this.duration = duration;
		this.player = player;
	}

	public void executeShoutFor() {
		int i = duration * 20;
		for (int j = 0; j < i; j++) {
			String a = ("Executed: " + j);
			switch (j) {
			case 20:

				player.addChatComponentMessage(new ChatComponentText(a));
				break;
			case 40:
				player.addChatComponentMessage(new ChatComponentText(a));
				break;
			case 60:
				player.addChatComponentMessage(new ChatComponentText(a));
				break;
			case 80:
				player.addChatComponentMessage(new ChatComponentText(a));
				break;
			case 100:
				player.addChatComponentMessage(new ChatComponentText(a));
				break;
			case 120:
				player.addChatComponentMessage(new ChatComponentText(a));
				break;
			}

		}
	}
}
