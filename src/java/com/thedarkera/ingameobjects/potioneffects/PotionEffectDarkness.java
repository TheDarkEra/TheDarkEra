package com.thedarkera.ingameobjects.potioneffects;

import net.minecraft.potion.Potion;

public class PotionEffectDarkness extends Potion {

	public static double effectiveness;

	public PotionEffectDarkness(int ID, boolean isBad, int color) {
		super(ID, isBad, color);
	}

	public boolean isInstant() {
		return false;
	}

	@Override
	public Potion setIconIndex(int par1, int par2) {
		super.setIconIndex(par1, par2);
		return this;
	}

}
