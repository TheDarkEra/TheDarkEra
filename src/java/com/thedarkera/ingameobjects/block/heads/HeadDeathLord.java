package com.thedarkera.ingameobjects.block.heads;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.blocks.BlockTDESkull;

public class HeadDeathLord extends BlockTDESkull {

	public HeadDeathLord(Material material, Float hardness, Float resistance, String name, String tool, int lvl, SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound, icons);
		this.name = name;
	}
	
	String name;
	String resource = TheDarkEra.MODID + ":" + "skulls/" + name;

	private static IIcon[] icons = new IIcon[6];

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons[0] = iconRegister.registerIcon(resource);
		icons[1] = iconRegister.registerIcon(resource + "_top");
		icons[2] = iconRegister.registerIcon(resource + "_side");
		icons[3] = iconRegister.registerIcon(resource + "_side");
		icons[4] = iconRegister.registerIcon(resource + "_side");
		icons[5] = iconRegister.registerIcon(resource + "_side");
	}

}
