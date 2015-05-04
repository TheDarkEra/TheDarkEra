package com.thedarkera.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSteelOre extends ItemBlock
{	
	public ItemSteelOre(Block block) 
	{
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch(itemstack.getItemDamage())
		{
		case 0:
			name = "ore";
			break;
		case 1:
			name = "block";
			break;
		default:
			System.out.println("Invalid metadata for Block Steel_Ore");
			name = "broken";
			break;
		}
		return getUnlocalizedName() + "_" + name;
	}

	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}
}