package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.ItemAchievementBook;
import com.thedarkera.item.ItemAncientIngot;
import com.thedarkera.item.ItemAshHopperJelly;
import com.thedarkera.item.ItemAshHopperLeg;
import com.thedarkera.item.ItemDaedraHeart;
import com.thedarkera.item.ItemDarkStoneRod;
import com.thedarkera.item.ItemDragonBone;
import com.thedarkera.item.ItemDragonScale;
import com.thedarkera.item.ItemEbonyIngot;
import com.thedarkera.item.ItemFireRune;
import com.thedarkera.item.ItemFrostRune;
import com.thedarkera.item.ItemLeatherStrip;
import com.thedarkera.item.ItemLightningRune;
import com.thedarkera.item.ItemOrichalcumIngot;
import com.thedarkera.item.ItemRottenWoodStick;
import com.thedarkera.item.ItemSoulGem;
import com.thedarkera.item.ItemSteelIngot;
import com.thedarkera.item.ItemWitchFeather;
import com.thedarkera.item.food.ItemAshHopperMeat;
import com.thedarkera.item.food.ItemGrape;
import com.thedarkera.item.tool.ItemShout;
import com.thedarkera.placeableitem.ItemPlaceAbleExample;
import com.thedarkera.utils.RegUtils;

public class TDEItems {
	// Misc items//
	public static Item witch_feather;
	public static Item ash_hopper_leg;
	public static Item ash_hopper_jelly;
	public static Item ash_hopper_meat;
	public static Item rotten_wood_stick;
	public static Item dark_stone_rod;
	public static Item soul_gem;
	public static Item leather_strip;
	public static Item daedra_heart;
	public static Item dragon_bone;
	public static Item dragon_scale;
	public static Item fire_rune;
	public static Item frost_rune;
	public static Item lightning_rune;
	public static Item achievement_book;
	public static Item shout;

	// Ingot items//
	public static Item steel_ingot;
	public static Item ebony_ingot;
	public static Item orichalcum_ingot;
	public static Item ancient_ingot;

	// Food items//
	public static Item grape;

	// Seed items//
	public static Item grape_seed;

	// Placeable items//
	public static Item example;

	// Plant items//

	public static void init() {
		// Misc items init//
		witch_feather = new ItemWitchFeather();
		reg(witch_feather);
		ash_hopper_meat = new ItemAshHopperMeat(3, 0.3F, true,
				"ash_hopper_meat");
		reg(ash_hopper_meat);
		ash_hopper_jelly = new ItemAshHopperJelly();
		reg(ash_hopper_jelly);
		ash_hopper_leg = new ItemAshHopperLeg();
		reg(ash_hopper_leg);
		rotten_wood_stick = new ItemRottenWoodStick();
		reg(rotten_wood_stick);
		dark_stone_rod = new ItemDarkStoneRod();
		reg(dark_stone_rod);
		soul_gem = new ItemSoulGem();
		reg(soul_gem);
		leather_strip = new ItemLeatherStrip();
		reg(leather_strip);
		daedra_heart = new ItemDaedraHeart();
		reg(daedra_heart);
		dragon_bone = new ItemDragonBone();
		reg(dragon_bone);
		dragon_scale = new ItemDragonScale();
		reg(dragon_scale);
		fire_rune = new ItemFireRune();
		reg(fire_rune);
		frost_rune = new ItemFrostRune();
		reg(frost_rune);
		lightning_rune = new ItemLightningRune();
		reg(lightning_rune);
		achievement_book = new ItemAchievementBook();
		reg(achievement_book);
		shout = new ItemShout();
		reg(shout);

		// Ingot items init//
		steel_ingot = new ItemSteelIngot();
		reg(steel_ingot);
		ebony_ingot = new ItemEbonyIngot();
		reg(ebony_ingot);
		orichalcum_ingot = new ItemOrichalcumIngot();
		reg(orichalcum_ingot);
		ancient_ingot = new ItemAncientIngot();
		reg(ancient_ingot);

		// Food items init//
		grape = new ItemGrape(3, 0.3F, true, "grape");
		reg(grape);

		// Seed items//
//		grape_seed = new ItemGrapeSeed(TDEBlocks.grape_plant);
//		reg(grape_seed);

		// Placeable items//
		example = new ItemPlaceAbleExample();
	}

	public static void reg(Item item) {
		RegUtils.reg(item);
	}
}
