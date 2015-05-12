package com.thedarkera.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDETools;

public class BlockAncientOre extends Block {

	String name = "ancient_ore";

	public BlockAncientOre() {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	   // drops.add(new ItemStack(Items.coal, world.rand.nextInt(3) + 1)); 
	    if (world.rand.nextFloat() < 0.1F)
	        drops.add(new ItemStack(TDETools.ancient_wand));
	    else if (world.rand.nextFloat() < 0.1F)
	    	drops.add(new ItemStack(TDETools.ancient_axe));
	    else if (world.rand.nextFloat() < 0.1F)
	    	drops.add(new ItemStack(TDETools.ancient_hoe));
	    else if (world.rand.nextFloat() < 0.1F)
	    	drops.add(new ItemStack(TDETools.ancient_pickaxe));
	    else if (world.rand.nextFloat() < 0.1F)
	    	drops.add(new ItemStack(TDETools.ancient_shovel));
	    else if (world.rand.nextFloat() < 0.6F)
	    	drops.add(new ItemStack(this));
	    return drops;
	}
	
}