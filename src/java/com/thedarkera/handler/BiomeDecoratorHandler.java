package com.thedarkera.handler;

/*

import java.util.Random;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import org.apache.logging.log4j.core.net.Priority;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType;

public class BiomeDecoratorHandler {
	
	public int cactiPerChunk = 10;
	public int grassPerChunk = 1;
	public int treesPerChunk = 10;

	public WorldGenerator cactusGen;// = new DarkWorldGenCactus();
	
	public Random randomGenerator;
	
	public BiomeDecoratorHandler() {
		this.cactusGen = new DarkWorldGenCactus();
		this.randomGenerator = new Random();
	}
	
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onWorldDecoration(DecorateBiomeEvent.Decorate event){
		BiomeGenBase biome = event.world.getWorldChunkManager().func_180300_a(new BlockPos(event.pos.getX(), 0, event.pos.getZ()), ModBiomes.darkOcean);
		if(event.getResult() == Result.ALLOW || event.getResult() == Result.DEFAULT){
			if(event.type == EventType.GRASS){
				genGrass(event.world, event.pos.getX(), event.pos.getZ(), randomGenerator);
			}
			else if(event.type == EventType.CACTUS && biome.isEqualTo(ModBiomes.darkDesert)) {
				genCacti(event.world, event.pos.getX(), event.pos.getZ(), randomGenerator);
			}
			else if(event.type == EventType.TREE){
				genTrees(event.world, event.pos.getX(), event.pos.getZ(), randomGenerator, biome);
			}
		}
	}
	
	protected void genCacti(World world, int chunkX, int chunkZ, Random rand){
		for (int j = 0; j < this.cactiPerChunk; ++j)
        {
            int k = chunkX + rand.nextInt(16) + 8;
            int l = chunkZ + rand.nextInt(16) + 8;
            int i = nextInt(world.getHorizon(new BlockPos(k, 0 ,l)).getY() * 2);
            LogHelper.info(i);
            this.cactusGen.generate(world, randomGenerator, new BlockPos(k, i, l));
        }
	}

	protected void genGrass(World world, int chunkX, int chunkZ, Random rand){
		for (int j = 0; j < this.grassPerChunk; ++j)
		{
			int k = chunkX + rand.nextInt(16) + 8;
			int l = chunkZ + rand.nextInt(16) + 8;
            int i = nextInt(world.getHorizon(new BlockPos(k, 0 ,l)).getY() * 2);
			(new DarkWorldGenTallGrass()).generate(world, randomGenerator, new BlockPos(k, i, l));
		}
	}

	protected void genTrees(World world, int chunkX, int chunkZ, Random rand, BiomeGenBase biome){
		for (int j = 0; j < this.treesPerChunk; ++j){
			int k = chunkX + rand.nextInt(16) + 8;
			int l = chunkZ + rand.nextInt(16) + 8;
            int i = nextInt(world.getHorizon(new BlockPos(k, 0 ,l)).getY() * 2);
			WorldGenAbstractTree darkworldgenabstracttree = biome.genBigTreeChance(this.randomGenerator);
			darkworldgenabstracttree.func_175904_e();

			if(darkworldgenabstracttree.generate(world, this.randomGenerator, new BlockPos(k, i, l))){
				darkworldgenabstracttree.func_180711_a(world, this.randomGenerator, new BlockPos(k, i, l));
			}
		}
	}
	
	private int nextInt(int i) {
		Random rand = new Random();
        if (i <= 1)
            return 0;
        return rand.nextInt(i);
	}

}
	*/

