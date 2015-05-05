package com.thedarkera.biome;

import java.util.List;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

public class BiomeDarkForrest extends BiomeGenBase{

	private List DarkMonsters;
	
	public BiomeDarkForrest(int biomeID) {
		super(biomeID);
		topBlock = Blocks.grass;
		fillerBlock = Blocks.dirt;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
//		spawnableMonsterList.addAll(DarkMonsters);
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
	
	/*Need to add trees
	 *Bushes
	 *and more decorative blocks. 
	 */

}
