package com.thedarkera.biome;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

import com.thedarkera.init.TDEBlocks;

public class BiomeDarkForrest extends BiomeGenBase{

	Block stoneBlock = TDEBlocks.dark_stone;
	
	public BiomeDarkForrest(int biomeID) {
		super(biomeID);
		topBlock = TDEBlocks.dark_grass;
		fillerBlock = TDEBlocks.dark_dirt;
		waterColorMultiplier = 0xE42D17;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		flowers.clear();
		addDefaultFlowers();
		theBiomeDecorator.deadBushPerChunk = 5;
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
	
	/*ToDo: 
	 *Need to add trees
	 *Bushes
	 *Dark Stone replace stone
	 *and more decorative blocks. 
	 *
	 *NEED MORE BIOME BLOCKS
	 */

}
