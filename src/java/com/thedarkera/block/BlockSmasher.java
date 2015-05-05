package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.TheDarkEra.GuiID;
import com.thedarkera.tileentity.TESmasher;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockSmasher extends Block implements ITileEntityProvider{

    private String name = "smasher";

    public BlockSmasher() {
        super(Material.rock);
        setBlockName(name);
        setCreativeTab(TheDarkEra.tabTDE);
        GameRegistry.registerBlock(this, name);
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(TheDarkEra.instance, GuiID.SMASHER.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }

    public TileEntity createNewTileEntity(World world, int meta) {
        return new TESmasher();
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
}
