package com.darkteam.thedarkera.blocks;

import com.darkteam.thedarkera.Main;
import com.darkteam.thedarkera.tileentities.TileEntitySmasher;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSmasherTE extends Block implements ITileEntityProvider{

    private String name = "smasher";

    public BlockSmasherTE() {

        super(Material.rock);
        setBlockName(name);
        setCreativeTab(CreativeTabs.tabBlock);
       
    }
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntitySmasher();
    }

    @Override
    public boolean hasTileEntity(int metadata) {

        return true;
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(Main.instance, GUIs.SMASHER.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }
    public enum GUIs {
        SMASHER
    }
    
}