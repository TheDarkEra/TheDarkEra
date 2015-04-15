package com.darkteam.thedarkera.blocks;

import com.darkteam.thedarkera.Main;
import com.darkteam.thedarkera.tabs.ModTabs;
import com.darkteam.thedarkera.tileentities.TileEntitySam;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockSamTE extends BlockContainer
{
	private String name = "samte";
	
	private IIcon[] icons;
	
	public BlockSamTE()
	{
		super(Material.rock);
		setBlockName(Main.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[10];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(Main.MODID + ":" + "samte" + i);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return icons[par2];
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) 
	{
		return new TileEntitySam();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null)
		{
			if(entity instanceof TileEntitySam)
			{
				TileEntitySam samEntity = (TileEntitySam) entity;
				
				if(player.isSneaking())
				{
					if(!world.isRemote)
						samEntity.editCounter();
				}
				
				return true;
			}
		}
		return false;
    }
}