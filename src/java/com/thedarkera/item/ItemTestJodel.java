package com.thedarkera.item;

import net.minecraft.block.Block;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.jodeltest.IPlaceableItem;

public class ItemTestJodel extends IPlaceableItem {
	
	public  ItemTestJodel() {
		super();
	}

	@Override
	public String getName() {
		return "TDE_Test";
	}

	@Override
	public String TextureLocation() {
		return "Jodel/";
	}

	@Override
	public Block ItemBlock() {
		return TDEBlocks.test1;
	}



}
