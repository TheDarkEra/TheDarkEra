package com.thedarkera.ingameobjects.block;

import com.google.common.collect.Maps;
import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.IdentityHashMap;
import java.util.Map;

import static net.minecraftforge.common.util.ForgeDirection.*;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;

public class BlockDarkFire extends BlockFire {

	@Deprecated
	private int[] field_149849_a = new int[4096];
	@Deprecated
	private int[] field_149848_b = new int[4096];

	public BlockDarkFire() {
		super();
		this.setBlockName("dark_fire");
		this.setBlockTextureName(TheDarkEra.MODID + ":" + "dark_fire");
		this.setHardness(0.0F);
		this.setLightLevel(1.0F);
		this.setStepSound(soundTypeWood);
		this.disableStats();
	}

	// we might need this later!
	public static void func_149843_e() {
        ((BlockFire) TDEBlocks.dark_fire).setFireInfo(TDEBlocks.blockLog1, 5, 20);
	}

	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		entity.setFire(10);
	}

	public void onBlockAdded(World world, int x, int y, int z) {
		if (!(world.provider.dimensionId == 0 || world.provider.dimensionId == TheDarkEra.dimension) || !TDEBlocks.dark_portal.func_150000_e(world, x, y, z)) {
			if (!world.doesBlockHaveSolidTopSurface(world, x, y - 1, z) && !this.canNeighborBurn(world, x, y, z)) {
				world.setBlockToAir(x, y, z);
			} else {
				world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world) + world.rand.nextInt(10));
			}
		}
	}

	/**
	 * Returns true if at least one block next to this one can burn.
	 */
	private boolean canNeighborBurn(World world, int x, int y, int z) {
		return this.canCatchFire(world, x + 1, y, z, WEST) || this.canCatchFire(world, x - 1, y, z, EAST) || this.canCatchFire(world, x, y - 1, z, UP) || this.canCatchFire(world, x, y + 1, z, DOWN) || this.canCatchFire(world, x, y, z - 1, SOUTH) || this.canCatchFire(world, x, y, z + 1, NORTH);
	}

	/*
	 * ================================= Forge Start
	 * ======================================
	 */
/*	private static class FireInfo {
		private int encouragement = 0;
		private int flammibility = 0;
	}

	private IdentityHashMap<Block, FireInfo> blockInfo = Maps.newIdentityHashMap();

	public void setFireInfo(Block block, int encouragement, int flammibility) {
		if (block == Blocks.air)
			throw new IllegalArgumentException("Tried to set air on fire... This is bad.");
		int id = Block.getIdFromBlock(block);
		this.field_149849_a[id] = encouragement;
		this.field_149848_b[id] = flammibility;

		FireInfo info = getInfo(block, true);
		info.encouragement = encouragement;
		info.flammibility = flammibility;
	}

	private FireInfo getInfo(Block block, boolean garentee) {
		FireInfo ret = blockInfo.get(block);
		if (ret == null && garentee) {
			ret = new FireInfo();
			blockInfo.put(block, ret);
		}
		return ret;
	}

	public void rebuildFireInfo() {
		for (int x = 0; x < 4096; x++) {
			// If we care.. we could detect changes in here and make sure we
			// keep them, however
			// it's my thinking that anyone who hacks into the private variables
			// should DIAF and we don't care about them.
			field_149849_a[x] = 0;
			field_149848_b[x] = 0;
		}

		for (Map.Entry<Block, FireInfo> e : blockInfo.entrySet()) {
			int id = Block.getIdFromBlock(e.getKey());
			if (id >= 0 && id < 4096) {
				field_149849_a[id] = e.getValue().encouragement;
				field_149848_b[id] = e.getValue().flammibility;
			}
		}
	}

	public int getFlammability(Block block) {
		int id = Block.getIdFromBlock(block);
		return id >= 0 && id < 4096 ? field_149848_b[id] : 0;
	}

	public int getEncouragement(Block block) {
		int id = Block.getIdFromBlock(block);
		return id >= 0 && id < 4096 ? field_149849_a[id] : 0;
	}

	/**
	 * Side sensitive version that calls the block function.
	 *
	 * @param world
	 *            The current world
	 * @param x
	 *            X Position
	 * @param y
	 *            Y Position
	 * @param z
	 *            Z Position
	 * @param face
	 *            The side the fire is coming from
	 * @return True if the face can catch fire.
	 */
/*	public boolean canCatchFire(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
		return world.getBlock(x, y, z).isFlammable(world, x, y, z, face);
	}

	/**
	 * Side sensitive version that calls the block function.
	 *
	 * @param world
	 *            The current world
	 * @param x
	 *            X Position
	 * @param y
	 *            Y Position
	 * @param z
	 *            Z Position
	 * @param oldChance
	 *            The previous maximum chance.
	 * @param face
	 *            The side the fire is coming from
	 * @return The chance of the block catching fire, or oldChance if it is
	 *         higher
	 */
/*	public int getChanceToEncourageFire(IBlockAccess world, int x, int y, int z, int oldChance, ForgeDirection face) {
		int newChance = world.getBlock(x, y, z).getFireSpreadSpeed(world, x, y, z, face);
		return (newChance > oldChance ? newChance : oldChance);
	}
	/*
	 * ================================= Forge Start
	 * ======================================
	 */

}