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
import com.thedarkera.block.BlockCrackedGlass;
import com.thedarkera.block.BlockCrackedGlassPane;
import com.thedarkera.block.BlockDarkBirchPlanks;
import com.thedarkera.block.BlockDarkCobblestone;
import com.thedarkera.block.BlockDarkDirt;
import com.thedarkera.block.BlockDarkFire;
import com.thedarkera.block.BlockDarkGrass;
import com.thedarkera.block.BlockDarkStone;
import com.thedarkera.block.BlockDarkStoneBricks;
import com.thedarkera.block.BlockDarkStoneDirt;
import com.thedarkera.block.BlockDarkStoneFence;
import com.thedarkera.block.BlockDarkStoneLadder;
import com.thedarkera.block.BlockDarkStoneSlab;
import com.thedarkera.block.BlockDarkStoneStairs;
import com.thedarkera.block.BlockDeadGrass;
import com.thedarkera.block.BlockDragonBone;
import com.thedarkera.block.BlockDragonBoneOre;
import com.thedarkera.block.BlockEbonyOre;
import com.thedarkera.block.BlockGrapePlant;
import com.thedarkera.block.BlockLamp;
import com.thedarkera.block.BlockOrichalcumOre;
import com.thedarkera.block.BlockPortalDark;
import com.thedarkera.block.BlockRottenWood;
import com.thedarkera.block.BlockRottenWoodFence;
import com.thedarkera.block.BlockRottenWoodSlab;
import com.thedarkera.block.BlockRottenWoodStairs;
import com.thedarkera.block.BlockSaplings;
import com.thedarkera.block.BlockSmasher;
import com.thedarkera.block.BlockSmeltery;
import com.thedarkera.block.BlockWeedyDirt;
import com.thedarkera.block.leaves.BlockLeaf;
import com.thedarkera.block.logs.BlockLogDarkBirch;
import com.thedarkera.block.logs.BlockLogWisp;
import com.thedarkera.block.logs.BlockLogs1;
import com.thedarkera.block.logs.BlockLogs2;
import com.thedarkera.block.logs.BlockLogs3;
import com.thedarkera.flatblocks.FlatBlockExample;
import com.thedarkera.item.ItemLeafBlocks;
import com.thedarkera.item.ItemLogBlocks1;
import com.thedarkera.item.ItemLogBlocks2;
import com.thedarkera.item.ItemLogBlocks3;
import com.thedarkera.item.ItemSaplingBlocks;
import com.thedarkera.utils.RegUtils;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEBlocks {
	// This adds all the trees. DO NOT CHANGE THE NAMES!
	public static String[] treeTypes1 = new String[] { "Dead", "Wisp", "Dark_Birch", "Royal_Oak" };

	public static String[][] leafTypes = new String[][] {
			{ "Leaf_Dead", "Leaf_Wisp", "Leaf_Dark_Birch", "Leaf_Royal_Oak", "Leaf_Black_Wood_Tree", "Leaf_Paper_Birch_Tree", "Leaf_Maple_Tree", "Leaf_Rotten_Tree", "Leaf_Black_Willow",
					"Leaf_Mangroves" },
			{ "Leaf_Dead_Opaque", "Leaf_Wisp_Opaque", "Leaf_Dark_Birch_Opaque", "Leaf_Royal_Oak_Opaque", "Leaf_Black_Wood_Tree_Opaque", "Leaf_Paper_Birch_Tree_Opaque", "Leaf_Maple_Tree_Opaque",
					"Leaf_Rotten_Tree_Opaque", "Leaf_Black_Willow_Opaque", "Leaf_Mangroves_Opaque" } };
	public static String[] treeTypes2 = new String[] { "Black_Wood_Tree", "Paper_Birch_Tree", "Maple_Tree", "Rotten_Tree" };
	public static String[] treeTypes3 = new String[] { "Black_Willow", "Mangroves" };
	public static String[] allTreeTypes = new String[] {"Dead", "Wisp", "Dark_Birch", "Royal_Oak", "Black_Wood_Tree", "Paper_Birch_Tree", "Maple_Tree", "Rotten_Tree", "Black_Willow", "Mangroves"};
	// Blocks//
	public static Block ebony_ore;
	public static Block orichalcum_ore;
	public static Block ancient_ore;
	public static Block dragon_bone_ore;
	public static Block ancientpickaxe_ore;
	public static Block ancientaxe_ore;
	/** Unlike ancient axe and pickaxe this ore will be in sand. */
	public static Block ancientshovel_ore;
	/** Unlike ancient axe and pickaxe this ore will be in dirt. */
	public static Block ancienthoe_ore;
	public static BlockPortalDark dark_portal;
	public static Block teleporter_dark;
	public static Block smasher;
	public static Block dark_birch_planks;
	public static Block dark_fire;
	
	public static Block dark_diamond_ore;
	public static Block dark_emerald_ore;
	public static Block dark_coal_ore;
	public static Block dark_iron_ore;
	public static Block dark_gold_ore;

	public static Block smeltery;

	// plants//
	public static Block grape_plant;
	public static Block saplings;

	// village blocks //
	// TODO: Use block metadata
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
	public static Block cracked_glass_pane; 
	public static Block cracked_glass;
	public static Block lamp;

	// Biome Blocks //
	public static Block dead_grass;
	public static Block weedy_dirt;
	public static Block dark_grass;
	public static Block dark_dirt;
	public static Block dark_gravel;

	// Tree blocks//
	public static Block blockLog1;
	public static Block blockLog2;
	public static Block blockLog3;

	public static Block block_leaves;

	public static Block dark_birch_log;
	public static Block wisp_log;

	// Placeable items//
	public static Block example;
	public static Block dragon_bone;

	public static void init() {
		// Blocks//
		ancientpickaxe_ore = new BlockAncientPickaxeOre();
		reg(ancientpickaxe_ore);
		ancientaxe_ore = new BlockAncientAxeOre();
		reg(ancientaxe_ore);
		ancientshovel_ore = new BlockAncientShovelOre();
		reg(ancientshovel_ore);
		dragon_bone_ore = new BlockDragonBoneOre();
		reg(dragon_bone_ore);
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
		dark_stone_stairs = new BlockDarkStoneStairs(dark_cobblestone, 0);
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
		dark_fire = new BlockDarkFire();
		reg(dark_fire);
		cracked_glass_pane = new BlockCrackedGlassPane(TheDarkEra.MODID + ":cracked_glass", "cracked_glass", Material.glass, false);
		reg(cracked_glass_pane);
		cracked_glass = new BlockCrackedGlass(Material.glass, false);
		reg(cracked_glass);
		lamp = new BlockLamp();
		reg(lamp);
		
//		dark_diamond_ore = new BlockDarkOre(Material.rock, "dark_diamond_ore");
//		reg(dark_diamond_ore);
//		dark_coal_ore = new BlockDarkOre(Material.rock, "dark_coal_ore");
//		reg(dark_coal_ore);
//		dark_emerald_ore = new BlockDarkOre(Material.rock, "dark_emerald_ore");
//		reg(dark_emerald_ore);
//		dark_iron_ore = new BlockDarkOre(Material.rock, "dark_iron_ore");
//		reg(dark_iron_ore);
//		dark_gold_ore = new BlockDarkOre(Material.rock, "dark_gold_ore");
//		reg(dark_gold_ore);

		smeltery = new BlockSmeltery();
		reg(smeltery);

		// Meta Blocks//

		// Plants//
		grape_plant = new BlockGrapePlant();
		reg(grape_plant);

		// Portals//
		dark_portal = (BlockPortalDark) new BlockPortalDark().setBlockName("dark_portal");
		reg(dark_portal);
		teleporter_dark = new BlockPortalDark().setBlockName("teleporter_dark");
		reg(teleporter_dark);

		// Biome Blocks
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

		// Tree blocks//
		dark_birch_log = new BlockLogDarkBirch();
		reg(dark_birch_log);

		wisp_log = new BlockLogWisp();
		reg(wisp_log);

		blockLog1 = new BlockLogs1().setBlockName("log1").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerBlock(blockLog1, ItemLogBlocks1.class, blockLog1.getUnlocalizedName().substring(5));
		blockLog2 = new BlockLogs2().setBlockName("log2").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerBlock(blockLog2, ItemLogBlocks2.class, blockLog2.getUnlocalizedName().substring(5));
		blockLog3 = new BlockLogs3().setBlockName("log3").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerBlock(blockLog3, ItemLogBlocks3.class, blockLog3.getUnlocalizedName().substring(5));

		block_leaves = new BlockLeaf().setBlockName("leaf").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerBlock(block_leaves, ItemLeafBlocks.class, block_leaves.getUnlocalizedName().substring(5));

		saplings = new BlockSaplings().setBlockName("sapling").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerBlock(saplings, ItemSaplingBlocks.class, saplings.getUnlocalizedName().substring(5));

		// Placeable items//
		example = new FlatBlockExample();
		
		// Misc //
		dragon_bone = new BlockDragonBone();
		reg(dragon_bone);
}

	public static void reg(Block block) {
		RegUtils.reg(block);
	}

	public static void reg(Block block, Class<? extends ItemBlock> itemBlock) {
		RegUtils.reg(block, itemBlock);
	}
}
