package com.thedarkera.init;

import net.minecraft.potion.Potion;

import com.thedarkera.ingameobjects.potioneffects.PotionEffectDarkness;

public class TDEPotionEffects {

	public static Potion Suffocation, Breathe;

	public static int DarknessID = 30;
	public static int BreatheID = 31;

	public static void init() {
		Suffocation = (new PotionEffectDarkness(DarknessID, true, 0)).setIconIndex(0, 0).setPotionName("Suffocation");
		Breathe = (new PotionEffectDarkness(BreatheID, true, 0)).setIconIndex(0, 0).setPotionName("");

	}
}
