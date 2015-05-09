package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import com.thedarkera.item.tool.ItemModAxe;
import com.thedarkera.item.tool.ItemModHoe;
import com.thedarkera.item.tool.ItemModPickaxe;
import com.thedarkera.item.tool.ItemModSpade;
import com.thedarkera.item.tool.ItemWand;
import com.thedarkera.utils.RegUtils;

public class TDETools {
	public static Item ancient_pickaxe;
	public static Item dark_stone_pickaxe;
	public static Item steel_pickaxe;
	public static Item ancient_axe;
	public static Item dark_stone_axe;
	public static Item steel_axe;
	public static Item ancient_shovel;
	public static Item dark_stone_shovel;
	public static Item steel_shovel;
	public static Item ancient_hoe;
	public static Item dark_stone_hoe;
	public static Item steel_hoe;

	public static Item wooden_wand;
	public static Item stone_wand;
	public static Item iron_wand;
	public static Item golden_wand;
	public static Item diamond_wand;
	public static Item ancient_wand;
	public static Item dark_stone_wand;
	public static Item steel_wand;

	public static void init() {
		// pickaxe
		ancient_pickaxe = new ItemModPickaxe(TDEMaterials.ancient, "ancient_pickaxe", "ancient_pickaxe");
		reg(ancient_pickaxe);
		dark_stone_pickaxe = new ItemModPickaxe(TDEMaterials.dark_stone, "dark_stone_pickaxe", "dark_stone_pickaxe");
		reg(dark_stone_pickaxe);
		steel_pickaxe = new ItemModPickaxe(TDEMaterials.steel, "steel_pickaxe", "steel_pickaxe");
		reg(steel_pickaxe);

		// axe
		ancient_axe = new ItemModAxe(TDEMaterials.ancient, "ancient_axe", "ancient_axe");
		reg(ancient_axe);
		dark_stone_axe = new ItemModAxe(TDEMaterials.dark_stone, "dark_stone_axe", "dark_stone_axe");
		reg(dark_stone_axe);
		steel_axe = new ItemModAxe(TDEMaterials.steel, "steel_axe", "steel_axe");
		reg(steel_axe);

		// shovel
		ancient_shovel = new ItemModSpade(TDEMaterials.ancient, "ancient_shovel", "ancient_shovel");
		reg(ancient_shovel);
		dark_stone_shovel = new ItemModSpade(TDEMaterials.dark_stone, "dark_stone_shovel", "dark_stone_shovel");
		reg(dark_stone_shovel);
		steel_shovel = new ItemModSpade(TDEMaterials.steel, "steel_shovel", "steel_shovel");
		reg(steel_shovel);

		// hoe
		ancient_hoe = new ItemModHoe(TDEMaterials.ancient, "ancient_hoe", "ancient_hoe");
		reg(ancient_hoe);
		dark_stone_hoe = new ItemModHoe(TDEMaterials.dark_stone, "dark_stone_hoe", "dark_stone_hoe");
		reg(dark_stone_hoe);
		steel_hoe = new ItemModHoe(TDEMaterials.steel, "steel_hoe", "steel_hoe");
		reg(steel_hoe);

		// wand
		wooden_wand = new ItemWand(ToolMaterial.WOOD, "wooden_wand");
		reg(wooden_wand);
		stone_wand = new ItemWand(ToolMaterial.STONE, "stone_wand");
		reg(stone_wand);
		iron_wand = new ItemWand(ToolMaterial.IRON, "iron_wand");
		reg(iron_wand);
		golden_wand = new ItemWand(ToolMaterial.GOLD, "golden_wand");
		reg(golden_wand);
		diamond_wand = new ItemWand(ToolMaterial.EMERALD, "diamond_wand");
		reg(diamond_wand);
		ancient_wand = new ItemWand(TDEMaterials.ancient, "ancient_wand");
		reg(ancient_wand);
		dark_stone_wand = new ItemWand(TDEMaterials.dark_stone, "dark_stone_wand");
		reg(dark_stone_wand);
		steel_wand = new ItemWand(TDEMaterials.steel, "steel_wand");
		reg(steel_wand);
	}

	public static void reg(Item item) {
		RegUtils.reg(item);
	}
}
