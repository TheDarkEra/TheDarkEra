package com.thedarkera.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class TDERecipes 
{
	public static void init() 
	{
			//Misc items//
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
		
			//Armors//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.daedric_chestplate), 
				"Y Y",
				"XXX",
				"XXX",
				'X', TDEItems.ebony_ingot, 'Y', TDEItems.leather_strip
			);
	
		
			//Tools//
		GameRegistry.addRecipe(new ShapedOreRecipe(TDETools.ancient_pickaxe, 
				"XXX",
				" Y ",
				" Y ",
				'X', "ancient_ingot", 'Y', Items.stick
		));
	}
}