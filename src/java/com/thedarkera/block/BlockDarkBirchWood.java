package com.thedarkera.block;

import java.util.Random;

import com.thedarkera.TheDarkEra;
import com.thedarkera.render.RenderDarkBirchWood;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkBirchWood extends Block
{
	String name = "dark_birch_wood";
	
	public BlockDarkBirchWood()
	{
		super(Material.wood);
		setHardness(2.0F);
		setStepSound(soundTypeWood);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHarvestLevel("axe", 0);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
	{
		setBlockBounds(0.33f, 0.33f, 0.33f, 0.66f, 0.66f, 0.66f);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public int getRenderType()
	{
		return RenderDarkBirchWood.renderId;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	{
		return true;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return Items.stick;
		/**
		 * If you want to return a block
		 * return Blocks.planks.getItem(null, 0, 0, 0);
		 */
	}

	/**
	 * ejects contained items into the world, and notifies neighbors of an update, as appropriate
	 */
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int meta)
    {
        byte b0 = 4;
        int i1 = b0 + 1;

        if (world.checkChunksExist(x - i1, y - i1, z - i1, x + i1, y + i1, z + i1))
        {
            for (int j1 = -b0; j1 <= b0; ++j1)
            {
                for (int k1 = -b0; k1 <= b0; ++k1)
                {
                    for (int l1 = -b0; l1 <= b0; ++l1)
                    {
                        Block blockleave = world.getBlock(x + j1, y + k1, z + l1);
                        if (blockleave.isLeaves(world, x + j1, y + k1, z + l1))
                        {
                            blockleave.beginLeavesDecay(world, x + j1, y + k1, z + l1);
                        }
                    }
                }
            }
        }
    }

	@SideOnly(Side.CLIENT)
	@Override
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon(TheDarkEra.MODID + ":" + (this.getUnlocalizedName().substring(5)));
	}
}