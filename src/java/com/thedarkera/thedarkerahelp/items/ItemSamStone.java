package com.darkteam.thedarkera.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSamStone extends ItemBlock
{
	public ItemSamStone(Block block) 
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
			name = "wall";
			break;
		default:
			System.out.println("Invalid metadata for Block SamStone");
			name = "broken";
			break;
		}
		return getUnlocalizedName() + "." + name;
	}
	
	@Override
	public int getMetadata(int par1)
    {
        return par1;
    }
}