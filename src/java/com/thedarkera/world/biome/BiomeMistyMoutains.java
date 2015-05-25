package com.thedarkera.world.biome;

import java.util.Random;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeMistyMoutains extends BiomeGenBase
{
    private WorldGenerator theWorldGenerator;
    private int field_150635_aE;
    private int field_150636_aF;
    private int field_150637_aG;
    private int field_150638_aH;
    private static final String __OBFID = "CL_00000168";

    public BiomeMistyMoutains(int BiomeID, boolean type)
    {
        super(BiomeID);
        this.theWorldGenerator = new WorldGenMinable(Blocks.monster_egg, 8);
        this.field_150635_aE = 0;
        this.field_150636_aF = 1;
        this.field_150637_aG = 2;
        this.field_150638_aH = this.field_150635_aE;
        
    }

    public void decorate(World world, Random random, int x, int y)
    {
        super.decorate(world, random, x, y);
        int k = 3 + random.nextInt(6);
        int l;
        int i1;
        int j1;

        for (l = 0; l < k; ++l)
        {
            i1 = x + random.nextInt(16);
            j1 = random.nextInt(28) + 4;
            int k1 = y + random.nextInt(16);

            if (world.getBlock(i1, j1, k1).isReplaceableOreGen(world, i1, j1, k1, TDEBlocks.dark_stone))
            {
            	world.setBlock(i1, j1, k1, TDEBlocks.dark_emerald_ore, 0, 2);
            }
        }

        for (k = 0; k < 7; ++k)
        {
            l = x + random.nextInt(16);
            i1 = random.nextInt(64);
            j1 = y + random.nextInt(16);
            this.theWorldGenerator.generate(world, random, l, i1, j1);
        }
    }

    public void genTerrainBlocks(World world, Random random, Block[] p_150573_3_, byte[] p_150573_4_, int x, int y, double p_150573_7_)
    {
        this.topBlock = TDEBlocks.dark_grass;
        this.field_150604_aj = 0;
        this.fillerBlock = TDEBlocks.dark_dirt;

        if ((p_150573_7_ < -1.0D || p_150573_7_ > 2.0D) && this.field_150638_aH == this.field_150637_aG)
        {
            this.topBlock = TDEBlocks.dark_gravel;
            this.fillerBlock = TDEBlocks.dark_gravel;
        }
        else if (p_150573_7_ > 1.0D && this.field_150638_aH != this.field_150636_aF)
        {
            this.topBlock = TDEBlocks.dark_stone;
            this.fillerBlock = TDEBlocks.dark_stone;
        }

        this.genBiomeTerrain(world, random, p_150573_3_, p_150573_4_, x, y, p_150573_7_);
    }
          
       
	    
    }
