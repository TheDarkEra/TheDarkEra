package com.thedarkera.handler;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.BlockEvent;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEItems;
import com.thedarkera.world.gen.WorldGenGrapePlant;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class WorldGenHandler implements IWorldGenerator {
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
		case -10:
			generateTheDarkDimension(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {
	}

	private void generateSurface(World world, Random random, int x, int z) {
		addOreSpawn(TDEBlocks.ancient_ore, 0, Blocks.stone, world,
				random, x, z, 16, 16, 8, 20, 0, 64);
        addOreSpawn(TDEBlocks.dragon_bone_ore, 0, Blocks.stone, world,
                random, x, z, 16, 16, 4, 10, 0, 32);




	//	for (int i = 0; i < 3; i++) {
	//		int posX = x + random.nextInt(16);
	//		int posY = 50 + random.nextInt(35);
	//		int posZ = z + random.nextInt(16);
	//		new WorldGenGrapePlant().generate(world, random, posX, posY, posZ);
	//	}

	/*	for (int i = 0; i < 3; i++) {
			int posX = x + random.nextInt(16);
			int posY = 50 + random.nextInt(35);
			int posZ = z + random.nextInt(16);
			new WorldGenDarkBirchTree().generate(world, random, posX, posY,
					posZ);
		}
		for (int i = 0; i < 3; i++) {
			int posX = x + random.nextInt(16);
			int posY = 50 + random.nextInt(35);
			int posZ = z + random.nextInt(16);
			new WorldGenWispTree().generate(world, random, posX, posY, posZ);
		}	*/
	}

	private void generateNether(World world, Random random, int x, int z) {
	}
	
	private void generateTheDarkDimension(World world, Random random, int x, int z)
	 {
		addOreSpawn(TDEBlocks.ebony_ore, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 3 + random.nextInt(3), 5, 20, 30);
		addOreSpawn(TDEBlocks.orichalcum_ore, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 4 + random.nextInt(2), 5, 20, 30);
		addOreSpawn(TDEBlocks.dark_diamond_ore, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 7, 1, 0, 16);
		addOreSpawn(TDEBlocks.dark_coal_ore, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 16, 20, 0, 128);
		addOreSpawn(TDEBlocks.dark_iron_ore, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 8, 10, 0, 64);
		addOreSpawn(TDEBlocks.dark_gold_ore, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 8, 2, 0, 32);
		addOreSpawn(TDEBlocks.dark_emerald_ore, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 7, 1, 0, 32);
		addOreSpawn(TDEBlocks.dark_gravel, 0, TDEBlocks.dark_stone, world, random, x, z,
				16, 16, 32, 10, 0, 256);
        addOreSpawn(TDEBlocks.dark_dirt, 0, TDEBlocks.dark_stone, world, random, x, z,
                16, 16, 32, 20, 0, 256);
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