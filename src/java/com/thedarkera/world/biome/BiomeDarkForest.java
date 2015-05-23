package com.thedarkera.world.biome;

import com.thedarkera.init.TDEBiomes;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.biome.decorator.BiomeDecoratorTDE;
import com.thedarkera.world.biome.features.WorldGenDarkJungleTree;
import com.thedarkera.world.biome.features.WorldGenDeadTree;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.*;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenMutated;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.List;
import java.util.Random;

public class BiomeDarkForest extends BiomeGenBase {
	
    private int field_150632_aF;
    protected static final WorldGenDeadTree dead_tree = new WorldGenDeadTree();
    protected static final WorldGenDarkJungleTree dark_jungle_tree = new WorldGenDarkJungleTree(8);
    private BiomeDecoratorTDE customBiomeDecorator;

	public BiomeDarkForest(int biomeID, int type) 
	{
		super(biomeID);

		setColor(0x000014);
		topBlock = TDEBlocks.dark_grass;
		fillerBlock = TDEBlocks.dark_dirt;
		waterColorMultiplier = 0x000014;
		
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySheep.class, 12, 4, 4));
        spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityPig.class, 10, 4, 4));
        spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityChicken.class, 10, 4, 4));
        spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCow.class, 8, 4, 4));
        spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityBat.class, 10, 8, 8));
		
		theBiomeDecorator = new BiomeDecoratorTDE(this);
		customBiomeDecorator = (BiomeDecoratorTDE) theBiomeDecorator;
		
		customBiomeDecorator.treesPerChunk = 10;
		customBiomeDecorator.grassPerChunk = 6;
		customBiomeDecorator.deadBushPerChunk = 5;

        switch(type){
            case 0:
                theBiomeDecorator.treesPerChunk = 50; break;
            case 1:
                theBiomeDecorator.treesPerChunk = 12; break;
            case 2:
                theBiomeDecorator.treesPerChunk = 50;
                setHeight(height_LowPlains);
                spawnableCreatureList.clear(); break;
        }
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random random) {
		    {
		        return (WorldGenAbstractTree)(this.field_150632_aF == 1 && random.nextInt(3) > 0 ? dark_jungle_tree : (this.field_150632_aF != 2 && random.nextInt(5) != 0 ? this.worldGeneratorTrees : dead_tree));
		    }
	}

	public List getSpawnableList(EnumCreatureType p_76747_1_)
	    {
	        return p_76747_1_ == EnumCreatureType.monster ? this.spawnableMonsterList : (p_76747_1_ == EnumCreatureType.creature ? this.spawnableCreatureList : (p_76747_1_ == EnumCreatureType.waterCreature ? this.spawnableWaterCreatureList : (p_76747_1_ == EnumCreatureType.ambient ? this.spawnableCaveCreatureList : null)));
	    }
	
    public void genTerrainBlocks(World world, Random rand, Block[] p_150560_3_, byte[] p_150560_4_, int p_150560_5_, int p_150560_6_, double p_150560_7_)
    {
        boolean flag = true;
        Block block = this.topBlock;
        byte b0 = (byte)(this.field_150604_aj & 255);
        Block block1 = this.fillerBlock;
        int k = -1;
        int l = (int)(p_150560_7_ / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
        int i1 = p_150560_5_ & 15;
        int j1 = p_150560_6_ & 15;
        int k1 = p_150560_3_.length / 256;

        for (int l1 = 255; l1 >= 0; --l1)
        {
            int i2 = (j1 * 16 + i1) * k1 + l1;

            if (l1 <= 0 + rand.nextInt(5))
            {
                p_150560_3_[i2] = Blocks.bedrock;
            }
            else
            {
                Block block2 = p_150560_3_[i2];

                if (block2 != null && block2.getMaterial() != Material.air)
                {
                    if (block2 == TDEBlocks.dark_stone)
                    {
                        if (k == -1)
                        {
                            if (l <= 0)
                            {
                                block = null;
                                b0 = 0;
                                block1 = TDEBlocks.dark_stone;
                            }
                            else if (l1 >= 59 && l1 <= 64)
                            {
                                block = this.topBlock;
                                b0 = (byte)(this.field_150604_aj & 255);
                                block1 = this.fillerBlock;
                            }

                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
                            {
                                if (this.getFloatTemperature(p_150560_5_, l1, p_150560_6_) < 0.15F)
                                {
                                    block = Blocks.ice;
                                    b0 = 0;
                                }
                                else
                                {
                                    block = Blocks.water;
                                    b0 = 0;
                                }
                            }

                            k = l;

                            if (l1 >= 62)
                            {
                                p_150560_3_[i2] = block;
                                p_150560_4_[i2] = b0;
                            }
                            else if (l1 < 56 - l)
                            {
                                block = null;
                                block1 = TDEBlocks.dark_stone;
                                p_150560_3_[i2] = TDEBlocks.dark_gravel;
                            }
                            else
                            {
                                p_150560_3_[i2] = block1;
                            }
                        }
                        else if (k > 0)
                        {
                            --k;
                            p_150560_3_[i2] = block1;

                            if (k == 0 && block1 == Blocks.sand)
                            {
                                k = rand.nextInt(4) + Math.max(0, l1 - 63);
                                block1 = Blocks.sandstone;
                            }
                        }
                    }
                }
                else
                {
                    k = -1;
                }
            }
        }
    }   
}


