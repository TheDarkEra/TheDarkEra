package com.thedarkera.inventory;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.MathHelper;

public class SlotSmeltery extends Slot {

	private EntityPlayer player;
	private int integer;
	
	public SlotSmeltery(EntityPlayer player, IInventory inventory, int ID, int x, int z) {
		super(inventory, ID, x, z);
		this.player = player;
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return false;
	}
	
	@Override
	public ItemStack decrStackSize(int size)
    {
        if (this.getHasStack())
        {
            integer += Math.min(size, this.getStack().stackSize);
        }

        return super.decrStackSize(size);
    }
	
	@Override
	public void onPickupFromSlot(EntityPlayer player, ItemStack stack)
    {
        onCrafting(stack);
        super.onPickupFromSlot(player, stack);
    }
	
	@Override
	protected void onCrafting(ItemStack stack, int size)
    {
        integer += size;
        onCrafting(stack);
    }
	
	protected void onCrafting(ItemStack stack)
    {
        stack.onCrafting(player.worldObj, player, integer);

        if (!player.worldObj.isRemote)
        {
            int i = integer;
            float f = FurnaceRecipes.smelting().func_151398_b(stack);
            int j;

            if (f == 0.0F) {
                i = 0;
            } else if (f < 1.0F) {
                j = MathHelper.floor_float((float)i * f);
                if (j < MathHelper.ceiling_float_int((float)i * f) && (float)Math.random() < (float)i * f - (float)j) {
                    ++j;
                }
                i = j;
            }
            while (i > 0) {
                j = EntityXPOrb.getXPSplit(i);
                i -= j;
                player.worldObj.spawnEntityInWorld(new EntityXPOrb(player.worldObj, player.posX, player.posY + 0.5D, player.posZ + 0.5D, j));
            }
        }
        integer = 0;
    }
}
