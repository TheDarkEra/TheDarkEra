package com.thedarkera.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TDERecipes 
{
	public static void init() 
	{
		//Blocks//
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.dark_stone_bricks, 4),  new Object[]{ 
			"xx",
			"xx",
			'x', TDEBlocks.dark_stone
		});
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.dark_stone_stairs, 6),  new Object[]{ 
			"x  ",
			"xx ",
			"xxx",
			'x', TDEBlocks.dark_stone
		});
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.dark_stone_stairs, 6),  new Object[]{ 
			"  x",
			" xx",
			"xxx",
			'x', TDEBlocks.dark_stone
		});
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.rotten_wood_stairs, 6),  new Object[]{ 
			"  x",
			" xx",
			"xxx",
			'x', TDEBlocks.rotten_wood
		});
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.rotten_wood_stairs, 6),  new Object[]{ 
			"x  ",
			"xx ",
			"xxx",
			'x', TDEBlocks.rotten_wood
		});

		GameRegistry.addRecipe(new ItemStack(TDEBlocks.dark_stone_slab, 3),  new Object[]{ 
			"xxx",
			'x', TDEBlocks.dark_stone
		});
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.rotten_wood_slab, 3),  new Object[]{ 
			"xxx",
			'x', TDEBlocks.rotten_wood
		});
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.dark_stone_fence, 3),  new Object[]{ 
			"xxx",
			"xxx",
			'x', TDEItems.dark_stone_rod
		});
		GameRegistry.addRecipe(new ItemStack(TDEBlocks.rotten_wood_fence, 3),  new Object[]{ 
			"xxx",
			"xxx",
			'x', TDEItems.rotten_wood_stick
		});

		GameRegistry.addSmelting(TDEBlocks.dark_cobblestone, new ItemStack(TDEBlocks.dark_stone), 0.2F);

		//Misc items//
		GameRegistry.addRecipe(new ItemStack(TDEItems.leather_strip, 2), new Object[]{ 
			"  ",
			" X ",
			"  ",
			'X', Items.leather
		});
		GameRegistry.addRecipe(new ItemStack(TDEItems.dark_stone_rod, 4),  new Object[]{ 
			"x",
			"x",
			'x', TDEBlocks.dark_cobblestone
		});
		GameRegistry.addRecipe(new ItemStack(TDEItems.rotten_wood_stick, 4),  new Object[]{ 
			"x",
			"x",
			'x', TDEBlocks.rotten_wood
		});

		//Ingots//
		GameRegistry.addSmelting(TDEBlocks.ebony_ore, new ItemStack(TDEItems.ebony_ingot), 0.8F);
		GameRegistry.addSmelting(TDEBlocks.steel_ore, new ItemStack(TDEItems.steel_ingot), 0.4F);
		GameRegistry.addSmelting(TDEBlocks.orichalcum_ore, new ItemStack(TDEItems.orichalcum_ingot), 0.5F);
		GameRegistry.addSmelting(TDEBlocks.orichalcum_ore, new ItemStack(TDEItems.ancient_ingot), 0.5F);

		//Armors//
		//Daedric armor//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.daedric_helmet), new Object[]{ 
			"XXX",
			"Y Y",
			'X', TDEItems.ebony_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.daedric_chestplate),new Object[]{  
			"Y Y",
			"XXX",
			"XXX",
			'X', TDEItems.ebony_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.daedric_leggings), new Object[]{ 
			"XXX",
			"X X",
			"Y Y",
			'X', TDEItems.ebony_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.daedric_boots), new Object[]{
			"X X",
			"Y Y",
			'X', TDEItems.ebony_ingot, 'Y', TDEItems.leather_strip
		});
		//Steel armor//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.steel_helmet), new Object[]{ 
			"XXX",
			"Y Y",
			'X', TDEItems.steel_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.steel_chestplate),new Object[]{  
			"Y Y",
			"XXX",
			"XXX",
			'X', TDEItems.steel_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.steel_leggings), new Object[]{ 
			"XXX",
			"X X",
			"Y Y",
			'X', TDEItems.steel_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.steel_boots), new Object[]{
			"X X",
			"Y Y",
			'X', TDEItems.steel_ingot, 'Y', TDEItems.leather_strip
		});
		//Ancient armor//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.ancient_helmet), new Object[]{ 
			"XXX",
			"Y Y",
			'X', TDEItems.ancient_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.ancient_chestplate),new Object[]{  
			"Y Y",
			"XXX",
			"XXX",
			'X', TDEItems.ancient_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.ancient_leggings), new Object[]{ 
			"XXX",
			"X X",
			"Y Y",
			'X', TDEItems.ancient_ingot, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.ancient_boots), new Object[]{
			"X X",
			"Y Y",
			'X', TDEItems.ancient_ingot, 'Y', TDEItems.leather_strip
		});
		//Dragon heavy armor//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_heavy_helmet), new Object[]{ 
			"XXX",
			"Y Y",
			'X', TDEItems.dragon_bone, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_heavy_chestplate),new Object[]{  
			"Y Y",
			"XXX",
			"XXX",
			'X', TDEItems.dragon_bone, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_heavy_leggings), new Object[]{ 
			"XXX",
			"X X",
			"Y Y",
			'X', TDEItems.dragon_bone, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_heavy_boots), new Object[]{
			"X X",
			"Y Y",
			'X', TDEItems.dragon_bone, 'Y', TDEItems.leather_strip
		});
		//Dragon light armor//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_light_helmet), new Object[]{ 
			"XXX",
			"Y Y",
			'X', TDEItems.dragon_scale, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_light_chestplate),new Object[]{  
			"Y Y",
			"XXX",
			"XXX",
			'X', TDEItems.dragon_scale, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_light_leggings), new Object[]{ 
			"XXX",
			"X X",
			"Y Y",
			'X', TDEItems.dragon_scale, 'Y', TDEItems.leather_strip
		});
		GameRegistry.addRecipe(new ItemStack(TDEArmors.dragon_light_boots), new Object[]{
			"X X",
			"Y Y",
			'X', TDEItems.dragon_scale, 'Y', TDEItems.leather_strip
		});

		//Tools//
		GameRegistry.addRecipe(new ItemStack(TDETools.steel_pickaxe), new Object[]{ 
			"xxx",
			" y ",
			" y ",
			'X', TDEItems.steel_ingot, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.dark_stone_pickaxe), new Object[]{ 
			"xxx",
			" y ",
			" y ",
			'X', TDEBlocks.dark_cobblestone, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.steel_axe), new Object[]{ 
			"xx",
			"xy",
			" y",
			'X', TDEItems.steel_ingot, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.steel_axe), new Object[]{ 
			"xx",
			"yx",
			"y ",
			'X', TDEItems.steel_ingot, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.dark_stone_axe), new Object[]{ 
			"xx ",
			"xy ",
			" y ",
			'X', TDEBlocks.dark_cobblestone, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.dark_stone_axe), new Object[]{ 
			"xx",
			"yx",
			"y ",
			'X', TDEBlocks.dark_cobblestone, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.dark_stone_shovel), new Object[]{ 
			"x",
			"y",
			"y",
			'X', TDEBlocks.dark_cobblestone, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.steel_shovel), new Object[]{ 
			"x",
			"y",
			"y",
			'X', TDEItems.steel_ingot, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.dark_stone_hoe), new Object[]{ 
			"xx",
			"y ",
			"y ",
			'X', TDEBlocks.dark_cobblestone, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.dark_stone_hoe), new Object[]{ 
			"xx",
			" y",
			" y",
			'X', TDEBlocks.dark_cobblestone, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.steel_hoe), new Object[]{ 
			"xx",
			" y",
			" y",
			'X', TDEItems.steel_ingot, 'Y', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(TDETools.steel_hoe), new Object[]{ 
			"xx",
			"y ",
			"y ",
			'X', TDEItems.steel_ingot, 'Y', Items.stick
		});
	}
}