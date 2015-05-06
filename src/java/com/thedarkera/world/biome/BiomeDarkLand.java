package com.thedarkera.world.biome;

import java.util.Random;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

public class BiomeDarkLand extends BiomeGenBase
{
	public BiomeDarkLand(int biomeID)
	{
		super(biomeID);
		spawnableCreatureList.clear();
		topBlock = TDEBlocks.dead_grass;
		fillerBlock = TDEBlocks.dark_dirt;
		waterColorMultiplier = 0x000000;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();

		theBiomeDecorator.cactiPerChunk = 0;
		theBiomeDecorator.deadBushPerChunk = 3;

		flowers.clear();
		addFlower(Blocks.red_flower, 4, 3);
		addFlower(Blocks.red_flower, 5, 3);
		addFlower(Blocks.red_flower, 6, 3);
		addFlower(Blocks.red_flower, 7, 3);
		addFlower(Blocks.red_flower, 0, 20);
		addFlower(Blocks.red_flower, 3, 20);
		addFlower(Blocks.red_flower, 8, 20);
		addFlower(Blocks.yellow_flower, 0, 30);
	}

	@Override
	public void decorate(World world, Random rand, int chunkX, int chunkZ)
	{
		super.decorate(world, rand, chunkX, chunkZ);

		if (rand.nextInt(1000) == 0)
		{
			int k = chunkX + rand.nextInt(16) + 8;
			int l = chunkZ + rand.nextInt(16) + 8;
			WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
			worldgendesertwells.generate(world, rand, k, world.getHeightValue(k, l) + 1, l);
		}
	}
}