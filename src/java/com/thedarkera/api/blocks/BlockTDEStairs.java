package com.thedarkera.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.util.IIcon;

import com.thedarkera.api.TDE;
import com.thedarkera.api.helper.ResourceHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTDEStairs extends BlockStairs {

	private final Block field_150149_b;
    private final int field_150151_M;
	
	public BlockTDEStairs(Block materialFromBlock, int par2, Float blockHardness, Float blockResistance, String unlocalizedName, SoundType stepSound) {
		super(materialFromBlock, par2);
		this.field_150149_b = materialFromBlock;
        this.field_150151_M = par2;
		
		setBlockName(unlocalizedName);
		setHardness(blockHardness);
		setResistance(blockResistance);
		setStepSound(stepSound);
		setCreativeTab(TDE.tabTDEBlocks);
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        return this.field_150149_b.getIcon(0, 0);
    }
	
}
