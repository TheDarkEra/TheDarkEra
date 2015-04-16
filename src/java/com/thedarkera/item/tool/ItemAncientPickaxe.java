package com.thedarkera.item.tool;

import java.util.Set;

import com.google.common.collect.Sets;
import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;


public class ItemAncientPickaxe extends ItemPickaxe 
{
	private static Set blocks = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, TDEBlocks.ebony_ore});
	
	public ItemAncientPickaxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("ancient_pickaxe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}