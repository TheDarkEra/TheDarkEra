package com.thedarkera.api.blocks;

import com.thedarkera.api.helper.ResourceHelper;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockTDESkull extends BlockTDEBase {

	private String name;
	private IIcon[] icons = new IIcon[6];
	private String resource = ResourceHelper.getResourceName(name);
	
	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, IIcon[] icons) {
		super(name, material);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}
	
	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, float hardness, float resistance, IIcon[] icons) {
		super(name, material, hardness, resistance);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, String toolClass, int harvestLevel, IIcon[] icons) {
		super(name, material, toolClass, harvestLevel);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, SoundType stepSound, IIcon[] icons) {
		super(name, material, stepSound);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, float hardness, float resistance, String toolClass, int harvestLevel, IIcon[] icons) {
		super(name, material, hardness, resistance, toolClass, harvestLevel);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, float hardness, float resistance, SoundType stepSound, IIcon[] icons) {
		super(name, material, hardness, resistance, stepSound);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, String toolClass, int harvestLevel, SoundType stepSound, IIcon[] icons) {
		super(name, material, toolClass, harvestLevel, stepSound);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	/**
	 * @param icons Length must be 6 or game will crash! In order: top, bottom, front, back, left, right
	 */
	public BlockTDESkull(String name, Material material, float hardness, float resistance, String toolClass, int harvestLevel, SoundType stepSound, IIcon[] icons) {
		super(name, material, hardness, resistance, toolClass, harvestLevel, stepSound);
		this.name = name;
		this.icons = icons;
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons[0] = iconRegister.registerIcon(resource + "_top");
		icons[1] = iconRegister.registerIcon(resource + "_bottom");
		icons[2] = iconRegister.registerIcon(resource + "_front");
		icons[3] = iconRegister.registerIcon(resource + "_back");
		icons[4] = iconRegister.registerIcon(resource + "_left");
		icons[5] = iconRegister.registerIcon(resource + "_right");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 0) return icons[1];
		if (side == 1) return icons[0];
		if (side == 2) return icons[3];
		if (side == 3) return icons[2];
		return icons[side];
	}
	
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
