package com.thedarkera.ingameobjects.block.metadata;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockSandstoneItem extends ItemBlock
{
	public BlockSandstoneItem(Block block) 
	{
		super(block);
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{	
		
		//This is where you would then add all the metablocks, but dont forget to change ,,var < 2,, to ,,var < 3,, so it can have 3 metadata blocks//
		String name = "";
		switch(itemstack.getItemDamage())
		{
		case 0:
			name = "";
			break;
		case 1:
			name = ".bricks";
			break;
		default:
			System.out.println("Invalid metadata for Block dark_clay");
			name = "broken";
			break;
		}
		return getUnlocalizedName() + name;
	}
	
	@Override
	public int getMetadata(int par1)
    {
        return par1;
    }
}