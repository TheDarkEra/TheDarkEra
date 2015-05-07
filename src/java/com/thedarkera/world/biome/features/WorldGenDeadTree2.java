package com.thedarkera.world.biome.features;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.thedarkera.init.TDEBlocks;

public class WorldGenDeadTree2 extends WorldGenAbstractTree {
//
//	private final int minTreeHeight;
//	private final int randomTreeHight;
//
//	private final boolean vinesGrow;
//
//	private final Block wood;
//	private final Block leaves;
//
//	private final int metaWood;
//	private final int metaLeaves;
//
//	public WorldGenDeadTree(Block wood, Block leaves, int metaWood, int metaLeaves) {
//		this(wood, leaves, metaWood, metaLeaves, false, 4, 3, false);
//	}
//
//	public WorldGenDeadTree(Block wood, Block leaves, int metaWood, int metaLeaves, boolean doBlockNotify, int minTreeHight, int randomTreeHight, boolean vinesGrow) {
//		super(doBlockNotify);
//		this.wood = wood;
//		this.leaves = leaves;
//
//		this.minTreeHeight = minTreeHight;
//		this.randomTreeHight = randomTreeHight;
//		this.metaWood = metaWood;
//		this.metaLeaves = metaLeaves;
//		this.vinesGrow = vinesGrow;
	public WorldGenDeadTree2() {
	super(false);	
}

	public boolean generate(World world, Random rand, int x, int y, int z) {
		while (world.isAirBlock(x, y, z) && y > 2) {
			y--;
		}
		Block block = world.getBlock(x, y, z);
		if (block != Blocks.grass && block != Blocks.dirt) {
			return false;
		} else {
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if (world.isAirBlock(x + i, y - 1, z + j) && world.isAirBlock(x + i, y - 2, z + j) && !world.isAirBlock(x + i, y, z + j)) {
						return false;
					}
				}
			}
			int baseLength = 4 + rand.nextInt(6);
			int branches = 2 + rand.nextInt(4);

			int h = 1;

			block.onPlantGrow(world, x, y - 1, z, x, y, z);

			for (int i = 0; i < baseLength; i++) {
				buildBlock(world, x, y + h, z, TDEBlocks.blockLog1, 0);
				h++;
			}
			int c = 1;
			for (int i = 0; i < branches; i++){
				generateBranch(world, rand, x, y+h, z, c);
				c++;
				h+=2;
			}
			generateTop(world, x, y+h, z);
			return true;
		}

	}

	public void generateTop(World world, int x, int y, int z) {
		for (int i = -1; i < 2; i++){
			for (int j = -1; j < 2; j++){
				buildBlock(world, x + i, y, z + j, TDEBlocks.block_leaves, 1);
				
			}
		}
		buildBlock(world, x, y, z, TDEBlocks.blockLog1, 0);
		buildBlock(world, x+1, y+1, z, TDEBlocks.block_leaves, 1);
		buildBlock(world, x-1, y+1, z, TDEBlocks.block_leaves, 1);
		buildBlock(world, x, y+1, z-1, TDEBlocks.block_leaves, 1);
		buildBlock(world, x, y+1, z+1, TDEBlocks.block_leaves, 1);
		buildBlock(world, x, y+2, z, TDEBlocks.block_leaves, 1);
	}

	public void generateBranch(World world, Random rand, int x, int y, int z, int p) {
		for (int i = -1; i < 2; i++){
			for (int j = -1; j < 2; j++){
				buildBlock(world, x + i, y, z + j, TDEBlocks.block_leaves, 1);
			}
		}
		buildBlock(world, x+1, y+1, z, TDEBlocks.block_leaves, 1);
		buildBlock(world, x-1, y+1, z, TDEBlocks.block_leaves, 1);
		buildBlock(world, x, y+1, z-1, TDEBlocks.block_leaves, 1);
		buildBlock(world, x, y+1, z+1, TDEBlocks.block_leaves, 1);
	}

	public void buildBlock(World world, int x, int y, int z, Block block, int meta) {
		if(world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isLeaves(world, x, y, z)){
			world.setBlock(x, y, z, block, meta, 2);
		}
	}
}