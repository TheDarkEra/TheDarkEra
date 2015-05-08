package com.thedarkera.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TDERecipes {
	public static void init() {
		// Blocks//		
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.smeltery), "xxx", "x x", "xxx", 'x', TDEBlocks.dark_cobblestone );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_bricks, 4),"xx", "xx", 'x', TDEBlocks.dark_stone );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_stairs, 6),"x  ", "xx ", "xxx", 'x',TDEBlocks.dark_stone );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_stairs, 6), "  x", " xx", "xxx", 'x',TDEBlocks.dark_stone );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_stairs, 6),"  x", " xx", "xxx", 'x',TDEBlocks.rotten_wood );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_stairs, 6), "x  ", "xx ", "xxx", 'x',TDEBlocks.rotten_wood );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_slab, 3), "xxx", 'x', TDEBlocks.dark_stone );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_slab, 3), "xxx", 'x', TDEBlocks.rotten_wood );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_fence, 3), "xxx", "xxx", 'x', TDEItems.dark_stone_rod );
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_fence, 3), "xxx", "xxx", 'x', TDEItems.rotten_wood_stick );

		GameRegistry.addSmelting(TDEBlocks.dark_cobblestone, new ItemStack(TDEBlocks.dark_stone), 0.2F);

		// Misc items//
		GameRegistry.addShapedRecipe(new ItemStack(TDEItems.leather_strip, 2), "  ", " X ", "  ", 'X', Items.leather );
		GameRegistry.addShapedRecipe(new ItemStack(TDEItems.dark_stone_rod, 4), "x", "x", 'x', TDEBlocks.dark_cobblestone );
		GameRegistry.addShapedRecipe(new ItemStack(TDEItems.rotten_wood_stick, 4), "x", "x", 'x', TDEBlocks.rotten_wood );

		// Ingots//
		GameRegistry.addSmelting(Items.chainmail_boots, new ItemStack(TDEItems.steel_ingot, 2), 0.8F);
		GameRegistry.addSmelting(Items.chainmail_chestplate, new ItemStack(TDEItems.steel_ingot, 8), 0.8F);
		GameRegistry.addSmelting(Items.chainmail_leggings, new ItemStack(TDEItems.steel_ingot, 6), 0.8F);
		GameRegistry.addSmelting(Items.chainmail_helmet, new ItemStack(TDEItems.steel_ingot, 4), 0.8F);
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(TDEItems.steel_ingot), 0.8F);
		GameRegistry.addSmelting(TDEBlocks.ebony_ore, new ItemStack(TDEItems.ebony_ingot), 0.8F);
		GameRegistry.addSmelting(TDEBlocks.orichalcum_ore, new ItemStack(TDEItems.orichalcum_ingot), 0.5F);
		GameRegistry.addSmelting(TDEBlocks.orichalcum_ore, new ItemStack(TDEItems.ancient_ingot), 0.5F);

		// Armors//
		// Daedric armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_helmet), "XXX", "Y Y", 'X', TDEItems.ebony_ingot, 'Y',	TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_chestplate), "Y Y", "XXX", "XXX", 'X', TDEItems.ebony_ingot,'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_leggings), "XXX", "X X", "Y Y", 'X', TDEItems.ebony_ingot, 'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_boots),"X X", "Y Y", 'X', TDEItems.ebony_ingot, 'Y',TDEItems.leather_strip );
		
		// Steel armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_helmet), "XXX", "Y Y", 'X', TDEItems.steel_ingot, 'Y',TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_chestplate), "Y Y", "XXX", "XXX", 'X', TDEItems.steel_ingot,	'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_leggings), "XXX", "X X", "Y Y", 'X', TDEItems.steel_ingot,'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_boots), "X X", "Y Y", 'X', TDEItems.steel_ingot, 'Y',TDEItems.leather_strip );
		
		// Ancient armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_helmet), "XXX", "Y Y", 'X', TDEItems.ancient_ingot, 'Y',TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_chestplate), "Y Y", "XXX", "XXX", 'X', TDEItems.ancient_ingot, 'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_leggings), "XXX", "X X", "Y Y", 'X',TDEItems.ancient_ingot, 'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_boots), "X X", "Y Y", 'X', TDEItems.ancient_ingot, 'Y',TDEItems.leather_strip );
		
		// Dragon heavy armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_helmet), "XXX", "Y Y", 'X', TDEItems.dragon_bone, 'Y',TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_chestplate), "Y Y", "XXX", "XXX", 'X', TDEItems.dragon_bone, 'Y',TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_leggings),"XXX", "X X", "Y Y", 'X', TDEItems.dragon_bone,	'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_boots), "X X", "Y Y", 'X', TDEItems.dragon_bone, 'Y',TDEItems.leather_strip );
		
		// Dragon light armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_helmet), "XXX", "Y Y", 'X', TDEItems.dragon_scale, 'Y',TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_chestplate),"Y Y", "XXX", "XXX", 'X', TDEItems.dragon_scale, 'Y',TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_leggings),"XXX", "X X", "Y Y", 'X', TDEItems.dragon_scale,'Y', TDEItems.leather_strip );
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_boots), "X X", "Y Y", 'X', TDEItems.dragon_scale, 'Y',TDEItems.leather_strip );

		// Tools//
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_pickaxe), "xxx", " y ", " y ", 'X', TDEItems.steel_ingot,	'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_pickaxe),  "xxx", " y ", " y ", 'X', TDEBlocks.dark_cobblestone, 'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_axe),  "xx", "xy", " y", 'X', TDEItems.steel_ingot, 'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_axe), "xx", "yx", "y ", 'X', TDEItems.steel_ingot, 'Y',Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_axe), "xx ", "xy ", " y ", 'X',TDEBlocks.dark_cobblestone, 'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_axe),"xx", "yx", "y ", 'X',TDEBlocks.dark_cobblestone, 'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_shovel), "x", "y", "y", 'X', TDEBlocks.dark_cobblestone,'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_shovel), "x", "y", "y", 'X', TDEItems.steel_ingot, 'Y',Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_hoe), "xx", "y ", "y ", 'X',	TDEBlocks.dark_cobblestone, 'Y', Items.stick );
    	GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_hoe),"xx", " y", " y", 'X',TDEBlocks.dark_cobblestone, 'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_hoe), "xx", " y", " y", 'X', TDEItems.steel_ingot, 'Y', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_hoe), "xx", "y ", "y ", 'X', TDEItems.steel_ingot, 'Y', Items.stick );
		
		GameRegistry.addSmelting(TDEBlocks.dark_iron_ore, new ItemStack(Items.iron_ingot), 1F);
		GameRegistry.addSmelting(TDEBlocks.dark_gold_ore, new ItemStack(Items.gold_ingot), 1F);
	}
}
