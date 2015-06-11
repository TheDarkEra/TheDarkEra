package com.thedarkera.ingameobjects.item.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;
import com.thedarkera.init.TDEArmors;
import com.thedarkera.proxy.CommonProxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDaedricArmor extends ItemArmor {
	public ItemDaedricArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TDE.tabTDEItems);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == TDEArmors.daedric_helmet
				|| stack.getItem() == TDEArmors.daedric_chestplate
				|| stack.getItem() == TDEArmors.daedric_boots) {
			return TheDarkEra.MODID + ":models/armor/daedric_armor_1.png";
		} else if (stack.getItem() == TDEArmors.daedric_leggings) {
			return TheDarkEra.MODID + ":models/armor/daedric_armor_2.png";
		} else {
			TheDarkEra.logger.warn("Invalid armor item!");
			return null;
		}
	}
	@SideOnly(Side.CLIENT)
	   // @Override
	    public ModelBiped getArmorModel(EntityLiving entityLiving, ItemStack itemStack, int armorSlot) {
	    	ModelBiped armorModel = null;
	    		if(itemStack != null) {
	    			if(itemStack.getItem() instanceof ItemDaedricArmor) {
	    				
	    			}
	    		}
	    		
	    	int type =((ItemArmor)itemStack.getItem()).armorType;
	    		if(type == 1 || type == 3) {
	    			armorModel = TheDarkEra.proxy.getArmorModel(0);
	    		}
	    		else {
	    			armorModel = TheDarkEra.proxy.getArmorModel(1);
	    		}
//	    	    if (armorSlot == 0)
//	           return new ModelScaleHelm();
	        return null;
	    }


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (player.getCurrentArmor(0) != null
				&& player.getCurrentArmor(0).getItem()
						.equals(TDEArmors.daedric_boots)
				&& player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(1).getItem()
						.equals(TDEArmors.daedric_leggings)
				&& player.getCurrentArmor(2) != null
				&& player.getCurrentArmor(2).getItem()
						.equals(TDEArmors.daedric_chestplate)
				&& player.getCurrentArmor(3) != null
				&& player.getCurrentArmor(3).getItem()
						.equals(TDEArmors.daedric_helmet)) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id,
					20 * 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 20 * 1));
		}
	}
}
