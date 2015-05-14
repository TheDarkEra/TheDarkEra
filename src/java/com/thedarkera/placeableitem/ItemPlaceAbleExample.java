package com.thedarkera.placeableitem;

import net.minecraft.block.Block;

import com.thedarkera.ingameobjects.iflatblocks.IPlaceableItem;
import com.thedarkera.init.TDEBlocks;

public class ItemPlaceAbleExample extends IPlaceableItem {

	public ItemPlaceAbleExample() {
		super();
	}

	public String getName() {
		return "placeableexample";
	}

	public String TextureLocation() {
		return "placeableitem/";
	}

	public Block ItemBlock() {
		return TDEBlocks.example;
	}

}
