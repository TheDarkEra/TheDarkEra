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
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_sides");
	    }
		for (int i = 3; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_sides");
	    }
		for (int i = 4; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_sides");
	    }
		for (int i = 5; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_sides");
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

/**
 * I have Modelled the workbench and double workbench.
 * 
 * When one workbench is placed it needs to use the ModelWorkBench.
 * When 2 are placed next to each other it needs to use ModelDoubleWorkBenchOne and ModelDoubleWorkBenchTwo. (These may need to be rotated.)
 * I have put the texture templates in the textures folder, If you need help knowing what part is what position on the texture template just ask.
 * 
 * Please Note: I have commented line 84 out of TheDarkEra.java. This is the registerGuiHandler class, this is causing a crash when the game is launched and needs to be looked at.
 * Once this is fixed the Gui for the workbench should work. The Gui still needs a few things set up after it is working.
 * 
 * Thanks
 * - Blurr
 */


