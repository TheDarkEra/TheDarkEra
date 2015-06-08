package com.thedarkera.ingameobjects.item.meta;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.items.ItemTDEBase;

public class ItemClayBall extends ItemTDEBase {
	
	public ItemClayBall(String name) {
		super(name);
		item = name;
		setHasSubtypes(true);
	}

	String item;
	int amount = 4; // Amount of meta items
	public IIcon[] icons = new IIcon[amount];

	@Override
	public void registerIcons(IIconRegister reg) {
		for (int i = 0; i < amount; i++) {
			this.icons[i] = reg.registerIcon(TheDarkEra.MODID + ":" + item + "_" + i);
		}
	}

	@Override
	public IIcon getIconFromDamage(int meta) {
		if (meta > amount - 1) meta = 0;

		return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < amount; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

}
