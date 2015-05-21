package com.thedarkera.world.biome;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.biome.decorator.BiomeDecoratorTDE;
import com.thedarkera.world.biome.features.WorldGenDarkJungleTree;
import com.thedarkera.world.biome.features.WorldGenDeadTree;


public class BiomeDarkJungle extends BiomeGenBase {

//	private WorldGenAbstractTree WorldGenDeadTree;
//	private BiomeDecoratorTDE customBiomeDecorator;
//	
//	public BiomeDarkJungle(int biomeID) {
//		super(biomeID);
//		setColor(0x000014);
//		topBlock = TDEBlocks.dark_grass;
//		fillerBlock = TDEBlocks.dark_dirt;
//		theBiomeDecorator = new BiomeDecoratorTDE(this);
//		customBiomeDecorator = (BiomeDecoratorTDE) theBiomeDecorator;
//		spawnableCreatureList.clear();
//		spawnableWaterCreatureList.clear();
//		customBiomeDecorator.treesPerChunk = 25;
//		customBiomeDecorator.grassPerChunk = 2;
//		WorldGenDeadTree = new WorldGenDeadTree();
//
//	}
//
//	@Override
//	public WorldGenAbstractTree func_150567_a(Random random) {
//		return (WorldGenAbstractTree) (random.nextInt(10) == 0 ? this.WorldGenDeadTree : this.worldGeneratorTrees &&  this.WorldGenDeadTree : this.worldGeneratorTrees);
//	//	return (WorldGenAbstractTree)(random.nextInt(3) > 0 ? this.WorldGenDeadTree : super.func_150567_a(random));
//        return (WorldGenAbstractTree)((this.field_150644_aH == 1 || this.field_150644_aH == 2) && p_150567_1_.nextInt(3) == 0 ? (this.field_150644_aH != 2 && p_150567_1_.nextInt(13) != 0 ? field_150641_aE : field_150642_aF) : (p_150567_1_.nextInt(3) == 0 ? field_150639_aC : field_150640_aD));
	
	private static final WorldGenTaiga1 field_150639_aC = new WorldGenTaiga1();
	    private static final WorldGenTaiga2 field_150640_aD = new WorldGenTaiga2(false);
	    private static final WorldGenMegaPineTree field_150641_aE = new WorldGenMegaPineTree(false, false);
	    private static final WorldGenMegaPineTree field_150642_aF = new WorldGenMegaPineTree(false, true);
      //  private static WorldGenDeadTree WorldGenDeadTree = new WorldGenDeadTree();
    //    private static WorldGenDarkJungleTree WorldGenDarkJungleTree = new WorldGenDarkJungleTree(1);
	    private int field_150644_aH;
	    private static final String __OBFID = "CL_00000186";
	  //  protected WorldGenTrees worldGeneratorTrees;

	    public BiomeDarkJungle(int biomeID, int p_i45385_2_)
	    {
	        super(biomeID);
	        topBlock = TDEBlocks.dark_grass;
			fillerBlock = TDEBlocks.dark_dirt;
	        this.field_150644_aH = p_i45385_2_;
	        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityWolf.class, 8, 4, 4));
	        this.theBiomeDecorator.treesPerChunk = 10;
	       // WorldGenDeadTree = new WorldGenDeadTree();
	    //    WorldGenDarkJungleTree = new WorldGenDarkJungleTree(1);
	      //  this.worldGeneratorTrees = new WorldGenTrees(false);

	        if (p_i45385_2_ != 1 && p_i45385_2_ != 2)
	        {
	            this.theBiomeDecorator.grassPerChunk = 1;
	            this.theBiomeDecorator.mushroomsPerChunk = 1;
	        }
	        else
	        {
	            this.theBiomeDecorator.grassPerChunk = 7;
	            this.theBiomeDecorator.deadBushPerChunk = 1;
	            this.theBiomeDecorator.mushroomsPerChunk = 3;
	        }
	    }
	    @Override
	    public WorldGenAbstractTree func_150567_a(Random random)
	    {
	    	//return random.nextInt(3) == 0 ? new WorldGenDeadTree : this worldGeneratorTrees);
			return (WorldGenAbstractTree)//(random.nextInt(5) > 0 ? new WorldGenDeadTree(false)  && (random.nextInt(3) > 0 ? WorldGenDeadTree : this.worldGeneratorTrees));
			(random.nextInt(3) == 0 ? new WorldGenDeadTree() : new WorldGenDarkJungleTree(3));
	      //  return (WorldGenAbstractTree)((this.field_150644_aH == 1 || this.field_150644_aH == 2) && random.nextInt(3) == 0 ? (this.field_150644_aH != 2 && random.nextInt(13) != 0 ? field_150641_aE : field_150642_aF) : (random.nextInt(3) == 0 ? field_150639_aC : field_150640_aD));
	    }
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

