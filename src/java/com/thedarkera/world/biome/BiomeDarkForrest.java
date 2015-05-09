package com.thedarkera.world.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.gen.WorldGenDeadTrees;

public class BiomeDarkForrest extends BiomeGenBase {
	private static final WorldGenSavannaTree field_150627_aC = new WorldGenSavannaTree(false);
	private WorldGenerator WorldGenDeadTrees;
	private WorldGenerator WorldGenLakes;

	public BiomeDarkForrest(int biomeID) {
		super(biomeID);
		topBlock = TDEBlocks.dark_grass;
		fillerBlock = TDEBlocks.dark_dirt;
		// bottomBlock = TDEBlocks.dark_stone; TODO: This might mean making our
		// own BiomeGenBase
		waterColorMultiplier = 0x000000;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		this.theBiomeDecorator.treesPerChunk = 50;
		flowers.clear();
		addDefaultFlowers();
		theBiomeDecorator.deadBushPerChunk = 5;
		this.WorldGenDeadTrees = new WorldGenDeadTrees(false);
		this.WorldGenLakes = new WorldGenLiquids(Blocks.water);
	}

	// @Override
	// public void decorate(World world, Random rand, int chunkX, int chunkZ) {
	// super.decorate(world, rand, chunkX, chunkZ);
	//
	// if (rand.nextInt(1000) == 0) {
	// int k = chunkX + rand.nextInt(16) + 8;
	// int l = chunkZ + rand.nextInt(16) + 8;
	// WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
	// worldgendesertwells.generate(world, rand, k,
	// world.getHeightValue(k, l) + 1, l);
	// }
	// }
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random p_150567_1_) {
		return (WorldGenAbstractTree) (p_150567_1_.nextInt(5) > 0 ? field_150627_aC : this.WorldGenDeadTrees);
	}
	// @Override
	// public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	// {
	// return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.WorldGenLakes :
	// (par1Random.nextInt(10) == 0 ? this.WorldGenDeadTrees :
	// this.WorldGenDeadTrees));
	// }
	/*
	 * ToDo:Need to add treesBushesDark Stone replace stoneand more decorative
	 * blocks.
	 * 
	 * NEED MORE BIOME BLOCKS
	 */

}
