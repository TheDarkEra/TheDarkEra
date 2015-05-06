package com.thedarkera.block.logs;

import java.util.List;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLogs extends BlockLog {
	public static final String[] logs = new String[] { "Dead", "Test" };

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list) {
		for (int i = 0; i < logs.length; i++) {
			list.add(new ItemStack(par1, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.field_150167_a = new IIcon[logs.length];
		this.field_150166_b = new IIcon[logs.length];

		for (int i = 0; i < logs.length; ++i) {
			this.field_150167_a[i] = iconRegister.registerIcon(TheDarkEra.MODID
					+ ":" + this.getTextureName() + "_" + logs[i] + "_Top");
			this.field_150166_b[i] = iconRegister.registerIcon(TheDarkEra.MODID
					+ ":" + this.getTextureName() + "_" + logs[i] + "_Side");
		}
	}
}