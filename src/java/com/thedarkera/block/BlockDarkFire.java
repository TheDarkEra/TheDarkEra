package com.thedarkera.block;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFire;
import net.minecraft.entity.Entity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockDarkFire extends BlockFire {

    public BlockDarkFire() {
        super();
        this.setBlockName("darkfire");
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        entity.setFire(10);
    }

    public void onBlockAdded(World world, int x, int y, int z){
        if(!(world.provider.dimensionId == 0 || world.provider.dimensionId == TheDarkEra.dimension) || !TDEBlocks.dark_portal.func_150000_e(world, x, y, z)){
            if(!world.doesBlockHaveSolidTopSurface(world, x, y-1, z)){
                world.setBlockToAir(x, y, z);
            }else{
                world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world) + world.rand.nextInt(10));
            }
        }
    }

}
