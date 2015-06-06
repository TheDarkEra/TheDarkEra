package com.thedarkera.ingameobjects.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.init.TDEItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDragonBone extends BlockTDEBase {

	// TODO make a 3D model

	public BlockDragonBone(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
		setLightOpacity(1);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTab, List list)
	{
		for (int meta = 0; meta < 5; meta++)
		{
			list.add(new ItemStack(item, 1, meta));
		}
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z) + 1;
		float f = 1.0F / 6 * meta;

		if(f > 1.0F) f = 1.0F;

		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int par2){
		return TDEItems.dragon_bone;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		switch (meta) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		case 4: 
			return 5;
		case 5: 
			return 6;
		default:
			return 1;
		}
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
	//  int meta = world.getBlockMetadata(x, y, z);
		return side == ForgeDirection.UP;
	}
}

