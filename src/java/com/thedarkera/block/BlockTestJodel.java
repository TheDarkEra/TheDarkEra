package com.thedarkera.block;

import com.thedarkera.init.TDEItems;
import com.thedarkera.jodeltest.IItemBlock;

public class BlockTestJodel extends IItemBlock {

	public BlockTestJodel() {
		super();

	}

	@Override
	public String getName() {
		return "abcd";
	}

	@Override
	public String TextureLocation() {
		return "Jodel/";
	}

	@Override
	public net.minecraft.item.Item Item() {
		return TDEItems.test1;
	}
}