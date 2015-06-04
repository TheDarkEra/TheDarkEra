package com.thedarkera.api.blocks;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class ModSkull extends ModBlock {

	//private IIcon[] icons = new IIcon[6];
	
	public ModSkull(Material material, Float hardness, Float resistance, String name, String tool, int lvl, SoundType sound) {
		super(material, hardness, resistance, name, tool, lvl, sound);
		String resource = TheDarkEra.MODID + name;
		
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
		setHarvestLevel(tool, lvl);
		
		
	}
	
	/*@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons[0] = iconRegister.registerIcon(resource);
		icons[1] = iconRegister.registerIcon(resource + "_top");
		icons[2] = iconRegister.registerIcon(resource + "_side");
		icons[3] = iconRegister.registerIcon(resource + "_side");
		icons[4] = iconRegister.registerIcon(resource + "_side");
		icons[5] = iconRegister.registerIcon(resource + "_side");
	}*/
	
    @Override
	public boolean isOpaqueCube() {
		return false;
	}

    @Override
	public boolean renderAsNormalBlock() {
		return false;
	}

    @Override
	public int getRenderType() {
		return 0;
	}

    @Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		int l = world.getBlockMetadata(x, y, z) & 7;

		switch (l) {
		case 1:
		default:
			this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			break;
		case 2:
			this.setBlockBounds(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
			break;
		case 3:
			this.setBlockBounds(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
			break;
		case 4:
			this.setBlockBounds(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
			break;
		case 5:
			this.setBlockBounds(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
		}
	}

}
