package com.thedarkera.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TDERecipes 
{
	public static void init() 
	{
		GameRegistry.addRecipe(new ItemStack(TDEItems.leather_strip),
			   	"XXX",
			    "XXX",
			    "XXX",
			    'X', Blocks.leaves
			);
	}
}