package com.thedarkera.handler;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.BlockEvent;

import com.thedarkera.init.TDEBiomes;
import com.thedarkera.init.TDEItems;
import com.thedarkera.world.biome.features.WorldGenDeadTree;
import com.thedarkera.world.gen.WorldGenGrapePlant;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class WorldGenTreeHandler implements IWorldGenerator {
	@SubscribeEvent
	public void addBlockDrops(BlockEvent.HarvestDropsEvent event) {
		if (event.block == Blocks.red_flower)
			event.drops.add(new ItemStack(TDEItems.grape));
	}

	@SubscribeEvent
	public void printJump(LivingEvent.LivingJumpEvent event) {
		System.out.println("jump");
	}

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		case 2:
			generateTheDarkDimension(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {
	

	}
	private void generateSurface(World world, Random random, int x, int z) {
	
		
	}
	private void generateNether(World world, Random random, int x, int z) {
	
		
	}
	private void generateTheDarkDimension(World world, Random random, int x, int z) {
		
		BiomeGenBase biomeGenBase = world.getWorldChunkManager().getBiomeGenAt(x + 16, z + 16);
		
		if (biomeGenBase == TDEBiomes.dark_land)
		for (int i = 0; i < 10; i++){
             int Xcoord1 = x + random.nextInt(16); //where in chuck it generates
             int Ycoord1 = random.nextInt(100); //how high it generates
             int Zcoord1 = z + random.nextInt(16); //where in chunk it generates
             	new WorldGenDeadTree().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		
	//	if (biomeGenBase == TDEBiomes.dark_hills)
	//		for (int i = 0; i < 40; i++) {
	//			int posX = x + random.nextInt(16);
	//			int posY = 50 + random.nextInt(35);
	//			int posZ = z + random.nextInt(16);
	//			new WorldGenDeadTree().generate(world, random, posX, posY, posZ);
	//		}

		}


	@SuppressWarnings("unused")
	public void addOreSpawn(Block block, int metadata, Block target,
			World world, Random random, int blockXPos, int blockZPos, int maxX,
			int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, metadata, maxVeinSize, target))
					.generate(world, random, posX, posY, posZ);
		}
	}
}