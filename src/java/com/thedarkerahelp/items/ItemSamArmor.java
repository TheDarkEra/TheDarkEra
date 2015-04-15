package com.darkteam.thedarkera.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.darkteam.thedarkera.Main;


public class ItemSamArmor extends ItemArmor
{
	public ItemSamArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(Main.MODID + "_" + name);
		setTextureName(Main.MODID + ":" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == ModItems.samhelmet || stack.getItem() == ModItems.samchest || stack.getItem() == ModItems.samboots) 
		{
			return Main.MODID + ":models/armor/samarmor1.png";
		}
		else if(stack.getItem() == ModItems.samleggings)
		{
			return Main.MODID + ":models/armor/samarmor2.png";
		}
		else
		{
			System.out.println("Invalid Item");
			return null;
		}
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(itemStack.getItem().getUnlocalizedName() == "samhelmet")
		{
			if(player.isInWater())
			{
				player.setAir(15);
			}
		}
	}
}