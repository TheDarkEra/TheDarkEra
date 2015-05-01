package com.thedarkera.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.TheDarkEra.GUIs;

public class TEWorkBench extends TileEntity{
	
	public static final String publicName = "tileEntityWorkBench";
    private String name = "tileEntityWorkBench";
 
    public String getName() {
 
        return name;
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(TheDarkEra.instance, GUIs.WORKBENCH.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }

}
