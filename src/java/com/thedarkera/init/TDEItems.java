package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.thedarkera.api.items.TabLogo;
import com.thedarkera.ingameobjects.item.ItemAchievementBook;
import com.thedarkera.ingameobjects.item.ItemAncientIngot;
import com.thedarkera.ingameobjects.item.ItemDaedraHeart;
import com.thedarkera.ingameobjects.item.ItemDarkFlint;
import com.thedarkera.ingameobjects.item.ItemDarkStoneRod;
import com.thedarkera.ingameobjects.item.ItemDragonBone;
import com.thedarkera.ingameobjects.item.ItemDragonScale;
import com.thedarkera.ingameobjects.item.ItemDye;
import com.thedarkera.ingameobjects.item.ItemEbonyIngot;
import com.thedarkera.ingameobjects.item.ItemFireRune;
import com.thedarkera.ingameobjects.item.ItemFrostRune;
import com.thedarkera.ingameobjects.item.ItemLeatherStrip;
import com.thedarkera.ingameobjects.item.ItemLightningRune;
import com.thedarkera.ingameobjects.item.ItemOrichalcumIngot;
import com.thedarkera.ingameobjects.item.ItemRottenWoodStick;
import com.thedarkera.ingameobjects.item.ItemSoulGem;
import com.thedarkera.ingameobjects.item.ItemSteelIngot;
import com.thedarkera.ingameobjects.item.ItemWitchFeather;
import com.thedarkera.ingameobjects.item.drops.ItemAshDrops;
import com.thedarkera.ingameobjects.item.food.ItemAshHopperMeat;
import com.thedarkera.ingameobjects.item.food.ItemBowlOJelly;
import com.thedarkera.ingameobjects.item.food.ItemGrape;
import com.thedarkera.ingameobjects.item.tool.ItemBoneAndSteel;
import com.thedarkera.ingameobjects.item.tool.ItemShout;
import com.thedarkera.placeableitem.ItemPlaceAbleExample;
import com.thedarkera.utils.RegUtils;

public class TDEItems {
	public static Item tab_logo_0;
	public static Item tab_logo_1;
	
	// Misc items//
	public static Item death_lord_skull;
	public static Item dark_flint;
	public static Item witch_feather;
	public static Item ash_hopper_meat;
	public static Item rotten_wood_stick;
	public static Item dark_stone_rod;
	public static Item soul_gem;
	public static Item leather_strip;
	public static Item daedra_heart;
	public static Item dragon_scale;
	public static Item fire_rune;
	public static Item frost_rune;
	public static Item lightning_rune;
	public static Item achievement_book;
	public static Item shout;
	public static Item bone_and_steel;
	public static Item bowl_o_jelly;
	
	// Meta's //
	public static Item dark_dye;
	public static Item ash_drops;
	
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
	public static Item dragon_bone;
	
	

	// Plant items//

	public static void init() {
		tab_logo_0 = new TabLogo("tab_logo_0");
		reg(tab_logo_0);
		tab_logo_1 = new TabLogo("tab_logo_1");
		reg(tab_logo_1);
		
		
		// Misc items init//
		dark_flint = new ItemDarkFlint("dark_flint");
		reg(dark_flint);
		witch_feather = new ItemWitchFeather("witch_feather");
		reg(witch_feather);
		ash_hopper_meat = new ItemAshHopperMeat(3, 0.3F, true, "ash_hopper_meat");
		reg(ash_hopper_meat);
		rotten_wood_stick = new ItemRottenWoodStick("rotten_wood_stick");
		reg(rotten_wood_stick);
		dark_stone_rod = new ItemDarkStoneRod("dark_stone_rod");
		reg(dark_stone_rod);
		soul_gem = new ItemSoulGem();
		reg(soul_gem);
		leather_strip = new ItemLeatherStrip("leather_strip");
		reg(leather_strip);
		daedra_heart = new ItemDaedraHeart("daedra_heart");
		reg(daedra_heart);
		dragon_scale = new ItemDragonScale("dragon_scale");
		reg(dragon_scale);
		fire_rune = new ItemFireRune("fire_rune");
		reg(fire_rune);
		frost_rune = new ItemFrostRune("frost_rune");
		reg(frost_rune);
		lightning_rune = new ItemLightningRune("lightning_rune");
		reg(lightning_rune);
		achievement_book = new ItemAchievementBook("achievement_book");
		reg(achievement_book);
		shout = new ItemShout();
		reg(shout);
		bone_and_steel = new ItemBoneAndSteel("bone_and_steel");
		reg(bone_and_steel);
		bowl_o_jelly = new ItemBowlOJelly("bowl_o_jelly");
		reg(bowl_o_jelly);

		// MetaItems //
		dark_dye = new ItemDye("dark_dye");
		reg(dark_dye);
		ash_drops = new ItemAshDrops("ash_drops");
		reg(ash_drops);
		
		// Ingot items init//
		steel_ingot = new ItemSteelIngot("steel_ingot");
		reg(steel_ingot);
		ebony_ingot = new ItemEbonyIngot("ebony_ingot");
		reg(ebony_ingot);
		orichalcum_ingot = new ItemOrichalcumIngot("orichalcum_ingot");
		reg(orichalcum_ingot);
		ancient_ingot = new ItemAncientIngot("ancient_ingot");
		reg(ancient_ingot);

		// Food items init//
		grape = new ItemGrape(3, 0.3F, true, "grape");
		reg(grape);

		// Seed items//
		// grape_seed = new ItemGrapeSeed(TDEBlocks.grape_plant);
		// reg(grape_seed);

		// Placeable items//
		example = new ItemPlaceAbleExample();
		dragon_bone = new ItemDragonBone();
	}

	public static void reg(Item item) {
		RegUtils.reg(item);
	}
}
