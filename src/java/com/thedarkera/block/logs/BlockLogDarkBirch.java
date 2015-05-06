package com.thedarkera.block.logs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.render.RenderDarkBirchWood;

public class BlockLogDarkBirch extends Block {
	String name = "dark_birch_log";

	public BlockLogDarkBirch() {
		super(Material.wood);
		setHardness(2.0F);
		setStepSound(soundTypeWood);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHarvestLevel("axe", 0);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y,
			int z) {
		setBlockBounds(0.33f, 0.33f, 0.33f, 0.66f, 0.66f, 0.66f);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return RenderDarkBirchWood.renderId;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess,
			int par2, int par3, int par4, int par5) {
		return true;
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int par3) {
		return Items.stick;
	}

	@Override
	public void breakBlock(World world, int x, int y, int z, Block block,
			int meta) {
		byte b0 = 4;
		int i1 = b0 + 1;

		if (world.checkChunksExist(x - i1, y - i1, z - i1, x + i1, y + i1, z
				+ i1)) {
			for (int j1 = -b0; j1 <= b0; ++j1) {
				for (int k1 = -b0; k1 <= b0; ++k1) {
					for (int l1 = -b0; l1 <= b0; ++l1) {
						Block blockleave = world.getBlock(x + j1, y + k1, z
								+ l1);
						if (blockleave.isLeaves(world, x + j1, y + k1, z + l1)) {
							blockleave.beginLeavesDecay(world, x + j1, y + k1,
									z + l1);
						}
					}
				}
			}
		}
	}
}