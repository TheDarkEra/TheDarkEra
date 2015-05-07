package com.thedarkera.item;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLogBlocks2 extends ItemBlock {
	
	public static final String[] logs = TDEBlocks.treeTypes2;


	public ItemLogBlocks2(Block block) {
		super(block);
		this.hasSubtypes = true;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= logs.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "_" + logs[i];
	}

	@Override
	public int getMetadata(int Meta) {
		return Meta;
	}
}
