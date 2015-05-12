package com.thedarkera.item;

import com.thedarkera.iflatblocks.IPlaceableItem;
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
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        int meta = world.getBlockMetadata(x, y, z);

        if (world.getBlock(x, y, z) == TDEBlocks.dragon_bone) {
            if (meta < 5) {
                world.setBlockMetadataWithNotify(x, y, z, meta + 1, 2);
                --itemStack.stackSize;
            }
            if (world.getBlock(x, y +1, z) == Blocks.air && meta == 5) {
                world.setBlock(x, y + 1, z, ItemBlock());
                --itemStack.stackSize;
            }
            return true;
        } else if (world.getBlock(x, y +1, z) == Blocks.air) {
            world.setBlock(x, y + 1, z, ItemBlock());
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