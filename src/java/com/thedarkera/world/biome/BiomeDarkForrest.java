package com.thedarkera.world.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.thedarkera.biome.jodel.WorldGenDeadTrees;
import com.thedarkera.init.TDEBlocks;

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

//	@Override
//	public void decorate(World world, Random rand, int chunkX, int chunkZ) {
//		super.decorate(world, rand, chunkX, chunkZ);
//
//		if (rand.nextInt(1000) == 0) {
//			int k = chunkX + rand.nextInt(16) + 8;
//			int l = chunkZ + rand.nextInt(16) + 8;
//			WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
//			worldgendesertwells.generate(world, rand, k,
//					world.getHeightValue(k, l) + 1, l);
//		}
//	}
    public void decorate(World worldIn, Random p_180624_2_, int x, int y, int z)
    {
        int i;
        int j;
        int k;
        int l;

        if (this.field_150632_aF == 3)
        {
            for (i = 0; i < 4; ++i)
            {
                for (j = 0; j < 4; ++j)
                {
                    k = i * 4 + 1 + 8 + p_180624_2_.nextInt(3);
                    l = j * 4 + 1 + 8 + p_180624_2_.nextInt(3);
                    BlockPos blockpos1 = worldIn.getHorizon(p_180624_3_.add(k, 0, l));

                    if (p_180624_2_.nextInt(20) == 0)
                    {
                        WorldGenBigMushroom worldgenbigmushroom = new WorldGenBigMushroom();
                        worldgenbigmushroom.generate(worldIn, p_180624_2_, blockpos1);
                    }
                    else
                    {
                        WorldGenAbstractTree worldgenabstracttree = this.genBigTreeChance(p_180624_2_);
                        worldgenabstracttree.func_175904_e();

                        if (worldgenabstracttree.generate(worldIn, p_180624_2_, blockpos1))
                        {
                            worldgenabstracttree.func_180711_a(worldIn, p_180624_2_, blockpos1);
                        }
                    }
                }
            }
        }

        i = p_180624_2_.nextInt(5) - 3;

        j = 0;

        while (j < i)
        {
            k = p_180624_2_.nextInt(3);
            l = 0;

            while (true)
            {
                if (l < 5)
                {
                    int j1 = p_180624_2_.nextInt(16) + 8;
                    int k1 = p_180624_2_.nextInt(16) + 8;
                    int i1 = p_180624_2_.nextInt(worldIn.getHorizon(p_180624_3_.add(j1, 0, k1)).getY() + 32);

                    if (!DOUBLE_PLANT_GENERATOR.generate(worldIn, p_180624_2_, new BlockPos(p_180624_3_.getX() + j1, i1, p_180624_3_.getZ() + k1)))
                    {
                        ++l;
                        continue;
                    }
                }

                ++j;
                break;
            }
        }

        super.decorate(worldIn, p_180624_2_, p_180624_3_);
    }

	@Override
    public WorldGenAbstractTree func_150567_a(Random p_150567_1_)
    {
        return (WorldGenAbstractTree)(p_150567_1_.nextInt(5) > 0 ? field_150627_aC : this.worldGeneratorTrees);
    }
//	@Override
//	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
//	{
//		return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.WorldGenLakes : (par1Random.nextInt(10) == 0 ? this.WorldGenDeadTrees : this.WorldGenDeadTrees));
//	}
	/*
	 * ToDo:Need to add treesBushesDark Stone replace stoneand more decorative
	 * blocks.
	 * 
	 * NEED MORE BIOME BLOCKS
	 */

}
