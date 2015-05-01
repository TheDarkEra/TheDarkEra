package com.thedarkera.item;

	import com.thedarkera.TheDarkEra;
	import net.minecraft.item.Item;

	public class ItemLightningRune extends Item 
	{
		 String name = "lightning_rune";
		
		public ItemLightningRune()
		{
			setUnlocalizedName("lightning_rune");
			setTextureName(TheDarkEra.MODID + ":" + name);
			setCreativeTab(TheDarkEra.tabTDE);
		}
	}