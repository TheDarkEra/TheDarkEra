package com.thedarkera.shouts;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;

public class UseShout {

	public static boolean CostMana(int manaCost, int x, int y, int z) {
		int shout = ShoutList.getShout();
		SoulBar.removeMana(manaCost);
		switch (shout) {
		case 0:
			System.out.println("1");
			break;
		case 1:
			System.out.println("2");
			break;
		case 2:
			System.out.println("3");
			break;
		default:
			break;

		}
		return false;
	}

	public static void Shout(int manaCost, int x, int y, int z, int lookingAtX, int lookingAtY, int lookingAtZ) {
		double i = SoulBar.getMana();
		if (i > manaCost) {
			UseShout.CostMana(20, x, y, z);
		}

	}

	public static void Shout(int manaCost, int x, int y, int z) {
		double i = SoulBar.getMana();
		if (i > manaCost) {
			UseShout.CostMana(20, x, y, z);
		}
	}
}
