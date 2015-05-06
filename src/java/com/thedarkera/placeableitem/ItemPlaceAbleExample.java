package com.thedarkera.placeableitem;

import net.minecraft.block.Block;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.jodeltest.IPlaceableItem;

public class ItemPlaceAbleExample extends IPlaceableItem {
	
	public  ItemPlaceAbleExample() {
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
