package com.thedarkera.item;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSaplingBlocks extends ItemBlock {

	public static final String[] saplings = TDEBlocks.allTreeTypes;
	

	public ItemSaplingBlocks(Block block) {
		super(block);
		this.hasSubtypes = true;
	}

	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= saplings.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "_" + saplings[i];
	}

	public int getMetadata(int Meta) {
		return Meta;
	}
}
