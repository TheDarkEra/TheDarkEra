package com.thedarkera.api.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegHelper {
	public static void reg(Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}

	public static void reg(Block block, Class<? extends ItemBlock> itemBlock) {
		GameRegistry.registerBlock(block, itemBlock, block.getUnlocalizedName().substring(5));
	}

	public static void reg(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}
