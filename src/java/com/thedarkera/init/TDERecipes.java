package com.thedarkera.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TDERecipes {
	public static void init() {
		// Blocks//
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.smeltery), "xxx", "x x", "xxx", 'x', TDEBlocks.dark_cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_bricks, 4), "xx", "xx", 'x', TDEBlocks.dark_stone);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_stairs, 6), "x  ", "xx ", "xxx", 'x', TDEBlocks.dark_stone);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_stairs, 6), "  x", " xx", "xxx", 'x', TDEBlocks.dark_stone);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_stairs, 6), "  x", " xx", "xxx", 'x', TDEBlocks.rotten_wood);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_stairs, 6), "x  ", "xx ", "xxx", 'x', TDEBlocks.rotten_wood);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_slab, 3), "xxx", 'x', TDEBlocks.dark_stone);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_slab, 3), "xxx", 'x', TDEBlocks.rotten_wood);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_stone_fence, 3), "xxx", "xxx", 'x', TDEItems.dark_stone_rod);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.rotten_wood_fence, 3), "xxx", "xxx", 'x', TDEItems.rotten_wood_stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_sandstone_bricks, 4), "xx", "xx", 'x', TDEBlocks.dark_sandstone);
		GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_sandstone, 4), "xx", "xx", 'x', TDEBlocks.dark_sand);

		GameRegistry.addSmelting(TDEBlocks.dark_cobblestone, new ItemStack(TDEBlocks.dark_stone), 0.2F);
		GameRegistry.addSmelting(TDEBlocks.dark_sand, new ItemStack(Blocks.stained_glass, 1, 7), 0.2F);

		// Misc items//
		GameRegistry.addShapedRecipe(new ItemStack(TDEItems.leather_strip, 2), "  ", " x ", "  ", 'x', Items.leather);
		GameRegistry.addShapedRecipe(new ItemStack(TDEItems.dark_stone_rod, 4), "x", "x", 'x', TDEBlocks.dark_cobblestone);
		GameRegistry.addShapedRecipe(new ItemStack(TDEItems.rotten_wood_stick, 4), "x", "x", 'x', TDEBlocks.rotten_wood);

		// Dye's //
		//GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 1), new ItemStack(TDEItems.dark_red_dye, 2), 0.1F);
		//GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_red_wool, 2), "xxx", "xyx", "xxx", 'x', TDEItems.dark_red_dye, 'y', new ItemStack(Blocks.wool, 1));
		//GameRegistry.addShapedRecipe(new ItemStack(TDEBlocks.dark_red_clay, 2), "xxx", "xyx", "xxx", 'x', TDEItems.dark_red_dye, 'y', new ItemStack(Blocks.clay, 1));
		
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
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_helmet), "xxx", "y y", 'x', TDEItems.ebony_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_chestplate), "y y", "xxx", "xxx", 'x', TDEItems.ebony_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_leggings), "xxx", "x x", "y y", 'x', TDEItems.ebony_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.daedric_boots), "x x", "y y", 'x', TDEItems.ebony_ingot, 'y', TDEItems.leather_strip);

		// Steel armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_helmet), "xxx", "y y", 'x', TDEItems.steel_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_chestplate), "y y", "xxx", "xxx", 'x', TDEItems.steel_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_leggings), "xxx", "x x", "y y", 'x', TDEItems.steel_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.steel_boots), "x x", "y y", 'x', TDEItems.steel_ingot, 'y', TDEItems.leather_strip);

		// Ancient armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_helmet), "xxx", "y y", 'x', TDEItems.ancient_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_chestplate), "y y", "xxx", "xxx", 'x', TDEItems.ancient_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_leggings), "xxx", "x x", "y y", 'x', TDEItems.ancient_ingot, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.ancient_boots), "x x", "y y", 'x', TDEItems.ancient_ingot, 'y', TDEItems.leather_strip);

		// Dragon heavy armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_helmet), "xxx", "y y", 'x', TDEItems.dragon_bone, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_chestplate), "y y", "xxx", "xxx", 'x', TDEItems.dragon_bone, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_leggings), "xxx", "x x", "y y", 'x', TDEItems.dragon_bone, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_heavy_boots), "x x", "y y", 'x', TDEItems.dragon_bone, 'y', TDEItems.leather_strip);

		// Dragon light armor//
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_helmet), "xxx", "y y", 'x', TDEItems.dragon_scale, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_chestplate), "y y", "xxx", "xxx", 'x', TDEItems.dragon_scale, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_leggings), "xxx", "x x", "y y", 'x', TDEItems.dragon_scale, 'y', TDEItems.leather_strip);
		GameRegistry.addShapedRecipe(new ItemStack(TDEArmors.dragon_light_boots), "x x", "y y", 'x', TDEItems.dragon_scale, 'y', TDEItems.leather_strip);

		// Tools//
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_pickaxe), "xxx", " y ", " y ", 'x', TDEItems.steel_ingot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_pickaxe), "xxx", " y ", " y ", 'x', TDEBlocks.dark_cobblestone, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_axe), "xx", "xy", " y", 'x', TDEItems.steel_ingot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_axe), "xx", "yx", "y ", 'x', TDEItems.steel_ingot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_axe), "xx ", "xy ", " y ", 'x', TDEBlocks.dark_cobblestone, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_axe), "xx", "yx", "y ", 'x', TDEBlocks.dark_cobblestone, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_shovel), "x", "y", "y", 'x', TDEBlocks.dark_cobblestone, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_shovel), "x", "y", "y", 'x', TDEItems.steel_ingot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_hoe), "xx", "y ", "y ", 'x', TDEBlocks.dark_cobblestone, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.dark_stone_hoe), "xx", " y", " y", 'x', TDEBlocks.dark_cobblestone, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_hoe), "xx", " y", " y", 'x', TDEItems.steel_ingot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(TDETools.steel_hoe), "xx", "y ", "y ", 'x', TDEItems.steel_ingot, 'y', Items.stick);

		GameRegistry.addSmelting(TDEBlocks.dark_iron_ore, new ItemStack(Items.iron_ingot), 1F);
		GameRegistry.addSmelting(TDEBlocks.dark_gold_ore, new ItemStack(Items.gold_ingot), 1F);
	}
}
