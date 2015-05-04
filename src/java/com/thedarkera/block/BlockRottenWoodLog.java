package com.thedarkera.block;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;

public class BlockRottenWoodLog extends BlockLog
{
	private IIcon[] icons = new IIcon[6];
	String name = "rotten_wood_log";

	public BlockRottenWoodLog(Material m)
	{
		super();
		setCreativeTab(TheDarkEra.tabTDE);
		setBlockName(name);
		setBlockTextureName(name);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 0);
		setHardness(1F);
		setResistance(3F);
	}

	//Log top textures face North/South
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("log_oak");
		}
		icons[2] = iconRegister.registerIcon("log_oak_top");
		icons[3] = iconRegister.registerIcon("log_oak_top");
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}
}
