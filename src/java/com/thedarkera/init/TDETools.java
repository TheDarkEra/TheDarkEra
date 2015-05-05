package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import com.thedarkera.item.tool.ItemModAxe;
import com.thedarkera.item.tool.ItemModHoe;
import com.thedarkera.item.tool.ItemModPickaxe;
import com.thedarkera.item.tool.ItemModSpade;
import com.thedarkera.item.tool.ItemWeeder;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDETools
{
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
	
	public static Item wooden_weeder;
	public static Item stone_weeder;
	public static Item iron_weeder;
	public static Item golden_weeder;
	public static Item diamond_weeder;
	public static Item ancient_weeder;
	public static Item dark_stone_weeder;
	public static Item steel_weeder;
	
	public static void init()
	{
		//pickaxe
		ancient_pickaxe = new ItemModPickaxe(TDEMaterials.ancient, "ancient_pickaxe", "ancient_pickaxe");
		GameRegistry.registerItem(ancient_pickaxe, ancient_pickaxe.getUnlocalizedName());
		dark_stone_pickaxe = new ItemModPickaxe(TDEMaterials.dark_stone, "dark_stone_pickaxe", "dark_stone_pickaxe");
		GameRegistry.registerItem(dark_stone_pickaxe, dark_stone_pickaxe.getUnlocalizedName());
		steel_pickaxe = new ItemModPickaxe(TDEMaterials.steel, "steel_pickaxe", "steel_pickaxe");
		GameRegistry.registerItem(steel_pickaxe, steel_pickaxe.getUnlocalizedName());

		//axe
		ancient_axe = new ItemModAxe(TDEMaterials.ancient, "ancient_axe", "ancient_axe");
		GameRegistry.registerItem(ancient_axe, ancient_axe.getUnlocalizedName());
		dark_stone_axe = new ItemModAxe(TDEMaterials.dark_stone, "dark_stone_axe", "ancient_axe");
		GameRegistry.registerItem(dark_stone_axe, dark_stone_axe.getUnlocalizedName());
		steel_axe = new ItemModAxe(TDEMaterials.steel, "steel_axe", "ancient_axe");
		GameRegistry.registerItem(steel_axe, steel_axe.getUnlocalizedName());

		//shovel
		ancient_shovel = new ItemModSpade(TDEMaterials.ancient, "ancient_shovel", "ancient_shovel");
		GameRegistry.registerItem(ancient_shovel, ancient_shovel.getUnlocalizedName());
		dark_stone_shovel = new ItemModSpade(TDEMaterials.dark_stone, "dark_stone_shovel", "dark_stone_shovel");
		GameRegistry.registerItem(dark_stone_shovel, dark_stone_shovel.getUnlocalizedName());
		steel_shovel = new ItemModSpade(TDEMaterials.steel, "steel_shovel", "steel_shovel");
		GameRegistry.registerItem(steel_shovel, steel_shovel.getUnlocalizedName());

		//hoe
		ancient_hoe = new ItemModHoe(TDEMaterials.ancient, "ancient_hoe", "ancient_hoe");
		GameRegistry.registerItem(ancient_hoe, ancient_hoe.getUnlocalizedName());
		dark_stone_hoe = new ItemModHoe(TDEMaterials.dark_stone, "dark_stone_hoe", "dark_stone_hoe");
		GameRegistry.registerItem(dark_stone_hoe, dark_stone_hoe.getUnlocalizedName());
		steel_hoe = new ItemModHoe(TDEMaterials.steel, "steel_hoe", "steel_hoe");
		GameRegistry.registerItem(steel_hoe, steel_hoe.getUnlocalizedName());
		
		//weeder
		wooden_weeder = new ItemWeeder(ToolMaterial.WOOD, "wooden_weeder");
		GameRegistry.registerItem(wooden_weeder, wooden_weeder.getUnlocalizedName());
		stone_weeder = new ItemWeeder(ToolMaterial.STONE, "stone_weeder");
		GameRegistry.registerItem(stone_weeder, stone_weeder.getUnlocalizedName());
		iron_weeder = new ItemWeeder(ToolMaterial.IRON, "iron_weeder");
		GameRegistry.registerItem(iron_weeder, iron_weeder.getUnlocalizedName());
		golden_weeder = new ItemWeeder(ToolMaterial.GOLD, "golden_weeder");
		GameRegistry.registerItem(golden_weeder, golden_weeder.getUnlocalizedName());
		diamond_weeder = new ItemWeeder(ToolMaterial.EMERALD, "diamond_weeder");
		GameRegistry.registerItem(diamond_weeder, diamond_weeder.getUnlocalizedName());
		ancient_weeder = new ItemWeeder(TDEMaterials.ancient, "ancient_weeder");
		GameRegistry.registerItem(ancient_weeder, ancient_weeder.getUnlocalizedName());
		dark_stone_weeder = new ItemWeeder(TDEMaterials.dark_stone, "dark_stone_weeder");
		GameRegistry.registerItem(dark_stone_weeder, dark_stone_weeder.getUnlocalizedName());
		steel_weeder = new ItemWeeder(TDEMaterials.steel, "steel_weeder");
		GameRegistry.registerItem(steel_weeder, steel_weeder.getUnlocalizedName());
	}
}
