package com.thedarkera.flatblocks;

import net.minecraft.item.Item;

import com.thedarkera.iflatblocks.IItemBlock;
import com.thedarkera.init.TDEItems;

public class FlatBlockExample extends IItemBlock {

	public FlatBlockExample() {
		super();
	}

	public String getName() {
		return "flatblockexample";
	}

	public String TextureLocation() {
		return "flatblock/";
	}

	public Item Item() {
		return TDEItems.example;
	}
}
