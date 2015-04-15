package com.darkteam.thedarkera.handlers;

import java.util.Random;

import com.darkteam.thedarkera.blocks.ModBlocks;
import com.darkteam.thedarkera.generation.WorldGenSamDungeon;
import com.darkteam.thedarkera.generation.WorldGenSamPlant;
import com.darkteam.thedarkera.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.BlockEvent;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class WorldGenHandler implements IWorldGenerator 
{
	@SubscribeEvent
	public void addDrops(LivingDropsEvent event)
	{
		if(event.entity instanceof EntityZombie)
			if(event.entity.worldObj.rand.nextInt(10) == 0)
				event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(ModItems.samboots)));
			if(event.entity.worldObj.rand.nextInt(15) == 0)
				event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(ModItems.samhelmet)));
	}
	
	@SubscribeEvent
	public void addBlockDrops(BlockEvent.HarvestDropsEvent event)
	{
		if(event.block == Blocks.red_flower)
			event.drops.add(new ItemStack(ModItems.berry));
	}
	
	@SubscribeEvent
	public void printJump(LivingEvent.LivingJumpEvent event)
	{
		System.out.println("jump");
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
        {
               case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
               case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
               case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
	}
	
	private void generateEnd(World world, Random random, int x, int z)
    {
		addOreSpawn(ModBlocks.samStone, 0, Blocks.obsidian, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
    }
    
	private void generateSurface(World world, Random random, int x, int z)
    {
        addOreSpawn(ModBlocks.samStone, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
   
        for(int i = 0; i < 3; i++)
        {
        	int posX = x + random.nextInt(16);
        	int posY = 50 + random.nextInt(35);
        	int posZ = z + random.nextInt(16);
        	new WorldGenSamPlant().generate(world, random, posX, posY, posZ);
        }
        
        int posX = x + random.nextInt(16);
    	int posY = 10 + random.nextInt(40);
    	int posZ = z + random.nextInt(16);
    	new WorldGenSamDungeon().generate(world, random, posX, posY, posZ);
    }
	
    private void generateNether(World world, Random random, int x, int z)
    {
    	addOreSpawn(ModBlocks.samStone, 0, Blocks.netherrack, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
    }
    
    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     *
     * @param The Block to spawn
     * @param The metadata of the Block
     * @param The Block where to generate in
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for setting the maximum size of a vein
     * @param An int for the Number of chances available for the Block to spawn per-chunk
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/
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