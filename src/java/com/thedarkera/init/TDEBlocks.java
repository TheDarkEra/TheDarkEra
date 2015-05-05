package com.thedarkera.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;
import com.thedarkera.block.*;
import com.thedarkera.item.ItemSteelOre;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEBlocks
{
	//Blocks//
	public static Block ebony_ore;
	public static Block steel_ore;
	public static Block orichalcum_ore;
	public static Block ancient_ore;
	public static Block ancientpickaxe_ore;
	public static Block ancientaxe_ore;
	/** Unlike ancient axe and pickaxe this ore will be in sand. */
	public static Block ancientshovel_ore;
	/** Unlike ancient axe and pickaxe this ore will be in dirt. */
	public static Block ancienthoe_ore;
	public static Block grape_plant;
	public static Block dark_portal;
	public static Block teleporter_dark;
	public static Block smasher;
	public static Block dark_birch_planks; 
	
	public static Block smeltery;

	//village blocks //
	//TODO: Use block metadata
	public static Block dark_stone_ladder;
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
	public static Block dead_grass;
	public static Block dark_stone_dirt;

	//Tree blocks//
	public static Block dark_birch_wood;
	public static Block wisp_wood;
	public static Block rotten_wood_log;

	public static void init()
	{
		//Blocks//
		ancientpickaxe_ore = new BlockAncientPickaxeOre();
		GameRegistry.registerBlock(ancientpickaxe_ore, ancientpickaxe_ore.getUnlocalizedName().substring(5).substring(5));
		ancientaxe_ore = new BlockAncientAxeOre();
		GameRegistry.registerBlock(ancientaxe_ore, ancientaxe_ore.getUnlocalizedName().substring(5));
		ancientshovel_ore = new BlockAncientShovelOre();
		GameRegistry.registerBlock(ancientshovel_ore, ancientshovel_ore.getUnlocalizedName().substring(5));
		ancienthoe_ore = new BlockAncientHoeOre();
		GameRegistry.registerBlock(ancienthoe_ore, ancienthoe_ore.getUnlocalizedName().substring(5));
		ancient_ore = new BlockAncientOre();
		GameRegistry.registerBlock(ancient_ore, ancient_ore.getUnlocalizedName().substring(5));
		ebony_ore = new BlockEbonyOre();
		GameRegistry.registerBlock(ebony_ore, ebony_ore.getUnlocalizedName().substring(5));		
		orichalcum_ore = new BlockOrichalcumOre();
		GameRegistry.registerBlock(orichalcum_ore, orichalcum_ore.getUnlocalizedName().substring(5));	
		dark_stone_ladder = new BlockDarkStoneLadder();
		GameRegistry.registerBlock(dark_stone_ladder, dark_stone_ladder.getUnlocalizedName().substring(5));
		dark_stone = new BlockDarkStone();
		GameRegistry.registerBlock(dark_stone, dark_stone.getUnlocalizedName().substring(5));
		dark_cobblestone = new BlockDarkCobblestone();
		GameRegistry.registerBlock(dark_cobblestone, dark_cobblestone.getUnlocalizedName().substring(5));
		dark_stone_bricks = new BlockDarkStoneBricks();
		GameRegistry.registerBlock(dark_stone_bricks, dark_stone_bricks.getUnlocalizedName().substring(5));
		dark_stone_fence = new BlockDarkStoneFence(TheDarkEra.MODID + ":dark_stone");
		GameRegistry.registerBlock(dark_stone_fence, dark_stone_fence.getUnlocalizedName().substring(5));
		dark_stone_stairs = new BlockDarkStoneStairs(dark_stone, 0);
		GameRegistry.registerBlock(dark_stone_stairs, dark_stone_stairs.getUnlocalizedName().substring(5));
		dark_stone_slab = new BlockDarkStoneSlab(false, Material.rock);
		GameRegistry.registerBlock(dark_stone_slab, dark_stone_slab.getUnlocalizedName().substring(5));
		rotten_wood = new BlockRottenWood();
		GameRegistry.registerBlock(rotten_wood, rotten_wood.getUnlocalizedName().substring(5));
		rotten_wood_fence = new BlockRottenWoodFence(TheDarkEra.MODID + ":rotting_wood");
		GameRegistry.registerBlock(rotten_wood_fence, rotten_wood_fence.getUnlocalizedName().substring(5));
		rotten_wood_stairs = new BlockRottenWoodStairs(rotten_wood, 0);
		GameRegistry.registerBlock(rotten_wood_stairs, rotten_wood_stairs.getUnlocalizedName().substring(5));
		rotten_wood_slab = new BlockRottenWoodSlab(false, Material.wood);
		GameRegistry.registerBlock(rotten_wood_slab, rotten_wood_slab.getUnlocalizedName().substring(5));
		dead_grass = new BlockDeadGrass();
		GameRegistry.registerBlock(dead_grass, dead_grass.getUnlocalizedName().substring(5));
		dark_stone_dirt = new BlockDarkStoneDirt();
		GameRegistry.registerBlock(dark_stone_dirt, dark_stone_dirt.getUnlocalizedName().substring(5));
		smasher = new BlockSmasher();
		dark_birch_planks = new BlockDarkBirchPlanks();
		GameRegistry.registerBlock(dark_birch_planks, dark_birch_planks.getUnlocalizedName().substring(5));

		smeltery = new BlockSmeltery();
		GameRegistry.registerBlock(smeltery, smeltery.getUnlocalizedName().substring(5));
		
		// Meta Blocks//
		steel_ore = new BlockSteel();	
		GameRegistry.registerBlock(steel_ore, ItemSteelOre.class, steel_ore.getUnlocalizedName().substring(5));


		//Plants//
		grape_plant = new BlockGrapePlant();
		GameRegistry.registerBlock(grape_plant, grape_plant.getUnlocalizedName().substring(5));

		//Portals//
		dark_portal = new BlockPortalDark().setBlockName("dark_portal");
		GameRegistry.registerBlock(dark_portal, dark_portal.getUnlocalizedName().substring(5));
		teleporter_dark = new BlockPortalDark().setBlockName("teleporter_dark");
		GameRegistry.registerBlock(teleporter_dark, teleporter_dark.getUnlocalizedName().substring(5));

		//Tree blocks//
		dark_birch_wood = new BlockDarkBirchWood();
		GameRegistry.registerBlock(dark_birch_wood, dark_birch_wood.getUnlocalizedName().substring(5));
		wisp_wood = new BlockWispWood();
		GameRegistry.registerBlock(wisp_wood, wisp_wood.getUnlocalizedName().substring(5));
		rotten_wood_log = new BlockRottenWoodLog(Material.wood);
		GameRegistry.registerBlock(rotten_wood_log, rotten_wood_log.getUnlocalizedName().substring(5));
		
	}
}
