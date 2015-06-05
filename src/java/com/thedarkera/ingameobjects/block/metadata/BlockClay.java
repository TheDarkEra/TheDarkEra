package com.thedarkera.ingameobjects.block.metadata;

import java.util.List;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockClay extends Block 
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public BlockClay(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound){
		super(material);
		String block = name;
		String resource = TheDarkEra.MODID + ":" + block;
		
		setBlockName(block);
		setBlockTextureName(resource);
		setCreativeTab(TDE.tabTDEBlocks);
		setResistance(resistance);
		setHardness(hardness);
		setStepSound(sound);
	

	}
	
	//This is where it will locate the textures//
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[3];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(TheDarkEra.MODID + ":" + "dark_clay" + i);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		switch(par2)
		{
		case 0:
			return icons[0];
		case 1:
			if(ForgeDirection.getOrientation(par1) == ForgeDirection.UP || ForgeDirection.getOrientation(par1) == ForgeDirection.DOWN)
				return icons[2];
			else
				return icons[1];
		default:
			System.out.println("Problems with getting the icon for mod_metadata_example");
            System.out.println("STAHP DA SPAM!!!");
			return null;
		}
	}
	
	//This is what gets you 2 blocks//
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int var4 = 0; var4 < 4; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
}