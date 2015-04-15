package com.darkteam.thedarkera.handlers;

import com.darkteam.thedarkera.items.ModItems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerRecipes() 
	{
		GameRegistry.addRecipe(new ItemStack(Items.apple),
		   	"XXX",
		    "XXX",
		    "XXX",
		    'X', Blocks.leaves
		);
		GameRegistry.addRecipe(new ItemStack(Items.arrow), 
		    "YZ",
		    "X ",
		    'X', Items.flint, 'Y', Items.stick, 'Z', Blocks.leaves
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1),
		    Items.redstone, new ItemStack(Items.dye, 1, 1)
		);
		GameRegistry.addSmelting(Blocks.stone, new ItemStack(Blocks.stonebrick), 0.1F);
		    	
		ItemStack enchantedSwordItemStack = new ItemStack(Items.stone_sword);
		enchantedSwordItemStack.addEnchantment(Enchantment.sharpness, 1);
		    	
		GameRegistry.addShapelessRecipe(enchantedSwordItemStack,
		    Items.flint, Items.stone_sword
		);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.samingot), 
			ModItems.samdust
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.sampickaxe, 
				"XXX",
				" Y ",
				" Y ",
				'X', "ingotSam", 'Y', Items.stick
		));
	}
}