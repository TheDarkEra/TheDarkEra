package com.thedarkera.world.biome.features;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.thedarkera.init.TDEBlocks;

public class WorldGenDeadTree extends WorldGenAbstractTree {
	//
	// private final int minTreeHeight;
	// private final int randomTreeHight;
	//
	// private final boolean vinesGrow;
	//
	// private final Block wood;
	// private final Block leaves;
	//
	// private final int metaWood;
	// private final int metaLeaves;
	//
	// public WorldGenDeadTree(Block wood, Block leaves, int metaWood, int
	// metaLeaves) {
	// this(wood, leaves, metaWood, metaLeaves, false, 4, 3, false);
	// }
	//
	// public WorldGenDeadTree(Block wood, Block leaves, int metaWood, int
	// metaLeaves, boolean doBlockNotify, int minTreeHight, int randomTreeHight,
	// boolean vinesGrow) {
	// super(doBlockNotify);
	// this.wood = wood;
	// this.leaves = leaves;
	//
	// this.minTreeHeight = minTreeHight;
	// this.randomTreeHight = randomTreeHight;
	// this.metaWood = metaWood;
	// this.metaLeaves = metaLeaves;
	// this.vinesGrow = vinesGrow;

	public WorldGenDeadTree() {
		super(false);
	}

	public boolean generate(World world, Random rand, int x, int y, int z) {
		while (world.isAirBlock(x, y, z) && y > 2) {
			y--;
		}
		Block block = world.getBlock(x, y, z);
		if (block != Blocks.grass && block != Blocks.dirt && block != TDEBlocks.dark_dirt && block != TDEBlocks.dark_grass) {
			return false;
		} else {
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if (world.isAirBlock(x + i, y - 1, z + j) && world.isAirBlock(x + i, y - 2, z + j) && !world.isAirBlock(x + i, y, z + j)) {
						return false;
					}
				}
			}
			int baseLength = 1 + rand.nextInt(2);
			int branches = 2 + rand.nextInt(4);

			int h = 1;

			block.onPlantGrow(world, x, y - 1, z, x, y, z);

			for (int i = 0; i < baseLength; i++) {
				buildBlock(world, x, y + h, z, TDEBlocks.blockLog1, 0);
				h++;
			}
			int c = 1;
			for (int i = 0; i < branches; i++) {
				generateBranch(world, rand, x, y + h, z, c);
				c++;
				h += 2;
			}
			return true;
		}

	}

	public void generateBranch(World world, Random rand, int x, int y, int z, int p) {
		for (int i = 0; i < 3 + rand.nextInt(5); i++) {
			int r = 1 + rand.nextInt(14);
			buildBlock(world, x, y, z, TDEBlocks.blockLog1, 0);
			buildBlock(world, x, y + 1, z, TDEBlocks.blockLog1, 0);
			if (r == 1) {
				createBranch(world, x + 1, y, z, TDEBlocks.blockLog1, 12, "E");
			} else if (r == 2) {
				createBranch(world, x - 1, y, z, TDEBlocks.blockLog1, 12, "W");
			} else if (r == 3) {
				createBranch(world, x, y, z + 1, TDEBlocks.blockLog1, 12, "S");
			} else if (r == 4) {
				createBranch(world, x, y, z - 1, TDEBlocks.blockLog1, 12, "N");
			} else if (r == 5) {
				createBranch(world, x + 1, y + 1, z, TDEBlocks.blockLog1, 12, "E");
			} else if (r == 6) {
				createBranch(world, x - 1, y + 1, z, TDEBlocks.blockLog1, 12, "W");
			} else if (r == 7) {
				createBranch(world, x, y + 1, z + 1, TDEBlocks.blockLog1, 12, "S");
			} else if (r == 8) {
				createBranch(world, x, y + 1, z - 1, TDEBlocks.blockLog1, 12, "N");
			}
		}
		buildBlock(world, x, y, z, TDEBlocks.blockLog1, 0);
		buildBlock(world, x, y + 1, z, TDEBlocks.blockLog1, 0);
	}

	public void buildBlock(World world, int x, int y, int z, Block block, int meta) {
		if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isLeaves(world, x, y, z)) {
			world.setBlock(x, y, z, block, meta, 2);
		}

	}

	// N = z-
	// E = x+
	// S = z+
	// W = x-
	
	public void createBranch(World world, int x, int y, int z, Block block, int meta, String direction) {
		Random rand = new Random();
		int r = 1	 + rand.nextInt(5);
		int j = -1 + rand.nextInt(2);
		if (direction == "E") {
			for (int i = 1; i < r; i++) {
				if (world.isAirBlock(x, y - 1, z) == true && world.isAirBlock(x, y - 2, z) == true) {
					if (j != 0) {
						buildBlock(world, x, y, z, block, meta);
						buildBlock(world, x + 1, y, z, block, meta);
					} else {
						buildBlock(world, x, y, z, block, meta);
					}
					buildBlock(world, x + i, y + 1, z + j, block, meta);
				}
//				buildBlock(world, x + r, y, z + j, block, meta);
			}
		} else if (direction == "W") {
			if (world.isAirBlock(x, y - 1, z) == true && world.isAirBlock(x, y - 2, z) == true) {
				for (int i = 1; i < r; i++) {
					if (j != 0) {
						buildBlock(world, x, y, z, block, meta);
						buildBlock(world, x - 1, y, z, block, meta);
					} else {
						buildBlock(world, x, y, z, block, meta);
					}
					buildBlock(world, x - i, y + 1, z + j, block, meta);
				}
//				buildBlock(world, x - r, y, z + j, block, meta);
			}
		} else if (direction == "S") {
			if (world.isAirBlock(x, y - 1, z) == true && world.isAirBlock(x, y - 2, z) == true) {
				for (int i = 1; i < r; i++) {
					if (j != 0) {
						buildBlock(world, x, y, z, block, meta);
						buildBlock(world, x, y, z + 1, block, meta);
					} else {
						buildBlock(world, x, y, z, block, meta);
					}
					buildBlock(world, x + j, y + 1, z + i, block, meta);
				}
//				buildBlock(world, x + j, y, z + r, block, meta);
			}
		} else if (direction == "N") {
			if (world.isAirBlock(x, y - 1, z) == true && world.isAirBlock(x, y - 2, z) == true) {
			}
			for (int i = 1; i < r; i++) {
				if (j != 0) {
					buildBlock(world, x, y, z, block, meta);
					buildBlock(world, x, y, z - 1, block, meta);
				} else {
					buildBlock(world, x, y, z, block, meta);
				}
				buildBlock(world, x + j, y + 1, z - i, block, meta);
			}
//			buildBlock(world, x + j, y, z - r, block, meta);
		}
	}

}