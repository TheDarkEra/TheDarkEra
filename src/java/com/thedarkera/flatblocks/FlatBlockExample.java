package com.thedarkera.flatblocks;

import net.minecraft.item.Item;

import com.thedarkera.init.TDEItems;
import com.thedarkera.jodeltest.IItemBlock;

public class FlatBlockExample extends IItemBlock {

	public FlatBlockExample() {
		super();
	}

	@Override
	public String getName() {
		return "flatblockexample";
	}

	@Override
	public String TextureLocation() {
		return "flatblock/";
	}

	@Override
	public Item Item() {
		return TDEItems.example;
	}
}
