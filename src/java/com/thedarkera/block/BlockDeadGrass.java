package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;

public class BlockDeadGrass extends Block
{
	private IIcon[] icons = new IIcon[6];
	private String textureName = "dead_grass";
	
	public BlockDeadGrass(String name)
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
		icons[0] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + textureName + "_bottom");
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + textureName + "_top");
		icons[2] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + textureName + "_side");
		icons[3] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + textureName + "_side");
		icons[4] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + textureName + "_side");
		icons[5] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + textureName + "_side");
	}

	@Override
	public IIcon getIcon(int side, int meta)
	{
		return icons[side];
	}

}
