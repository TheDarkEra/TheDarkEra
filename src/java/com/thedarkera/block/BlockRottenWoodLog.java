package com.thedarkera.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockRottenWoodLog extends BlockLog{

	private IIcon[] icons = new IIcon[6];
	String name = "rotten_wood_log";
	
	public BlockRottenWoodLog(Material m){
		super();
		setCreativeTab(TheDarkEra.tabTDE);
		setBlockName(name);
		setBlockTextureName(name);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 0);
		setHardness(1F);
		setResistance(3F);
	}
	
	/**
	 * Log top textures face North/South
	 */
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon("log_oak");
	    }
		for (int i = 1; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon("log_oak");
	    }
		for (int i = 2; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon("log_oak_top");
	    }
		for (int i = 3; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon("log_oak_top");
	    }
		for (int i = 4; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon("log_oak");
	    }
		for (int i = 5; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon("log_oak");
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return icons[side];
	}
}
