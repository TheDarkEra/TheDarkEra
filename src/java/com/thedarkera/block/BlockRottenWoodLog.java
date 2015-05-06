package com.thedarkera.block;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;

public class BlockRottenWoodLog extends BlockRotatedPillar
{
	private IIcon[] icons = new IIcon[6];
	String name = "rotten_wood_log";
	private String texture = "rotten_wood_log";

	public BlockRottenWoodLog(Material m)
	{
		super(m);
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
		/*icons[0] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + texture + "_top");
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + texture + "_top");
		icons[2] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + texture);*/
		
		
		icons[0] = iconRegister.registerIcon("log_oak" + "_top");
		icons[1] = iconRegister.registerIcon("log_oak" + "_top");
		icons[2] = iconRegister.registerIcon("log_oak");
	}

	@Override
	protected IIcon getSideIcon(int p_150163_1_) {
		return icons[2];
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}
}
