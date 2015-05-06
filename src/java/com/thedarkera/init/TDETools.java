package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import com.thedarkera.item.tool.ItemModAxe;
import com.thedarkera.item.tool.ItemModHoe;
import com.thedarkera.item.tool.ItemModPickaxe;
import com.thedarkera.item.tool.ItemModSpade;
import com.thedarkera.item.tool.ItemWeeder;
import com.thedarkera.utils.RegUtils;

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
		reg(ancient_pickaxe);
		dark_stone_pickaxe = new ItemModPickaxe(TDEMaterials.dark_stone, "dark_stone_pickaxe", "dark_stone_pickaxe");
		reg(dark_stone_pickaxe);
		steel_pickaxe = new ItemModPickaxe(TDEMaterials.steel, "steel_pickaxe", "steel_pickaxe");
		reg(steel_pickaxe);

		//axe
		ancient_axe = new ItemModAxe(TDEMaterials.ancient, "ancient_axe", "ancient_axe");
		reg(ancient_axe);
		dark_stone_axe = new ItemModAxe(TDEMaterials.dark_stone, "dark_stone_axe", "ancient_axe");
		reg(dark_stone_axe);
		steel_axe = new ItemModAxe(TDEMaterials.steel, "steel_axe", "ancient_axe");
		reg(steel_axe);

		//shovel
		ancient_shovel = new ItemModSpade(TDEMaterials.ancient, "ancient_shovel", "ancient_shovel");
		reg(ancient_shovel);
		dark_stone_shovel = new ItemModSpade(TDEMaterials.dark_stone, "dark_stone_shovel", "dark_stone_shovel");
		reg(dark_stone_shovel);
		steel_shovel = new ItemModSpade(TDEMaterials.steel, "steel_shovel", "steel_shovel");
		reg(steel_shovel);

		//hoe
		ancient_hoe = new ItemModHoe(TDEMaterials.ancient, "ancient_hoe", "ancient_hoe");
		reg(ancient_hoe);
		dark_stone_hoe = new ItemModHoe(TDEMaterials.dark_stone, "dark_stone_hoe", "dark_stone_hoe");
		reg(dark_stone_hoe);
		steel_hoe = new ItemModHoe(TDEMaterials.steel, "steel_hoe", "steel_hoe");
		reg(steel_hoe);
		
		//weeder
		wooden_weeder = new ItemWeeder(ToolMaterial.WOOD, "wooden_weeder");
		reg(wooden_weeder);
		stone_weeder = new ItemWeeder(ToolMaterial.STONE, "stone_weeder");
		reg(stone_weeder);
		iron_weeder = new ItemWeeder(ToolMaterial.IRON, "iron_weeder");
		reg(iron_weeder);
		golden_weeder = new ItemWeeder(ToolMaterial.GOLD, "golden_weeder");
		reg(golden_weeder);
		diamond_weeder = new ItemWeeder(ToolMaterial.EMERALD, "diamond_weeder");
		reg(diamond_weeder);
		ancient_weeder = new ItemWeeder(TDEMaterials.ancient, "ancient_weeder");
		reg(ancient_weeder);
		dark_stone_weeder = new ItemWeeder(TDEMaterials.dark_stone, "dark_stone_weeder");
		reg(dark_stone_weeder);
		steel_weeder = new ItemWeeder(TDEMaterials.steel, "steel_weeder");
		reg(steel_weeder);
	}
	
	public static void reg(Item item)
	{
		RegUtils.reg(item);
	}
}
