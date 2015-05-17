package com.thedarkera.init;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;

import com.thedarkera.ingameobjects.potioneffects.PotionEffectDarkness;

public class TDEPotionEffects {

	public static Potion Darkness;

	public static int DarknessID = 30;

	public static void init() {

		Darkness = (new PotionEffectDarkness(1, true, 0)).setIconIndex(0, 0).setPotionName("Drowning");

	}
}
