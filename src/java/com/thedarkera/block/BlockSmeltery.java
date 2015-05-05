package com.thedarkera.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.TheDarkEra.GuiID;
import com.thedarkera.tileentity.TESmeltery;

public class BlockSmeltery extends BlockContainer
{
	private static final String name = "smeltery";
	private IIcon[] icons = new IIcon[2];
	
	public BlockSmeltery()
	{
		super(Material.rock);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg)
	{
		icons[0] = reg.registerIcon(TheDarkEra.MODID + ":" + name + "_top");
		icons[1] = reg.registerIcon(TheDarkEra.MODID + ":" + name + "_front");
		blockIcon = reg.registerIcon(TheDarkEra.MODID + ":" + name + "_side");
	}
	
	@Override
	public IIcon getIcon(int side, int meta)
	{
		if (side <= 1) return icons[0];
		if (meta == 0 && side == 5) return icons[1];
		if (meta == 1 && side == 2) return icons[1];
		if (meta == 2 && side == 4) return icons[1];
		if (meta >= 3 && side == 3) return icons[1];
		return blockIcon;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float lx, float ly, float lz) 
	{
		if (world.isRemote) return true;
		
		TileEntity te = world.getTileEntity(x, y, z);
		if (te != null && te instanceof TESmeltery)
		{
			player.openGui(TheDarkEra.instance, GuiID.SMELTERY.ordinal(), world, x, y, z);
			return true;
		}
		return false;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	{
		int d = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		switch (d)
		{
		case 0:
			world.setBlockMetadataWithNotify(x, y, z, 1, 2);
			break;
		case 1:
			world.setBlockMetadataWithNotify(x, y, z, 0, 2);
			break;
		case 2:
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
			break;
		case 3:
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
			break;
		}	
	}

	public TileEntity createNewTileEntity(World world, int par2)
	{
		return new TESmeltery();
	}
}
