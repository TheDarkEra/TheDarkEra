package com.thedarkera.handler;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.thedarkera.TheDarkEra;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandlerTheDarkEra implements IWorldGenerator {

	public final int DWID = TheDarkEra.dimension;

	public WorldGenHandlerTheDarkEra() {}
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
		
		chunkX *= 16;
		chunkZ *= 16;
		
		//if(world.provider.getDimensionId() == DWID){
		/*	genStandardOre1(world, ModBlocks.darkDirt, 20, 32, chunkX, 0, 256, chunkZ, rand);
			genStandardOre1(world, ModBlocks.darkGravel, 10, 32, chunkX, 0, 256, chunkZ, rand);
			
			genStandardOre1(world, ModBlocks.darkCoalOre, 20, 16, chunkX, 0, 128, chunkZ, rand);
			genStandardOre1(world, ModBlocks.darkIronOre, 20, 8, chunkX, 0, 64, chunkZ, rand);
			genStandardOre1(world, ModBlocks.darkGoldOre, 2, 8, chunkX, 0, 32, chunkZ, rand);
			genStandardOre1(world, ModBlocks.darkRedstoneOre, 8, 7, chunkX, 0, 16, chunkZ, rand);
			genStandardOre1(world, ModBlocks.darkDiamondOre, 1, 7, chunkX, 0, 16, chunkZ, rand);
			genStandardOre2(world, ModBlocks.darkLapisOre, 1, 6, chunkX, 16, 16, chunkZ, rand);
		*/
		}
		
		
	//}
	
	protected void genStandardOre1(World world, Block block,int veins, int BPV, int chunkX, int chunkYSpecial, int chunkY, int chunkZ, Random rand)
    {
        for (int l = 0; l < veins; ++l)
        {
            int x = chunkX + rand.nextInt(16);
            int y = rand.nextInt(chunkY - chunkYSpecial) + chunkYSpecial;
            int z = chunkZ + rand.nextInt(16);
           
          //  (new WorldGenMinable(block.getDefaultState(), BPV, BlockHelper.forBlock(ModBlocks.darkStone))).generate(world, rand, new BlockPos(x,y,z));
        }
    }
	
	protected void genStandardOre2(World world, Block block,int veins, int BPV, int chunkX, int chunkYSpecial, int chunkY, int chunkZ, Random rand)
    {
        for (int l = 0; l < veins; ++l)
        {
            int x = chunkX + rand.nextInt(16);
            int y = rand.nextInt(chunkY) + rand.nextInt(chunkY) + (chunkYSpecial - chunkY);
            int z = chunkZ + rand.nextInt(16);
           
        //    (new WorldGenMinable(block.getDefaultState(), BPV, BlockHelper.forBlock(ModBlocks.darkStone))).generate(world, rand, new BlockPos(x,y,z));
        }
    }

}

