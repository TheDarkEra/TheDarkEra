package com.thedarkera.ingameobjects.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.init.TDETools;

public class BlockAncientOre extends BlockTDEBase {

	public BlockAncientOre(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(tool, material, hardness, resistance, tool, lvl, sound);
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
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
    {
        return 3;
    }
	
}