package com.thedarkera.world.biome;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.biome.decorator.BiomeDecoratorTDE;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.Random;

public class BiomeDarkHills extends BiomeGenBase{
	
	private BiomeDecoratorTDE customBiomeDecorator;

    public BiomeDarkHills(int BiomeID, int type)
    {
        super(BiomeID);
        setColor(0x000014);
        this.topBlock = TDEBlocks.dark_grass;
        this.fillerBlock = TDEBlocks.dark_dirt;
    	waterColorMultiplier = 0x000014;
        setTemperatureRainfall(0.2F, 0.3F);
    	
    	spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
    	
		theBiomeDecorator = new BiomeDecoratorTDE(this);
		customBiomeDecorator = (BiomeDecoratorTDE) theBiomeDecorator;
		
		customBiomeDecorator.treesPerChunk = 10;
		customBiomeDecorator.grassPerChunk = 6;

        switch (type){
            case 0:
            	setHeight(height_MidHills);
            	theBiomeDecorator.treesPerChunk = 50; break;
            case 1:
                setHeight(height_MidHills);
                theBiomeDecorator.treesPerChunk = 12;  
                //setHeight(new BiomeGenBase.Height(2.0F, 0.5F));
        }
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
