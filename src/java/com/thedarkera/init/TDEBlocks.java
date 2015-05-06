package com.thedarkera.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

import com.thedarkera.TheDarkEra;
import com.thedarkera.block.BlockAncientAxeOre;
import com.thedarkera.block.BlockAncientHoeOre;
import com.thedarkera.block.BlockAncientOre;
import com.thedarkera.block.BlockAncientPickaxeOre;
import com.thedarkera.block.BlockAncientShovelOre;
import com.thedarkera.block.BlockDarkBirchPlanks;
import com.thedarkera.block.BlockDarkCobblestone;
import com.thedarkera.block.BlockDarkDirt;
import com.thedarkera.block.BlockDarkGrass;
import com.thedarkera.block.BlockDarkStone;
import com.thedarkera.block.BlockDarkStoneBricks;
import com.thedarkera.block.BlockDarkStoneDirt;
import com.thedarkera.block.BlockDarkStoneFence;
import com.thedarkera.block.BlockDarkStoneLadder;
import com.thedarkera.block.BlockDarkStoneSlab;
import com.thedarkera.block.BlockDarkStoneStairs;
import com.thedarkera.block.BlockDeadGrass;
import com.thedarkera.block.BlockEbonyOre;
import com.thedarkera.block.BlockGrapePlant;
import com.thedarkera.block.BlockOrichalcumOre;
import com.thedarkera.block.BlockPortalDark;
import com.thedarkera.block.BlockRottenWood;
import com.thedarkera.block.BlockRottenWoodFence;
import com.thedarkera.block.BlockRottenWoodSlab;
import com.thedarkera.block.BlockRottenWoodStairs;
import com.thedarkera.block.BlockSaplings;
import com.thedarkera.block.BlockSmasher;
import com.thedarkera.block.BlockSmeltery;
import com.thedarkera.block.BlockSteel;
import com.thedarkera.block.BlockWeedyDirt;
import com.thedarkera.block.logs.BlockLogDarkBirch;
import com.thedarkera.block.logs.BlockLogDead;
import com.thedarkera.block.logs.BlockLogWisp;
import com.thedarkera.flatblocks.FlatBlockExample;
import com.thedarkera.item.ItemSteelOre;
import com.thedarkera.utils.RegUtils;

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
	public static Block dark_portal;
	public static Block teleporter_dark;
	public static Block smasher;
	public static Block dark_birch_planks; 
	
	public static Block smeltery;
	
	//plants//
	public static Block grape_plant;
	public static Block saplings;
	
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
	public static Block dark_stone_dirt;
	
	//Biome Blocks //
	public static Block dead_grass;
	public static Block weedy_dirt;
	public static Block dark_grass;
	public static Block dark_dirt;
	public static Block dark_gravel;
	
	//Tree blocks//
	public static Block log_dead;
	public static Block dark_birch_log;
	public static Block wisp_log;
	
	//Placeable items//
	public static Block example;
	

	public static void init()
	{
		//Blocks//
		ancientpickaxe_ore = new BlockAncientPickaxeOre();
		reg(ancientpickaxe_ore);
		ancientaxe_ore = new BlockAncientAxeOre();
		reg(ancientaxe_ore);
		ancientshovel_ore = new BlockAncientShovelOre();
		reg(ancientshovel_ore);
		ancienthoe_ore = new BlockAncientHoeOre();
		reg(ancienthoe_ore);
		ancient_ore = new BlockAncientOre();
		reg(ancient_ore);
		ebony_ore = new BlockEbonyOre();
		reg(ebony_ore);		
		orichalcum_ore = new BlockOrichalcumOre();
		reg(orichalcum_ore);	
		dark_stone_ladder = new BlockDarkStoneLadder();
		reg(dark_stone_ladder);
		dark_stone = new BlockDarkStone();
		reg(dark_stone);
		dark_cobblestone = new BlockDarkCobblestone();
		reg(dark_cobblestone);
		dark_stone_bricks = new BlockDarkStoneBricks();
		reg(dark_stone_bricks);
		dark_stone_fence = new BlockDarkStoneFence(TheDarkEra.MODID + ":dark_stone");
		reg(dark_stone_fence);
		dark_stone_stairs = new BlockDarkStoneStairs(dark_stone, 0);
		reg(dark_stone_stairs);
		dark_stone_slab = new BlockDarkStoneSlab(false, Material.rock);
		reg(dark_stone_slab);
		rotten_wood = new BlockRottenWood();
		reg(rotten_wood);
		rotten_wood_fence = new BlockRottenWoodFence(TheDarkEra.MODID + ":rotting_wood");
		reg(rotten_wood_fence);
		rotten_wood_stairs = new BlockRottenWoodStairs(rotten_wood, 0);
		reg(rotten_wood_stairs);
		rotten_wood_slab = new BlockRottenWoodSlab(false, Material.wood);
		reg(rotten_wood_slab);
		dark_stone_dirt = new BlockDarkStoneDirt();
		reg(dark_stone_dirt);
		smasher = new BlockSmasher();
		dark_birch_planks = new BlockDarkBirchPlanks();
		reg(dark_birch_planks);

		smeltery = new BlockSmeltery();
		reg(smeltery);
		
		// Meta Blocks//
		steel_ore = new BlockSteel();	
		reg(steel_ore, ItemSteelOre.class);


		//Plants//
		grape_plant = new BlockGrapePlant();
		reg(grape_plant);
		saplings = new BlockSaplings();
		reg(saplings);
		

		//Portals//
		dark_portal = new BlockPortalDark().setBlockName("dark_portal");
		reg(dark_portal);
		teleporter_dark = new BlockPortalDark().setBlockName("teleporter_dark");
		reg(teleporter_dark);

		//Biome Blocks
		dead_grass = new BlockDeadGrass("dead_grass");
		reg(dead_grass);
		dark_grass = new BlockDarkGrass("dark_grass");
		reg(dark_grass);
		dark_dirt = new BlockDarkDirt("dark_dirt");
		reg(dark_dirt);
		dark_gravel = new BlockDarkDirt("dark_gravel");
		reg(dark_gravel);
		weedy_dirt = new BlockWeedyDirt("weedy_dirt");
		reg(weedy_dirt);
		
		//Tree blocks//
		dark_birch_log = new BlockLogDarkBirch();
		reg(dark_birch_log);
		wisp_log = new BlockLogWisp();
		reg(wisp_log);
		log_dead = new BlockLogDead();
		reg(log_dead);

		//Placeable items//
		example = new FlatBlockExample();
	}
	
	public static void reg(Block block)
	{
		RegUtils.reg(block);
	}
	
	public static void reg(Block block, Class<? extends ItemBlock> itemBlock)
	{
		RegUtils.reg(block, itemBlock);
	}
}
