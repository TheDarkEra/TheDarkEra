package com.thedarkera.world.biome.decorator;

import java.util.Random;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.gen.WorldGenDarkBirchTree;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeDecoratorTDE extends BiomeDecorator {
	/** The world the BiomeDecorator is currently decorating */
	public static World currentWorld;
	/** The Biome Decorator's random number generator. */
	public static Random randomGenerator;
	/** The X-coordinate of the chunk currently being decorated */
	public static int chunk_X;
	/** The Z-coordinate of the chunk currently being decorated */
	public static int chunk_Z;
	/** True if decorator should generate surface lava & water */
	public static boolean generateLakes;
	/** How meny trees per chunk, set in each biome class **/
	public static int howMenyTrees;

	/** Dimension Trees **/
	// public static WorldGenForestTrees smallTree;
	// public static WorldGenForestBigTree bigTree;
	// public static WorldGenEffectTree effectTree;
	public static WorldGenDarkBirchTree dark_birch_tree;

	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000164";

	public BiomeDecoratorTDE() {
		// coalGen = new WorldGenMinable(Blocks.coal_ore, 16,
		// Blockss.lightStone);
		// ironGen = new WorldGenMinable(Blocks.iron_ore, 8,
		// Blockss.lightStone);
		// goldGen = new WorldGenMinable(Blocks.gold_ore, 8,
		// Blockss.lightStone);
		// redstoneGen = new WorldGenMinable(Blocks.redstone_ore, 7,
		// Blockss.lightStone);
		// diamondGen = new WorldGenMinable(Blocks.diamond_ore, 7,
		// Blockss.lightStone);
		// lapisGen = new WorldGenMinable(Blocks.lapis_ore, 6,
		// Blockss.lightStone);
		// ebonyGen = new WorldGenMinable(TDEBlocks.ebony_ore, 6
		// Blockss.lightStone);

		// TREES
		// smallTree = new WorldGenForestTrees(true);
		// bigTree = new WorldGenForestBigTree(true, 10, 1, 5);
		// effectTree = new WorldGenEffectTree(true);
		// dark_birch_tree = new WorldGenDarkBirchTree(true);

		// generates lakes and lava lakes in dimension.
		generateLakes = true;
	}

	public void decorateChunk(World world, Random random,
			BiomeGenBase biomeGenBase, int chunkX, int chunkZ) {
		if (currentWorld != null) {
			throw new RuntimeException("Already decorating!!");
		} else {
			currentWorld = world;
			randomGenerator = random;
			chunk_X = chunkX;
			chunk_Z = chunkZ;
			genDecorationsForBiome(biomeGenBase);
			currentWorld = null;
			randomGenerator = null;
		}
	}

	/**
	 * Decorate's biome.
	 * 
	 * @param biome
	 */
	protected void genDecorationsForBiome(BiomeGenBase biome) {
		BiomeDecoratorHelper.decorateBiome(biome);
	}
}
