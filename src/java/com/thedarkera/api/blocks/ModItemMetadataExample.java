package com.thedarkera.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ModItemMetadataExample extends ItemBlock
{
	public ModItemMetadataExample(Block block) 
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
			name = "dark_wool";
			break;
		case 1:
			name = "dark_clay";
			break;
		default:
			System.out.println("Invalid metadata for Block mod_item_metadata_example");
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