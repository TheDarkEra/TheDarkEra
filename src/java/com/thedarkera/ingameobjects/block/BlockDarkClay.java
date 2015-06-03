package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class BlockDarkClay extends Block{ //Block
	
	public BlockDarkClay(Material material, String color){
		super(material);
		String block = "dark_" + color + "_clay";
		
		setBlockName(block);
		setBlockTextureName(TheDarkEra.MODID + ":" + block);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(1F);
		setHarvestLevel("pickaxe", 0);
		setStepSound(soundTypeStone);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.clay_ball;
    }
	
	public int quantityDropped(Random p_149745_1_)
    {
        return 4;
    }

}
