package com.thedarkera.ingameobjects.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TESmeltery extends TileEntity implements IInventory {
	
	private ItemStack[] stacks = new ItemStack[3];
	
	public int burnTimeLeft;
	public int originalBurnTime;
	public int timeSinceStarted;

	@Override
	public void updateEntity() {
		boolean active = burnTimeLeft > 0;
		boolean changed = false;
		
		if (burnTimeLeft > 0) {
			--burnTimeLeft;
		}
		
		if (!worldObj.isRemote) {
			// If has possibility to cook
			if (burnTimeLeft != 0 || stacks[1] != null || stacks[0] != null) {
				// If not burning and can smelt
				if (burnTimeLeft == 0 && canSmelt()) {
					originalBurnTime = burnTimeLeft = getItemBurnTime(stacks[1]);
					if (burnTimeLeft == 0) {
						changed = true;
						if (stacks[1] != null) {
							--stacks[1].stackSize;
							if (stacks[1].stackSize == 0) {
								stacks[1].getItem().getContainerItem(stacks[1]);
							}
						}
					}
				}
				// If burning and can smelt
				if (isBurning() && canSmelt()) {
					++timeSinceStarted;
					// If reached certain point, start from beginning (set speed here) default: 200
					if (timeSinceStarted == 100) {
						timeSinceStarted = 0;
						smeltItem();
						changed = true;
					}
				} else {
					timeSinceStarted = 0;
				}
				if (active != burnTimeLeft > 0) {
					changed = true;
					// TODO: Add update block state (boolean burnTimeLeft > 0)
				}
			}
			if (changed) {
				markDirty();
			}
		}
	}
	
	// TODO: Add custom recipes
	public static int getItemBurnTime(ItemStack stack) {
		if (stack == null) {
			return 0;
		} else {
			Item item = stack.getItem();
			//If block
			if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
				Block block = Block.getBlockFromItem(item);
				if (block == Blocks.wooden_slab) return 150;
				if (block.getMaterial() == Material.wood) return 300;
				if (block == Blocks.coal_block) return 16000;
			}

            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(stack);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int scale) {
		return timeSinceStarted * scale / 200;
	}
	
	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int scale) {
		if (originalBurnTime == 0) {
			originalBurnTime = 200;
		}
		return burnTimeLeft * scale / originalBurnTime;
	}
	
	public boolean isBurning() {
		return burnTimeLeft > 0;
	}
	
	public void smeltItem() {
		if (canSmelt()) {
			// TODO: use own recipes
			ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(stacks[0]);
			if (stacks[2] == null) {
				stacks[2] = stack.copy();
			} else if (stacks[2].getItem() == stack.getItem()) {
				stacks[2].stackSize += stack.stackSize;
			}
			--stacks[0].stackSize;
			if (stacks[0].stackSize <= 0) {
				stacks[0] = null;
			}
		}
	}
	
	public boolean canSmelt() {
		// If nothing to burn
		if (stacks[0] == null) {
			return false;
		} else {
			// TODO: Add custom ore
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(stacks[0]);
            if (itemstack == null) return false;
            if (stacks[2] == null) return true;
            if (!stacks[2].isItemEqual(itemstack)) return false;
            int result = stacks[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= stacks[2].getMaxStackSize();
		}
	}
	
	public int getSizeInventory() {
		return stacks.length;
	}

	public ItemStack getStackInSlot(int slot) {
		return stacks[slot];
	}

	public ItemStack decrStackSize(int slot, int amount) {
		if (stacks[slot] != null) {
			ItemStack itemstack;

			if (stacks[slot].stackSize <= amount) {
				itemstack = stacks[slot];
				stacks[slot] = null;
				return itemstack;
			} else {
				itemstack = stacks[slot].splitStack(amount);

				if (stacks[slot].stackSize == 0) {
					stacks[slot] = null;
				}

				return itemstack;
			}
		} else {
			return null;
		}
	}

	public ItemStack getStackInSlotOnClosing(int slot) {
		if (stacks[slot] != null) {
			ItemStack itemstack = stacks[slot];
			stacks[slot] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	public void setInventorySlotContents(int slot, ItemStack stack) {
		stacks[slot] = stack;

		if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
			stack.stackSize = this.getInventoryStackLimit();
		}
	}

	public String getInventoryName() {
		return "container.smeltery";
	}

	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		NBTTagList nbttaglist = nbt.getTagList("Items", 10);
		stacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			byte b0 = nbttagcompound1.getByte("Slot");

			if (b0 >= 0 && b0 < stacks.length) {
				stacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
		burnTimeLeft = nbt.getShort("BurnTime");
		timeSinceStarted = nbt.getShort("CookTime");
		originalBurnTime = getItemBurnTime(stacks[1]);
		
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setShort("BurnTime", (short)burnTimeLeft);
		nbt.setShort("CookTime", (short)timeSinceStarted);
		NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < stacks.length; ++i) {
			if (stacks[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				stacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		nbt.setTag("Items", nbttaglist);
	}

	public int getInventoryStackLimit() {
		return 64;
	}

	public boolean isUseableByPlayer(EntityPlayer player) {
		return worldObj.getTileEntity(xCoord, yCoord, zCoord) != this ? false : player.getDistanceSq((double) xCoord + 0.5D, (double) yCoord + 0.5D, (double) zCoord + 0.5D) <= 64.0D;
	}

	public void openInventory() {}

	public void closeInventory() {}

	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		return true;
	}
}
