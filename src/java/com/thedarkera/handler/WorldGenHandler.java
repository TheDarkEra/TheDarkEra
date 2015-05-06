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
import com.thedarkera.world.gen.WorldGenDarkBirchTree;
import com.thedarkera.world.gen.WorldGenGrapePlant;
import com.thedarkera.world.gen.WorldGenWispTree;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class WorldGenHandler implements IWorldGenerator 
{
	@SubscribeEvent
	public void addBlockDrops(BlockEvent.HarvestDropsEvent event)
	{
		if(event.block == Blocks.red_flower)
			event.drops.add(new ItemStack(TDEItems.grape));
	}
	@SubscribeEvent
	public void printJump(LivingEvent.LivingJumpEvent event)
	{
		System.out.println("jump");
	}

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {}

	private void generateSurface(World world, Random random, int x, int z)
	{
		addOreSpawn(TDEBlocks.ebony_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
		addOreSpawn(TDEBlocks.steel_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
		addOreSpawn(TDEBlocks.orichalcum_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
		addOreSpawn(TDEBlocks.ancientpickaxe_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
		addOreSpawn(TDEBlocks.ancientaxe_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60); //TODO: needs adjusting
		addOreSpawn(TDEBlocks.ancientshovel_ore, 0, Blocks.sand, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60); //TODO: needs adjusting
		addOreSpawn(TDEBlocks.ancienthoe_ore, 0, Blocks.dirt, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60); //TODO: needs adjusting

		for(int i = 0; i < 3; i++)
		{
			int posX = x + random.nextInt(16);
			int posY = 50 + random.nextInt(35);
			int posZ = z + random.nextInt(16);
			new WorldGenGrapePlant().generate(world, random, posX, posY, posZ);
		}

		for(int i = 0; i < 3; i++)
		{
			int posX = x + random.nextInt(16);
			int posY = 50 + random.nextInt(35);
			int posZ = z + random.nextInt(16);
			new WorldGenDarkBirchTree().generate(world, random, posX, posY, posZ);
		}
		for(int i = 0; i < 3; i++)
		{
			int posX = x + random.nextInt(16);
			int posY = 50 + random.nextInt(35);
			int posZ = z + random.nextInt(16);
			new WorldGenWispTree().generate(world, random, posX, posY, posZ);
		}
	}

	private void generateNether(World world, Random random, int x, int z) {}

	@SuppressWarnings("unused")
	public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for(int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
	}
}