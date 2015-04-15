package com.darkteam.thedarkera.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.darkteam.thedarkera.Main;
import com.darkteam.thedarkera.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSamPlant extends BlockBush implements IGrowable 
{
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public BlockSamPlant()
	{
		super(Material.plants);
		setBlockName(Main.MODID + "_" + "samplant");
		setCreativeTab((CreativeTabs)null);
        setHardness(0.0F);
        setBlockBounds(0F, 0.0F, 0F, 1F, 0.25F, 1F);
        setStepSound(soundTypeGrass);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[3];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(Main.MODID + ":" + "samplant" + i);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		if(par2 < 0 || par2 >= 3)
		{
			System.out.println("Something is wrong with the metadata for BlockSamPlant!");
			return icons[0];
		}
		else
			return icons[par2];
	}
	
	@Override
	public int getRenderType()
    {
        return 6;
    }
	
	public void updateTick(World world, int x, int y, int z, Random rand)
    {
        super.updateTick(world, x, y, z, rand);

        if (world.getBlockLightValue(x, y + 1, z) >= 9)
        {
            int l = world.getBlockMetadata(x, y, z);

            if (l < 2)
            {
                if (rand.nextInt(5) == 0)
                {
                    ++l;
                    world.setBlockMetadataWithNotify(x, y, z, l, 2);
                }
            }
        }
    }
	
	protected boolean canPlaceBlockOn(Block block)
    {
		if(block == Blocks.dirt || block == Blocks.grass)
			return true;
		else
			return false;
    }
	
	public void dropBlockAsItemWithChance(World world, int par1, int par2, int par3, int par4, float par5, int par6)
    {
        super.dropBlockAsItemWithChance(world, par1, par2, par3, par4, par5, 0);
    }
	
	@Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        if (metadata >= 2)
        {
            for (int i = 0; i < 3 + fortune; ++i)
            {
                if (world.rand.nextInt(15) <= 7)
                {
                    ret.add(new ItemStack(ModItems.berry, 1, 0));
                }
            }
        }
        
        for(int i = 0; i < 1+ fortune; i++)
        {
        	ret.add(new ItemStack(ModItems.samseed, 1 + world.rand.nextInt(1 + fortune), 0));
        }
        
        return ret;
    }
	
	@Override
	public boolean func_149851_a(World world, int x, int y, int z, boolean var5) 
	{
		return world.getBlockMetadata(x, y, z) != 2;
	}
	
	@Override
	public boolean func_149852_a(World world, Random rand, int x, int y, int z) 
	{
		return true;
	}
	
	@Override
	public void func_149853_b(World world, Random rand, int x, int y, int z) 
	{
		int next = world.getBlockMetadata(x, y, z) + 1;
		
		if(next > 2)
			next =2;
		
		world.setBlockMetadataWithNotify(x, y, z, next, 2);
	}
}