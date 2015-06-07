package com.thedarkera.ingameobjects.block.logs;

import java.util.List;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLogs2 extends BlockLog {
	public static final String[] logs = TDEBlocks.treeTypes2;

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

		for (int i = 0; i < this.field_150167_a.length; ++i) {
			this.field_150167_a[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":logs/" + logs[i] + "_Side");
			this.field_150166_b[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":logs/" + logs[i] + "_Top");

		}
	}
    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
	public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side) {
		return true;

	}
}