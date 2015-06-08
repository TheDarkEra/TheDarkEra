package com.thedarkera.ingameobjects.item;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLeafBlocks extends ItemBlock {
	
	public static final String[] leaves = TDEBlocks.allTreeTypes;


	public ItemLeafBlocks(Block block) {
		super(block);
		this.hasSubtypes = true;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= leaves.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "_" + leaves[i];
	}

	@Override
	public int getMetadata(int Meta) {
		return Meta;
	}
}
