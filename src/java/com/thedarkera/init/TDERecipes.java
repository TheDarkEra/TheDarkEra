package com.thedarkera.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TDERecipes 
{
	public static void init() 
	{
		GameRegistry.addRecipe(new ItemStack(TDEItems.leather_strip, 2),
			   	"  ",
			    " X ",
			    "  ",
			    'X', Items.leather
			);
		//Ingots//
		GameRegistry.addSmelting(TDEBlocks.ebony_ore, new ItemStack(TDEItems.ebony_ingot), 0.8F);
		GameRegistry.addSmelting(TDEBlocks.steel_ore, new ItemStack(TDEItems.steel_ingot), 0.4F);
		GameRegistry.addSmelting(TDEBlocks.orichalcum_ore, new ItemStack(TDEItems.orichalcum_ingot), 0.5F);
		GameRegistry.addSmelting(TDEBlocks.ancient_ore, new ItemStack(TDEItems.ancient_ingot), 0.4F);
	}
}