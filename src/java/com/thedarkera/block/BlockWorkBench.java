package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.tileentity.TEWorkBench;

public class BlockWorkBench extends Block implements ITileEntityProvider{

	private IIcon[] icons = new IIcon[6];
	String name = "work_bench";

	public BlockWorkBench()
	{
		super(Material.wood);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(3F);
		setResistance(10F);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 0);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_bottom");
	    }
		for (int i = 1; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_top");
	    }
		for (int i = 2; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
	    }
		for (int i = 3; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
	    }
		for (int i = 4; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
	    }
		for (int i = 5; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return icons[side];
	}

	public TileEntity createNewTileEntity(World world, int meta) {
        return new TEWorkBench();
    }

    @Override
    public boolean hasTileEntity(int metadata) {

        return true;
    }

}
