package com.thedarkera.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLogBlocks extends ItemBlock {

	public static final String[] logs = new String[] { "Dead", "Test" };

	public ItemLogBlocks(Block block) {
		super(block);
		this.hasSubtypes = true;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= logs.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "." + logs[i];
	}

	@Override
	public int getMetadata(int Meta) {
		return Meta;
	}
}
