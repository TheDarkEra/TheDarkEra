package com.thedarkera.ingameobjects.item.drops;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.items.ModItem;

public class ItemAshDrops extends ModItem{

	public ItemAshDrops(String name) {
		super(name);
		setHasSubtypes(true);
	}
	
	public IIcon[] icons = new IIcon[2];

	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i < 2; i ++) {
	        this.icons[i] = reg.registerIcon(TheDarkEra.MODID + ":" + "ash_drops_" + i);
	    }
	}

	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > 1)
	        meta = 0;

	    return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 2; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
	/*
	 * ash_drop_1 = jelly
	 * ash_drop_1 = leg
	 */

}
