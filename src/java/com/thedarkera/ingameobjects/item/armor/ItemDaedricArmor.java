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
import com.thedarkera.init.TDEArmors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDaedricArmor extends ItemTDEArmor {

	public String textureName;
	
	public ItemDaedricArmor(String unlocalizedName, ArmorMaterial material, int par3, int armorType, String name) {
		super(material, par3, armorType, name);
		this.setUnlocalizedName(unlocalizedName);
		this.textureName = name;
		this.setTextureName(TheDarkEra.MODID + ":" + getUnlocalizedName());
		setCreativeTab(TheDarkEra.tabTDEItems);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
   //     if (slot == 0)
     //       return ;
      //  else {
        	return TheDarkEra.MODID + ":armor/" + textureName + "_" + (this.armorType == 2 ? "2" : "1") +".png";
        }
		
		//	return Reference.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") +".png";
//	}


	@SideOnly(Side.CLIENT)
	// @Override
	public ModelBiped getArmorModel(EntityLiving entityLiving, ItemStack itemStack, int armorSlot) {
		ModelBiped armorModel = null;
		if (itemStack != null) {
			if (itemStack.getItem() instanceof ItemDaedricArmor) {

			}
		}

		int type = ((ItemArmor) itemStack.getItem()).armorType;
		if (type == 1 || type == 3) {
			armorModel = TheDarkEra.proxy.getArmorModel(0);
		} else {
			armorModel = TheDarkEra.proxy.getArmorModel(1);
		}
		//	    	    if (armorSlot == 0)
		//	           return new ModelScaleHelm();
		return null;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(TDEArmors.daedric_boots) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(TDEArmors.daedric_leggings) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(TDEArmors.daedric_chestplate) && player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(TDEArmors.daedric_helmet)) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20 * 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 20 * 1));
		}
	}
}
