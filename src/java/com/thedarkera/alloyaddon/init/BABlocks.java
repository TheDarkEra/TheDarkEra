package com.thedarkera.alloyaddon.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.thedarkera.alloyaddon.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class BABlocks {
	
	public static Block test_block;

	public static void init() {
		test_block = new BlockTest(Material.rock, "test_block");
		GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5).substring(5));
	}

}
