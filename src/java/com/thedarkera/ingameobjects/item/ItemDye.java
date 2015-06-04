package com.thedarkera.ingameobjects.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.items.ModItem;

public class ItemDye extends ModItem{

	public ItemDye(String name) {
		super(name);
		setHasSubtypes(true);
	}
	
	public IIcon[] icons = new IIcon[4];

	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i < 4; i ++) {
	        this.icons[i] = reg.registerIcon(TheDarkEra.MODID + ":" + "dark_dye_" + i);
	    }
	}

	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > 3)
	        meta = 0;

	    return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 4; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
}
