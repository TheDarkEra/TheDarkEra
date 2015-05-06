package com.thedarkera.block.logs;

import java.util.List;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLogDead extends BlockRotatedPillar {

	private String name = "log_dead";

	public BlockLogDead() {
		super(Material.wood);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(2.0F);
		setBlockName(name);
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] top;
	@SideOnly(Side.CLIENT)
	private IIcon[] side;

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		top = new IIcon[3];
		side = new IIcon[3];

		for (int i = 0; i < top.length; i++) {
			top[i] = par1IconRegister.registerIcon(TheDarkEra.MODID + ":"
					+ "logs/" + name + "_Top" + i);
		}
		for (int j = 0; j < side.length; j++) {
			side[j] = par1IconRegister.registerIcon(TheDarkEra.MODID + ":"
					+ "logs/" + name + "_Side" + j);
		}
	}

	public int damageDropped(int par1) {
		return par1;
	}

	@SideOnly(Side.CLIENT)
	protected IIcon getSideIcon(int par1) {
		return side[par1];
	}

	@SideOnly(Side.CLIENT)
	protected IIcon getTopIcon(int par1) {
		return top[par1];
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int i = 0; i < 3; i++) {
			par3List.add(new ItemStack(par1, 1, i));
		}
	}

	@Override
	public boolean isWood(IBlockAccess world, int x, int y, int z) {
		return true;
	}

}