package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.thedarkera.item.tool.ItemAncientAxe;
import com.thedarkera.item.tool.ItemAncientHoe;
import com.thedarkera.item.tool.ItemAncientPickaxe;
import com.thedarkera.item.tool.ItemAncientShovel;
import com.thedarkera.item.tool.ItemDarkStoneAxe;
import com.thedarkera.item.tool.ItemDarkStoneHoe;
import com.thedarkera.item.tool.ItemDarkStonePickaxe;
import com.thedarkera.item.tool.ItemDarkStoneShovel;
import com.thedarkera.item.tool.ItemSteelAxe;
import com.thedarkera.item.tool.ItemSteelHoe;
import com.thedarkera.item.tool.ItemSteelPickaxe;
import com.thedarkera.item.tool.ItemSteelShovel;

import cpw.mods.fml.common.registry.GameRegistry;

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
	
	//harvestLevel, maxUses, efficiencyOnProperMaterial, damageVsEntity, enchantability
	//static ToolMaterial  = EnumHelper.addToolMaterial("", );
	static ToolMaterial ancient = EnumHelper.addToolMaterial("ancient", 3, 1000, 9.5F, 3.5F, 10);
	static ToolMaterial dark_stone = EnumHelper.addToolMaterial("dark_stone", 1, 200, 5.5F, 2F, 7);
	static ToolMaterial steel = EnumHelper.addToolMaterial("steel", 2, 325, 8.0F, 6F, 18);

	public static void init()
	 {
		//pickaxe
		ancient_pickaxe = new ItemAncientPickaxe(ancient, "ancient_pickaxe");
		GameRegistry.registerItem(ancient_pickaxe, ancient_pickaxe.getUnlocalizedName());
		dark_stone_pickaxe = new ItemDarkStonePickaxe(dark_stone, "dark_stone_pickaxe");
		GameRegistry.registerItem(dark_stone_pickaxe, dark_stone_pickaxe.getUnlocalizedName());
		steel_pickaxe = new ItemSteelPickaxe(steel, "steel_pickaxe");
		GameRegistry.registerItem(steel_pickaxe, steel_pickaxe.getUnlocalizedName());
		
		//axe
		ancient_axe = new ItemAncientAxe(ancient, "ancient_axe");
		GameRegistry.registerItem(ancient_axe, ancient_axe.getUnlocalizedName());
		dark_stone_axe = new ItemDarkStoneAxe(dark_stone, "dark_stone_axe");
		GameRegistry.registerItem(dark_stone_axe, dark_stone_axe.getUnlocalizedName());
		steel_axe = new ItemSteelAxe(steel, "steel_axe");
		GameRegistry.registerItem(steel_axe, steel_axe.getUnlocalizedName());
		
		//shovel
		ancient_shovel = new ItemAncientShovel(ancient, "ancient_shovel");
		GameRegistry.registerItem(ancient_shovel, ancient_shovel.getUnlocalizedName());
		dark_stone_shovel = new ItemDarkStoneShovel(dark_stone, "dark_stone_shovel");
		GameRegistry.registerItem(dark_stone_shovel, dark_stone_shovel.getUnlocalizedName());
		steel_shovel = new ItemSteelShovel(steel, "steel_shovel");
		GameRegistry.registerItem(steel_shovel, steel_shovel.getUnlocalizedName());
		
		//hoe
		ancient_hoe = new ItemAncientHoe(ancient, "ancient_hoe");
		GameRegistry.registerItem(ancient_hoe, ancient_hoe.getUnlocalizedName());
		dark_stone_hoe = new ItemDarkStoneHoe(dark_stone, "dark_stone_hoe");
		GameRegistry.registerItem(dark_stone_hoe, dark_stone_hoe.getUnlocalizedName());
		steel_hoe = new ItemSteelHoe(steel, "steel_hoe");
		GameRegistry.registerItem(steel_hoe, steel_hoe.getUnlocalizedName());
		 
		 
		 
	 }
}
