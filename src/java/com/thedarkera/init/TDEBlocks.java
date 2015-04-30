package com.thedarkera.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.block.BlockAncientPickaxeOre;
import com.thedarkera.block.BlockDarkCobblestone;
import com.thedarkera.block.BlockDarkStone;
import com.thedarkera.block.BlockDarkStoneBricks;
import com.thedarkera.block.BlockDarkStoneFence;
import com.thedarkera.block.BlockDarkStoneSlab;
import com.thedarkera.block.BlockDarkStoneStairs;
import com.thedarkera.block.BlockEbonyOre;
import com.thedarkera.block.BlockGrapePlant;
import com.thedarkera.block.BlockOrichalcumOre;
import com.thedarkera.block.BlockPortalDark;
import com.thedarkera.block.BlockRottenWood;
import com.thedarkera.block.BlockRottenWoodFence;
import com.thedarkera.block.BlockRottenWoodSlab;
import com.thedarkera.block.BlockRottenWoodStairs;
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
	
	//village blocks, may want to lower block id's using meta blocks//
	public static Block dark_stone;
	public static Block dark_cobblestone;
	public static Block dark_stone_bricks;
	public static Block dark_stone_fence;
	public static Block dark_stone_stairs;
	public static Block dark_stone_slab;
	public static Block rotten_wood;
	public static Block rotten_wood_stairs;
	public static Block rotten_wood_slab;
	public static Block rotten_wood_fence;
	
	public static void init()
	{
			//Blocks//
		ebony_ore = new BlockEbonyOre();
		GameRegistry.registerBlock(ebony_ore, ebony_ore.getUnlocalizedName());		
		orichalcum_ore = new BlockOrichalcumOre();
		GameRegistry.registerBlock(orichalcum_ore, orichalcum_ore.getUnlocalizedName());	
		dark_stone = new BlockDarkStone();
		GameRegistry.registerBlock(dark_stone, dark_stone.getUnlocalizedName());
		dark_cobblestone = new BlockDarkCobblestone();
		GameRegistry.registerBlock(dark_cobblestone, dark_cobblestone.getUnlocalizedName());
		dark_stone_bricks = new BlockDarkStoneBricks();
		GameRegistry.registerBlock(dark_stone_bricks, dark_stone_bricks.getUnlocalizedName());
		dark_stone_fence = new BlockDarkStoneFence("dark_stone_fence");
		GameRegistry.registerBlock(dark_stone_fence, dark_stone_fence.getUnlocalizedName());
		dark_stone_stairs = new BlockDarkStoneStairs(dark_stone, 0);
		GameRegistry.registerBlock(dark_stone_stairs, dark_stone_stairs.getUnlocalizedName());
		dark_stone_slab = new BlockDarkStoneSlab(false, Material.rock);
		GameRegistry.registerBlock(dark_stone_slab, dark_stone_slab.getUnlocalizedName());
		ancientpickaxe_ore = new BlockAncientPickaxeOre();
		GameRegistry.registerBlock(ancientpickaxe_ore, ancientpickaxe_ore.getUnlocalizedName());
		rotten_wood = new BlockRottenWood();
		GameRegistry.registerBlock(rotten_wood, rotten_wood.getUnlocalizedName());
		rotten_wood_fence = new BlockRottenWoodFence("rotten_wood_fence");
		GameRegistry.registerBlock(rotten_wood_fence, rotten_wood_fence.getUnlocalizedName());
		rotten_wood_stairs = new BlockRottenWoodStairs(rotten_wood, 0);
		GameRegistry.registerBlock(rotten_wood_stairs, rotten_wood_stairs.getUnlocalizedName());
		rotten_wood_slab = new BlockRottenWoodSlab(false, Material.wood);
		GameRegistry.registerBlock(rotten_wood_slab, rotten_wood_slab.getUnlocalizedName());
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
