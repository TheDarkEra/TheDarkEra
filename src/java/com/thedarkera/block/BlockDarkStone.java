package com.thedarkera.block;

import java.util.Random;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockDarkStone extends Block
{
	String name = "dark_stone";
	
	public BlockDarkStone()
	{
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1.5F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public Item getItemDropped(int a, Random b, int c)
    {
        return Item.getItemFromBlock(TDEBlocks.dark_cobblestone);
    }
}
