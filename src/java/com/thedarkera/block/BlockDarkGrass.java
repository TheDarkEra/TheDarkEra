package com.thedarkera.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;

public class BlockDarkGrass extends Block {
	private IIcon[] icons = new IIcon[6];
	private String textureName = "dark_grass";
	private String textureName1 = "dark_dirt";

	public BlockDarkGrass(String name) {
		super(Material.grass);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.5F);
		setStepSound(soundTypeGrass);
		setHarvestLevel("shovel", 0);
		setTickRandomly(true);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons[0] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ textureName1);
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ textureName + "_top");
		icons[2] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ textureName + "_side");
		icons[3] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ textureName + "_side");
		icons[4] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ textureName + "_side");
		icons[5] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ textureName + "_side");
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}

	 /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2)
            {
                p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, TDEBlocks.dark_dirt);
            }
            else if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                    int j1 = p_149674_3_ + p_149674_5_.nextInt(5) - 3;
                    int k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
                    Block block = p_149674_1_.getBlock(i1, j1 + 1, k1);

                    if (p_149674_1_.getBlock(i1, j1, k1) == TDEBlocks.dark_dirt && p_149674_1_.getBlockMetadata(i1, j1, k1) == 0 && p_149674_1_.getBlockLightValue(i1, j1 + 1, k1) >= 4 && p_149674_1_.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        p_149674_1_.setBlock(i1, j1, k1, TDEBlocks.dark_grass);
                    }
                }
            }
        }
    }
    
    /**
     * sets what block is dropped
     */
    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_)
    {
        return TDEBlocks.dark_dirt.getItemDropped(0, random, p_149650_3_);
    }
    
}
