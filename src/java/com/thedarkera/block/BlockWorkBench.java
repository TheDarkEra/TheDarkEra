package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.tileentity.TEWorkBench;

public class BlockWorkBench extends Block implements ITileEntityProvider{

String name = "work_bench";

	public BlockWorkBench()
	{
		super(Material.wood);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(3F);
		setResistance(10F);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 0);
	}

	public TileEntity createNewTileEntity(World world, int meta) {
        return new TEWorkBench();
    }

    @Override
    public boolean hasTileEntity(int metadata) {

        return true;
    }

}
