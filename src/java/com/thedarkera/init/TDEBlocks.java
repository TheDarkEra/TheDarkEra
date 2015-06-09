package com.thedarkera.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;
import com.thedarkera.api.blocks.BlockTDELamp;
import com.thedarkera.api.blocks.BlockTDEStairs;
import com.thedarkera.api.helper.RegHelper;
import com.thedarkera.ingameobjects.block.BlockAncientOre;
import com.thedarkera.ingameobjects.block.BlockCrackedGlass;
import com.thedarkera.ingameobjects.block.BlockCrackedGlassPane;
import com.thedarkera.ingameobjects.block.BlockDarkBirchPlanks;
import com.thedarkera.ingameobjects.block.BlockDarkCobblestone;
import com.thedarkera.ingameobjects.block.BlockDarkDirt;
import com.thedarkera.ingameobjects.block.BlockDarkFire;
import com.thedarkera.ingameobjects.block.BlockDarkGrass;
import com.thedarkera.ingameobjects.block.BlockDarkGravel;
import com.thedarkera.ingameobjects.block.BlockDarkOre;
import com.thedarkera.ingameobjects.block.BlockDarkSand;
import com.thedarkera.ingameobjects.block.BlockDarkStone;
import com.thedarkera.ingameobjects.block.BlockDarkStoneBricks;
import com.thedarkera.ingameobjects.block.BlockDarkStoneDirt;
import com.thedarkera.ingameobjects.block.BlockDarkStoneFence;
import com.thedarkera.ingameobjects.block.BlockDarkStoneLadder;
import com.thedarkera.ingameobjects.block.BlockDeadGrass;
import com.thedarkera.ingameobjects.block.BlockDragonBone;
import com.thedarkera.ingameobjects.block.BlockDragonBoneOre;
import com.thedarkera.ingameobjects.block.BlockEbonyOre;
import com.thedarkera.ingameobjects.block.BlockGrapePlant;
import com.thedarkera.ingameobjects.block.BlockLamp;
import com.thedarkera.ingameobjects.block.BlockOrichalcumOre;
import com.thedarkera.ingameobjects.block.BlockPortalDark;
import com.thedarkera.ingameobjects.block.BlockRottenWood;
import com.thedarkera.ingameobjects.block.BlockRottenWoodFence;
import com.thedarkera.ingameobjects.block.BlockRottenWoodSlab;
import com.thedarkera.ingameobjects.block.BlockSaplings;
import com.thedarkera.ingameobjects.block.BlockSmeltery;
import com.thedarkera.ingameobjects.block.BlockWeedyDirt;
import com.thedarkera.ingameobjects.block.heads.HeadDeathLord;
import com.thedarkera.ingameobjects.block.leaves.BlockLeaf;
import com.thedarkera.ingameobjects.block.logs.BlockLogs1;
import com.thedarkera.ingameobjects.block.logs.BlockLogs2;
import com.thedarkera.ingameobjects.block.logs.BlockLogs3;
import com.thedarkera.ingameobjects.block.metadata.BlockClay;
import com.thedarkera.ingameobjects.block.metadata.BlockClayItem;
import com.thedarkera.ingameobjects.block.metadata.BlockClayStairs;
import com.thedarkera.ingameobjects.block.metadata.BlockClayStairsItem;
import com.thedarkera.ingameobjects.block.metadata.BlockSandstone;
import com.thedarkera.ingameobjects.block.metadata.BlockSandstoneItem;
import com.thedarkera.ingameobjects.block.metadata.BlockWool;
import com.thedarkera.ingameobjects.block.metadata.BlockWoolItem;
import com.thedarkera.ingameobjects.block.slabs.BlockDarkStoneDoubleSlab;
import com.thedarkera.ingameobjects.block.slabs.BlockDarkStoneSlab;
import com.thedarkera.ingameobjects.flatblocks.FlatBlockExample;
import com.thedarkera.ingameobjects.item.ItemLeafBlocks;
import com.thedarkera.ingameobjects.item.ItemLogBlocks1;
import com.thedarkera.ingameobjects.item.ItemLogBlocks2;
import com.thedarkera.ingameobjects.item.ItemLogBlocks3;
import com.thedarkera.ingameobjects.item.ItemLogBlocks4;
import com.thedarkera.ingameobjects.item.ItemSaplingBlocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEBlocks {
	// This adds all the trees. DO NOT CHANGE THE NAMES!
	public static String[] treeTypes1 = new String[] { "Dead", "Dark_Jungle", "Dark_Birch", "Royal_Oak", "Dark_Oak" };
	public static String[][] leafTypes = new String[][] { { "Leaf_Dead", "Leaf_Dark_Jungle", "Leaf_Dark_Birch", "Leaf_Royal_Oak", "Leaf_Black_Wood_Tree", "Leaf_Paper_Birch_Tree", "Leaf_Maple_Tree", "Leaf_Rotten_Tree", "Leaf_Black_Willow", "Leaf_Mangroves" }, { "Leaf_Dead_Opaque", "Leaf_Dark_Jungle	_Opaque", "Leaf_Dark_Birch_Opaque", "Leaf_Royal_Oak_Opaque", "Leaf_Black_Wood_Tree_Opaque", "Leaf_Paper_Birch_Tree_Opaque", "Leaf_Maple_Tree_Opaque", "Leaf_Rotten_Tree_Opaque", "Leaf_Black_Willow_Opaque", "Leaf_Mangroves_Opaque" } };
	public static String[] treeTypes2 = new String[] { "Black_Wood_Tree", "Paper_Birch_Tree", "Maple_Tree", "Rotten_Tree" };
	public static String[] treeTypes3 = new String[] { "Black_Willow", "Mangroves" };
	public static String[] treeTypes4 = new String[] { "Black_Willow", "Mangroves" };
	public static String[] allTreeTypes = new String[] { "Dead", "Dark_Jungle", "Dark_Birch", "Royal_Oak", "Dark_Oak", "Black_Wood_Tree", "Paper_Birch_Tree", "Maple_Tree", "Rotten_Tree", "Black_Willow", "Mangroves" };

	// Blocks//
	public static Block ebony_ore;
	public static Block orichalcum_ore;
	public static Block ancient_ore;
	public static Block dragon_bone_ore;
	public static BlockPortalDark dark_portal;
	public static Block dark_birch_planks;
	public static Block dark_fire;

	public static Block dark_diamond_ore;
	public static Block dark_emerald_ore;
	public static Block dark_coal_ore;
	public static Block dark_iron_ore;
	public static Block dark_gold_ore;

	// TE
	public static Block smeltery;
	public static Block smasher;

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
	public static Block rotten_wood;
	public static Block rotten_wood_slab;
	public static Block rotten_wood_fence;
	public static Block dark_stone_dirt;
	public static Block cracked_glass_pane;
	public static Block cracked_glass;
	public static Block lamp;

	// Slabs //
	public static Block dark_stone_slab;
	public static Block dark_stone_double_slab;

	// Stairs //
	public static Block dark_stone_stairs;
	public static Block rotten_wood_stairs;
	public static Block dark_sandstone_stairs;
	
	// Biome Blocks //
	public static Block dead_grass;
	public static Block weedy_dirt;
	public static Block dark_grass;
	public static Block dark_dirt;
	public static Block dark_gravel;
	public static Block dark_sand;
	public static Block dark_sandstone_bricks;

	// Tree blocks//
	public static Block blockLog1;
	public static Block blockLog2;
	public static Block blockLog3;
	public static Block blockLog4;

	public static Block block_leaves;

	// Placeable items//
	public static Block example;
	public static Block dragon_bone;

	// Boss Heads //
	public static Block death_lord_head;

	//MetaData blocks//
	public static Block dark_clay;
	public static Block dark_wool;
	public static Block dark_sandstone;
	public static Block purple_lamp; // TODO: Needs meta block set up (I'm running out of time before internet disconnects)
	public static Block dark_clay_stairs;

	public static void init() {

		// Blocks //
		dragon_bone_ore = new BlockDragonBoneOre(Material.rock, 1f, 5f, "dragon_bone_ore", "pickaxe", 1, Block.soundTypeStone);
		reg(dragon_bone_ore);
		ancient_ore = new BlockAncientOre(Material.rock, 1f, 5f, "ancient_ore", "pickaxe", 1, Block.soundTypeStone);
		reg(ancient_ore);
		ebony_ore = new BlockEbonyOre(Material.rock, 2f, 5f, "ebony_ore", "pickaxe", 3, Block.soundTypeStone);
		reg(ebony_ore);
		orichalcum_ore = new BlockOrichalcumOre(Material.rock, 2f, 5f, "orichalcum_ore", "pickaxe", 3, Block.soundTypeStone);
		reg(orichalcum_ore);
		dark_stone = new BlockDarkStone(Material.rock, 1f, 10f, "dark_stone", "pickaxe", 0, Block.soundTypeStone);
		reg(dark_stone);
		dark_cobblestone = new BlockDarkCobblestone(Material.rock, 2f, 10f, "dark_cobblestone", "pickaxe", 0, Block.soundTypeStone);
		reg(dark_cobblestone);
		dark_stone_bricks = new BlockDarkStoneBricks(Material.rock, 1.5f, 10f, "dark_stone_bricks", "pickaxe", 0, Block.soundTypeStone);
		reg(dark_stone_bricks);
		rotten_wood = new BlockRottenWood(Material.wood, 1.5f, 2f, "rotten_wood", "axe", 0, Block.soundTypeWood);
		reg(rotten_wood);
		dark_stone_dirt = new BlockDarkStoneDirt(Material.gourd, 1f, 5f, "dark_stone_dirt", "shovel", 1, Block.soundTypeGravel);
		reg(dark_stone_dirt);
		dark_birch_planks = new BlockDarkBirchPlanks(Material.wood, 1.5f, 10f, "dark_birch_planks", "axe", 0, Block.soundTypeWood);
		reg(dark_birch_planks);
		dark_diamond_ore = new BlockDarkOre(Material.rock, 2f, 5f, "dark_diamond_ore", "pickaxe", 3, Block.soundTypeStone);
		reg(dark_diamond_ore);
		dark_coal_ore = new BlockDarkOre(Material.rock, 2f, 5f, "dark_coal_ore", "pickaxe", 0, Block.soundTypeStone);
		reg(dark_coal_ore);
		dark_emerald_ore = new BlockDarkOre(Material.rock, 2f, 5f, "dark_emerald_ore", "pickaxe", 3, Block.soundTypeStone);
		reg(dark_emerald_ore);
		dark_iron_ore = new BlockDarkOre(Material.rock, 2f, 5f, "dark_iron_ore", "pickaxe", 2, Block.soundTypeStone);
		reg(dark_iron_ore);
		dark_gold_ore = new BlockDarkOre(Material.rock, 2f, 5f, "dark_gold_ore", "pickaxe", 2, Block.soundTypeStone);
		reg(dark_gold_ore);

		// TE
		smeltery = new BlockSmeltery();
		reg(smeltery);

		// Plants//
		grape_plant = new BlockGrapePlant();
		reg(grape_plant);

		// Portals//
		dark_portal = (BlockPortalDark) new BlockPortalDark().setBlockName("dark_portal");
		reg(dark_portal);

		// Biome Blocks
		dead_grass = new BlockDeadGrass(Material.grass, 0.4f, 2f, "dead_grass", "shovel", 0, Block.soundTypeGrass);
		reg(dead_grass);
		dark_grass = new BlockDarkGrass(Material.grass, 0.4f, 2f, "dark_grass", "shovel", 0, Block.soundTypeGrass);
		reg(dark_grass);
		dark_dirt = new BlockDarkDirt(Material.gourd, 0.3f, 2f, "dark_dirt", "shovel", 1, Block.soundTypeGravel);
		reg(dark_dirt);
		dark_gravel = new BlockDarkGravel("dark_gravel");
		reg(dark_gravel);
		weedy_dirt = new BlockWeedyDirt(Material.gourd, 0.4f, 2.1f, "weedy_dirt", "", 0, Block.soundTypeGravel);
		reg(weedy_dirt);
		dark_sand = new BlockDarkSand(Material.sand, 2f, 2f, "dark_sand", "shovel", 0, Block.soundTypeSand);
		reg(dark_sand);

		blockLog1 = new BlockLogs1().setBlockName("log1").setCreativeTab(TDE.tabTDEBlocks);
		reg(blockLog1, ItemLogBlocks1.class);
		blockLog2 = new BlockLogs2().setBlockName("log2").setCreativeTab(TDE.tabTDEBlocks);
		reg(blockLog2, ItemLogBlocks2.class);
		blockLog3 = new BlockLogs3().setBlockName("log3").setCreativeTab(TDE.tabTDEBlocks);
		reg(blockLog3, ItemLogBlocks3.class);
		blockLog4 = new BlockLogs3().setBlockName("log4").setCreativeTab(TDE.tabTDEBlocks);
		reg(blockLog4, ItemLogBlocks4.class);

		block_leaves = new BlockLeaf().setBlockName("leaf").setCreativeTab(TDE.tabTDEBlocks);
		reg(block_leaves, ItemLeafBlocks.class);

		saplings = new BlockSaplings().setBlockName("sapling").setCreativeTab(TDE.tabTDEBlocks);
		reg(saplings, ItemSaplingBlocks.class);

		// Placeable items//
		example = new FlatBlockExample();
		dragon_bone = new BlockDragonBone(Material.cloth, 1f, 1f, "dragon_bones", "pickaxe", 0, Block.soundTypeStone);
		reg(dragon_bone);

		// Special Blocks //
		dark_stone_ladder = new BlockDarkStoneLadder();
		reg(dark_stone_ladder);
		dark_stone_fence = new BlockDarkStoneFence(TheDarkEra.MODID + ":dark_stone");
		reg(dark_stone_fence);
		rotten_wood_fence = new BlockRottenWoodFence(TheDarkEra.MODID + ":rotting_wood");
		reg(rotten_wood_fence);
		rotten_wood_slab = new BlockRottenWoodSlab(false, Material.wood);
		reg(rotten_wood_slab);
		cracked_glass_pane = new BlockCrackedGlassPane(TheDarkEra.MODID + ":cracked_glass", "cracked_glass", Material.glass, false);
		reg(cracked_glass_pane);
		cracked_glass = new BlockCrackedGlass(Material.glass, false);
		reg(cracked_glass);
		lamp = new BlockLamp();
		reg(lamp);
		dark_fire = new BlockDarkFire();
		reg(dark_fire);
		BlockDarkFire.func_149843_e();

		//Slabs
		dark_stone_slab = new BlockDarkStoneSlab("dark_stone_slab", Material.rock, 1f, Block.soundTypeStone);
		reg(dark_stone_slab);
		dark_stone_double_slab = new BlockDarkStoneDoubleSlab("dark_stone_double_slab", Material.rock, 1f, Block.soundTypeStone, "dark_stone_slab");
		reg(dark_stone_double_slab);
		
		// Boss Heads //
		death_lord_head = new HeadDeathLord(Material.cloth, 0.1f, 0.1f, "death_lord_head", "axe", 0, Block.soundTypeCloth);
		reg(death_lord_head);

		// Meta Blocks//
		dark_clay = new BlockClay(Material.rock, 0.1f, 0.1f, "dark_clay", "shovel", 0, Block.soundTypeSand);
		GameRegistry.registerBlock(dark_clay, BlockClayItem.class, "dark_clay");
		dark_wool = new BlockWool(Material.cloth, 0.1f, 0.1f, "dark_wool", "sheers", 0, Block.soundTypeCloth);
		GameRegistry.registerBlock(dark_wool, BlockWoolItem.class, "dark_wool");
		dark_sandstone = new BlockSandstone(Material.rock, 0.1f, 0.1f, "dark_sandstone", "pickaxe", 0, Block.soundTypeStone);
		GameRegistry.registerBlock(dark_sandstone, BlockSandstoneItem.class, "dark_sandstone");
		purple_lamp = new BlockTDELamp("purple_lamp", Material.glass, 1f, 5f, "pickaxe", 0, Block.soundTypeGlass, 5f);
		reg(purple_lamp);
		dark_clay_stairs = new BlockClayStairs(dark_clay, 0, Material.rock, 0.1f, 0.1f, "dark_clay", "shovel", 0, Block.soundTypeSand);
		GameRegistry.registerBlock(dark_clay_stairs, BlockClayStairsItem.class, "dark_clay_stairs");

        // Stairs //
        dark_stone_stairs = new BlockTDEStairs(dark_cobblestone, 1, 1f, 1f, "dark_stone_stairs", Block.soundTypeStone); // TODO: Set Parameter 3 & 4
        reg(dark_stone_stairs);
        rotten_wood_stairs = new BlockTDEStairs(rotten_wood, 2, 1f, 1f, "rotten_wood_stairs", Block.soundTypeStone); // TODO: Set Parameter 3 & 4
        reg(rotten_wood_stairs);
        dark_sandstone_stairs = new BlockTDEStairs(dark_sandstone, 3, 1f, 1f, "dark_sandstone_stairs", Block.soundTypeStone); // TODO: Set Parameter 3 & 4
        reg(dark_sandstone_stairs);

	}

	public static void reg(Block block) {
		RegHelper.reg(block);
	}

	public static void reg(Block block, Class<? extends ItemBlock> itemBlock) {
		RegHelper.reg(block, itemBlock);
	}
}
