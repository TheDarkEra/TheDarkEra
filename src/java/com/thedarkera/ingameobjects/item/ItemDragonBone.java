package com.thedarkera.ingameobjects.item;

import com.thedarkera.ingameobjects.iflatblocks.IPlaceableItem;
import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDragonBone extends IPlaceableItem {

	public ItemDragonBone() {
		super();
	}

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        int meta = world.getBlockMetadata(x, y, z);
        int nx = x;
        int ny = y;
        int nz = z;

        switch(side){
            case 0: {ny--; break;}
            case 1: {ny++; break;}
            case 2: {nz--; break;}
            case 3: {nz++; break;}
            case 4: {nx--; break;}
            case 5: {nx++; break;}
        }

        if (world.getBlock(x, y, z) == TDEBlocks.dragon_bone && meta < 5) {
            world.setBlockMetadataWithNotify(x, y, z, meta + 1, 2);
            --itemStack.stackSize;
            return true;
        } else if (world.getBlock(nx, ny, nz) == Blocks.air) {
            world.setBlock(nx, ny, nz, ItemBlock());
            --itemStack.stackSize;
            return true;
        } else {
            return false;
        }
    }

    @Override
	public String getName() {
		return "dragon_bone";
	}

	@Override
	public String TextureLocation() {
		return "";
	}

	@Override
	public Block ItemBlock() {
		return TDEBlocks.dragon_bone;
	}
}