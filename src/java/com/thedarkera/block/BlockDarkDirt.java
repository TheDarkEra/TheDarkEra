package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;

public class BlockDarkDirt extends Block { // BlockDirt
	public BlockDarkDirt(String name) {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.3F);
		setStepSound(soundTypeGravel);
		setHarvestLevel("shovel", 0);
	}
	
	/**
     * Get the block's damage value (for use with pick block).
     */
/*    public int getDamageValue(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_)
    {
        int l = p_149643_1_.getBlockMetadata(p_149643_2_, p_149643_3_, p_149643_4_);

        if (l == 1)
        {
            l = 0;
        }

        return l;
    }*/
}
