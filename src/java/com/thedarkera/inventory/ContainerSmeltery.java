package com.thedarkera.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.thedarkera.tileentity.TESmeltery;

public class ContainerSmeltery extends Container {
	private TESmeltery te;

    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

	private int slotID = 0;

	public ContainerSmeltery(TESmeltery te, EntityPlayer player) {
		this.te = te;

		// GUI
		addSlotToContainer(new Slot(te, slotID++, 56, 17));
		addSlotToContainer(new Slot(te, slotID++, 56, 53));
		addSlotToContainer(new SlotSmeltery(player, te, slotID++, 116, 35));

		// Inventory
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		// Hotbar
		for (int i = 0; i < 9; i++) {
			addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 142));
		}
	}
	
	@Override
	public void addCraftingToCrafters(ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, te.timeSinceStarted);
        crafting.sendProgressBarUpdate(this, 1, te.burnTimeLeft);
        crafting.sendProgressBarUpdate(this, 2, te.originalBurnTime);
    }
	
	@Override
	public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for (int i = 0; i < crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)crafters.get(i);

            if (lastCookTime != te.timeSinceStarted) {
                icrafting.sendProgressBarUpdate(this, 0, te.timeSinceStarted);
            }

            if (lastBurnTime != te.burnTimeLeft) {
                icrafting.sendProgressBarUpdate(this, 1, te.burnTimeLeft);
            }

            if (lastItemBurnTime != te.originalBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, te.originalBurnTime);
            }
        }

        lastCookTime = te.timeSinceStarted;
        lastBurnTime = te.burnTimeLeft;
        lastItemBurnTime = te.originalBurnTime;
    }

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return te.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slotID) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(slotID);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (slotID < 3) {
				if (!mergeItemStack(itemstack1, 3,
						inventorySlots.size(), true)) {
					return null;
				}
			} else if (!mergeItemStack(itemstack1, 0, 3, false)) {
				return null;
			}

			if (itemstack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}
}
