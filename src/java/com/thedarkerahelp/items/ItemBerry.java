package com.darkteam.thedarkera.items;



import com.darkteam.thedarkera.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBerry extends ItemFood 
{
	private int secondpotionId;
    private int secondpotionDuration;
    private int secondpotionAmplifier;
    private float secondpotionEffectProbability;
	
	public ItemBerry(int food, float saturation, boolean wolfFood, String name) 
	{
		super(food, saturation, wolfFood);
		setUnlocalizedName(Main.MODID + "_" + name);
		setTextureName(Main.MODID + ":" + name);
		setPotionEffect(Potion.moveSpeed.id, 15, 0, 1F);
		setSecondPotionEffect(Potion.digSpeed.id, 15, 0, 1F);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
		
        if (!par2World.isRemote && this.secondpotionId > 0 && par2World.rand.nextFloat() < this.secondpotionEffectProbability)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.secondpotionId, this.secondpotionDuration * 20, this.secondpotionAmplifier));
        }
    }
	
	public ItemFood setSecondPotionEffect(int par1, int par2, int par3, float par4)
    {
        this.secondpotionId = par1;
        this.secondpotionDuration = par2;
        this.secondpotionAmplifier = par3;
        this.secondpotionEffectProbability = par4;
        return this;
    }
}