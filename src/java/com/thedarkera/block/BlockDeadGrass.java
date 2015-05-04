package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;

public class BlockDeadGrass extends Block
{
	private IIcon[] icons = new IIcon[6];

	String name = "dead_grass";

	public BlockDeadGrass()
	{
		super(Material.grass);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.4F);
		setStepSound(soundTypeGrass);
		setHarvestLevel("shovel", 0);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("dirt");
		}
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":dead_grass");
	}

	@Override
	public IIcon getIcon(int side, int meta)
	{
		return icons[side];
	}

}
