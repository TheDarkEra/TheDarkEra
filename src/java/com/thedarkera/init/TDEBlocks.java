package com.thedarkera.init;

import net.minecraft.block.Block;

import com.thedarkera.block.BlockAncientPickaxeOre;
import com.thedarkera.block.BlockEbonyOre;
import com.thedarkera.block.BlockGrapePlant;
import com.thedarkera.block.BlockOrichalcumOre;
import com.thedarkera.block.BlockPortalDark;
import com.thedarkera.block.BlockSteel;
import com.thedarkera.item.ItemSteelOre;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEBlocks
{
	public static Block ebony_ore;
	public static Block steel_ore;
	public static Block orichalcum_ore;
	public static Block ancientpickaxe_ore;
	public static Block grape_plant;
	public static Block dark_portal;
	public static Block teleporter_dark;
	
	public static void init()
	{
			//Blocks//
		ebony_ore = new BlockEbonyOre();
		GameRegistry.registerBlock(ebony_ore, ebony_ore.getUnlocalizedName());		
		orichalcum_ore = new BlockOrichalcumOre();
		GameRegistry.registerBlock(orichalcum_ore, orichalcum_ore.getUnlocalizedName());	
		ancientpickaxe_ore = new BlockAncientPickaxeOre();
		GameRegistry.registerBlock(ancientpickaxe_ore, ancientpickaxe_ore.getUnlocalizedName());	
		
		
			// Meta Blocks//
		steel_ore = new BlockSteel();	
		GameRegistry.registerBlock(steel_ore, ItemSteelOre.class, steel_ore.getUnlocalizedName());
		
		
			//Plants//
		grape_plant = new BlockGrapePlant();
		GameRegistry.registerBlock(grape_plant, grape_plant.getUnlocalizedName());
		
		dark_portal = new BlockPortalDark().setBlockName("dark_portal");
		GameRegistry.registerBlock(dark_portal, dark_portal.getUnlocalizedName());
		teleporter_dark = new BlockPortalDark().setBlockName("teleporter_dark");
		GameRegistry.registerBlock(teleporter_dark, teleporter_dark.getUnlocalizedName());
	}
}
