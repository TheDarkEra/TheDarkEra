package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import com.thedarkera.api.helper.RegHelper;
import com.thedarkera.ingameobjects.item.bossdrops.deathlord.ItemDeathSword;
import com.thedarkera.ingameobjects.item.weapon.ItemDaedricArrow;
import com.thedarkera.ingameobjects.item.weapon.ItemDaedricBow;
import com.thedarkera.ingameobjects.item.weapon.ItemDragonArrow;
import com.thedarkera.ingameobjects.item.weapon.ItemDragonBow;
import com.thedarkera.ingameobjects.item.weapon.ItemModDagger;
import com.thedarkera.ingameobjects.item.weapon.ItemModMace;
import com.thedarkera.ingameobjects.item.weapon.ItemModSword;

public class TDEWeapons {

	// Swords
	public static Item steel_sword;
	public static Item dark_stone_sword;
	public static Item death_sword;
	public static Item ancient_sword;

	// Bows
	public static Item daedric_bow;
	public static Item dragon_bow;

	// Arrows
	public static Item daedric_arrow;
	public static Item dragon_arrow;

	// Daggers
	public static Item wood_dagger;
	public static Item stone_dagger;
	public static Item iron_dagger;
	public static Item gold_dagger;
	public static Item diamond_dagger;
	public static Item steel_dagger;
	public static Item dark_stone_dagger;
	public static Item ancient_dagger;

	// Mace
	public static Item wood_mace;
	public static Item stone_mace;
	public static Item iron_mace;
	public static Item gold_mace;
	public static Item diamond_mace;
	public static Item steel_mace;
	public static Item dark_stone_mace;
	public static Item ancient_mace;

	public static void init() {
		// swords
		steel_sword = new ItemModSword(TDEMaterials.steel, "steel_sword");
		reg(steel_sword);
		dark_stone_sword = new ItemModSword(TDEMaterials.dark_stone, "dark_stone_sword");
		reg(dark_stone_sword);
		death_sword = new ItemDeathSword(ToolMaterial.EMERALD, "death_sword");
		reg(death_sword);
		ancient_sword = new ItemModSword(TDEMaterials.ancient, "ancient_sword");
		reg(ancient_sword);

		// Bows
		daedric_bow = new ItemDaedricBow("daedric_bow");
		reg(daedric_bow);
		dragon_bow = new ItemDragonBow("dragon_bow");
		reg(dragon_bow);

		// Arrows
		daedric_arrow = new ItemDaedricArrow("daedric_arrow");
		reg(daedric_arrow);
		dragon_arrow = new ItemDragonArrow("dragon_arrow");
		reg(dragon_arrow);

		// Daggers
		wood_dagger = new ItemModDagger(ToolMaterial.WOOD, "wood_dagger");
		reg(wood_dagger);
		stone_dagger = new ItemModDagger(ToolMaterial.STONE, "stone_dagger");
		reg(stone_dagger);
		iron_dagger = new ItemModDagger(ToolMaterial.IRON, "iron_dagger");
		reg(iron_dagger);
		gold_dagger = new ItemModDagger(ToolMaterial.GOLD, "gold_dagger");
		reg(gold_dagger);
		diamond_dagger = new ItemModDagger(ToolMaterial.EMERALD, "diamond_dagger");
		reg(diamond_dagger);
		steel_dagger = new ItemModDagger(TDEMaterials.steel, "steel_dagger");
		reg(steel_dagger);
		dark_stone_dagger = new ItemModDagger(TDEMaterials.dark_stone, "dark_stone_dagger");
		reg(dark_stone_dagger);
		ancient_dagger = new ItemModDagger(TDEMaterials.ancient, "ancient_dagger");
		reg(ancient_dagger);

		// Mace
		wood_mace = new ItemModMace(ToolMaterial.WOOD, "wood_mace");
		reg(wood_mace);
		stone_mace = new ItemModMace(ToolMaterial.STONE, "stone_mace");
		reg(stone_mace);
		iron_mace = new ItemModMace(ToolMaterial.IRON, "iron_mace");
		reg(iron_mace);
		gold_mace = new ItemModMace(ToolMaterial.GOLD, "gold_mace");
		reg(gold_mace);
		diamond_mace = new ItemModMace(ToolMaterial.EMERALD, "diamond_mace");
		reg(diamond_mace);
		steel_mace = new ItemModMace(TDEMaterials.steel, "steel_mace");
		reg(steel_mace);
		dark_stone_mace = new ItemModMace(TDEMaterials.dark_stone, "dark_stone_mace");
		reg(dark_stone_mace);
		ancient_mace = new ItemModMace(TDEMaterials.ancient, "ancient_mace");
		reg(ancient_mace);
	}

	public static void reg(Item item) {
		RegHelper.reg(item);
	}
}
