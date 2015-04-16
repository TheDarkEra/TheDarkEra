package com.thedarkera.item.armor;

	import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEArmors;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

	public class ItemDaedricArmor extends ItemArmor
	{
		public ItemDaedricArmor(ArmorMaterial material, int armorType, String name)
		{
			super(material, 0, armorType);
			setUnlocalizedName(TheDarkEra.MODID + "_" + name);
			setTextureName(TheDarkEra.MODID + ":" + name);
			setCreativeTab(TheDarkEra.tabTDE);
		}
		
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
		{
			if (stack.getItem() == TDEArmors.daedric_helmet || stack.getItem() == TDEArmors.daedric_chest || stack.getItem() == TDEArmors.daedric_boots) 
			{
				return TheDarkEra.MODID + ":models/armor/samarmor1.png";
			}
			else if(stack.getItem() == TDEArmors.daedric_leggings)
			{
				return TheDarkEra.MODID + ":models/armor/samarmor2.png";
			}
			else
			{
				System.out.println("Invalid Item");
				return null;
			}
		}
		
		public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
		{
			if(itemStack.getItem().getUnlocalizedName() == "daedric_helmet")
			{
				if(player.isInWater())
				{
					player.setAir(15);
				}
			}
		}
	}