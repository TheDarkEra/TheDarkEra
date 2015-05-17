package com.thedarkera.world.biome;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.biome.decorator.BiomeDecoratorTDE;

import com.thedarkera.world.biome.features.WorldGenDarkJungleTree;

import com.thedarkera.world.biome.features.WorldGenOriginalTree;
import com.thedarkera.world.biome.features.WorldGenDeadTree;


public class BiomeDarkJungle extends BiomeGenBase {

	private WorldGenAbstractTree WorldGenDeadTree;
	private BiomeDecoratorTDE customBiomeDecorator;


	public BiomeDarkJungle(int biomeID) {
		super(biomeID);
		this.setColor(0x000014);
		topBlock = TDEBlocks.dark_grass;
		fillerBlock = TDEBlocks.dark_dirt;
		this.theBiomeDecorator = new BiomeDecoratorTDE(this);
		this.customBiomeDecorator = (BiomeDecoratorTDE) theBiomeDecorator;
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		// this.spawnableCreatureList.add(new
		// SpawnListEntry(Entitychocolatechicken.class, 6, 6, 9));
		this.customBiomeDecorator.treesPerChunk = 25;
		this.customBiomeDecorator.grassPerChunk = 2;
		this.WorldGenDeadTree = new WorldGenDeadTree();

	}

	@Override
	// public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	// {
	// return (WorldGenerator)(par1Random.nextInt(5) == 0 ?
	// this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ?
	// this.WorldGenDeadTrees : this.worldGeneratorTrees));
	public WorldGenAbstractTree func_150567_a(Random p_150567_1_) {
		return (WorldGenAbstractTree) (p_150567_1_.nextInt(10) == 0 ? this.WorldGenDeadTree : this.worldGeneratorTrees);
	}

	// @Override
	// public WorldGenAbstractTree func_150567_a(Random p_150567_1_)
	// {
	// return (WorldGenAbstractTree)(p_150567_1_.nextInt(10) == 0 ? new
	// WorldGenDeadTrees : (p_150567_1_.nextInt(2) == 0 ? new WorldGenShrub(3,
	// 0) : (!this.field_150614_aC && p_150567_1_.nextInt(3) == 0 ? new
	// WorldGenMegaJungle(false, 10, 20, 3, 3) : new WorldGenTrees(false, 4 +
	// p_150567_1_.nextInt(7), 3, 3, true))));
	// }

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

//	@Override
//	public WorldGenerator getRandomWorldGenForTrees(Random par1Random) {
//		return (WorldGenerator) (par1Random.nextInt(5) == 0 ? this.WorldGenLakes : (par1Random.nextInt(10) == 0 ? this.WorldGenDeadTrees : this.WorldGenDeadTrees));
//	}

	/*
	 * ToDo:Need to add treesBushesDark Stone replace stoneand more decorative
	 * blocks.
	 * 
	 * NEED MORE BIOME BLOCKS
	 */
	public List getSpawnableList(EnumCreatureType p_76747_1_) {
		return p_76747_1_ == EnumCreatureType.monster ? this.spawnableMonsterList : (p_76747_1_ == EnumCreatureType.creature ? this.spawnableCreatureList : (p_76747_1_ == EnumCreatureType.waterCreature ? this.spawnableWaterCreatureList : (p_76747_1_ == EnumCreatureType.ambient ? this.spawnableCaveCreatureList : null)));
	}

	public void genTerrainBlocks(World world, Random rand, Block[] p_150560_3_, byte[] p_150560_4_, int p_150560_5_, int p_150560_6_, double p_150560_7_) {
		boolean flag = true;
		Block block = this.topBlock;
		byte b0 = (byte) (this.field_150604_aj & 255);
		Block block1 = this.fillerBlock;
		int k = -1;
		int l = (int) (p_150560_7_ / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int i1 = p_150560_5_ & 15;
		int j1 = p_150560_6_ & 15;
		int k1 = p_150560_3_.length / 256;

		for (int l1 = 255; l1 >= 0; --l1) {
			int i2 = (j1 * 16 + i1) * k1 + l1;

			if (l1 <= 0 + rand.nextInt(5)) {
				p_150560_3_[i2] = Blocks.bedrock;
			} else {
				Block block2 = p_150560_3_[i2];

				if (block2 != null && block2.getMaterial() != Material.air) {
					if (block2 == TDEBlocks.dark_stone) {
						if (k == -1) {
							if (l <= 0) {
								block = null;
								b0 = 0;
								block1 = TDEBlocks.dark_stone;
							} else if (l1 >= 59 && l1 <= 64) {
								block = this.topBlock;
								b0 = (byte) (this.field_150604_aj & 255);
								block1 = this.fillerBlock;
							}

							if (l1 < 63 && (block == null || block.getMaterial() == Material.air)) {
								if (this.getFloatTemperature(p_150560_5_, l1, p_150560_6_) < 0.15F) {
									block = Blocks.ice;
									b0 = 0;
								} else {
									block = Blocks.water;
									b0 = 0;
								}
							}

							k = l;

							if (l1 >= 62) {
								p_150560_3_[i2] = block;
								p_150560_4_[i2] = b0;
							} else if (l1 < 56 - l) {
								block = null;
								block1 = TDEBlocks.dark_stone;
								p_150560_3_[i2] = TDEBlocks.dark_gravel;
							} else {
								p_150560_3_[i2] = block1;
							}
						} else if (k > 0) {
							--k;
							p_150560_3_[i2] = block1;

							if (k == 0 && block1 == Blocks.sand) {
								k = rand.nextInt(4) + Math.max(0, l1 - 63);
								block1 = Blocks.sandstone;
							}
						}
					}
				} else {
					k = -1;
				}
			}
		}
	}

}
