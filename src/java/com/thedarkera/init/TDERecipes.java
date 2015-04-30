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
	
		
			//Armors//
						//Daedric armor//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.daedric_helmet), new Object[]{ 
				"XXX",
				"Y Y",
				"   ",
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
				"   ",
				"X X",
				"Y Y",
				'X', TDEItems.ebony_ingot, 'Y', TDEItems.leather_strip
		});
					//Steel armor//
		GameRegistry.addRecipe(new ItemStack(TDEArmors.steel_helmet), new Object[]{ 
			"XXX",
			"Y Y",
			"   ",
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
				"   ",
				"X X",
				"Y Y",
				'X', TDEItems.steel_ingot, 'Y', TDEItems.leather_strip
		});

	
		
			//Tools//
	
	

	}
}