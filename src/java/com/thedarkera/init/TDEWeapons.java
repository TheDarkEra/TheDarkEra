package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.weapon.ItemDaedricArrow;
import com.thedarkera.item.weapon.ItemDaedricBow;
import com.thedarkera.item.weapon.ItemModDagger;
import com.thedarkera.item.weapon.ItemModSword;
import com.thedarkera.utils.RegUtils;

public class TDEWeapons {
	public static Item steel_sword;
	public static Item dark_stone_sword;
	public static Item daedric_bow;
	public static Item daedric_arrow;
	public static Item steel_dagger;

	public static void init() {
		// swords
		steel_sword = new ItemModSword(TDEMaterials.steel, "steel_sword");
		reg(steel_sword);
		dark_stone_sword = new ItemModSword(TDEMaterials.dark_stone,
				"dark_stone_sword");
		reg(dark_stone_sword);

		// Bows
		daedric_bow = new ItemDaedricBow("daedric_bow");
		reg(daedric_bow);

		// Arrows
		daedric_arrow = new ItemDaedricArrow("daedric_arrow");
		reg(daedric_arrow);

		// Daggers
		steel_dagger = new ItemModDagger(TDEMaterials.steel, "steel_dagger");
		reg(steel_dagger);
	}

	public static void reg(Item item) {
		RegUtils.reg(item);
	}
}
