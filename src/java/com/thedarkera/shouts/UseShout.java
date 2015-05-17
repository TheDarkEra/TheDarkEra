package com.thedarkera.shouts;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;

import com.thedarkera.shouts.shouts.Shout;
import com.thedarkera.shouts.shouts.ShoutBreatheInDarkness;


public class UseShout {

	public static boolean CostMana(int manaCost, int x, int y, int z) {
		Shout shout;
		int shoutNumber = ShoutList.getShout();
		SoulBar.removeMana(manaCost);
		switch (shoutNumber) {
		case 0:
			shout = new ShoutBreatheInDarkness(1);
			break;
		case 1:
			System.out.println("SHOUT 2");
			break;
		case 2:
			System.out.println("SHOUT 3");
			break;
		default:
			return false;

		}
		return true;
	}

	public static void Shout(int manaCost, int x, int y, int z, int lookingAtX, int lookingAtY, int lookingAtZ) {
		double i = SoulBar.getMana();
		if (i > manaCost) {
			UseShout.CostMana(20, x, y, z);
		}

	}

	public static void Shout(int manaCost, int x, int y, int z, EntityPlayer player) {
		double i = SoulBar.getMana();
		if (i > manaCost) {
			UseShout.CostMana(20, x, y, z);
		}
	}
}
