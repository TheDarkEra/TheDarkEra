package com.thedarkera.api.items;

import net.minecraft.item.Item;

import com.thedarkera.api.helper.ResourceHelper;

public class TabLogo extends Item {

	public TabLogo(String name) {
		//setHasSubtypes(true);
		setTextureName(ResourceHelper.getResourceName(name));
		setUnlocalizedName(name);
	}

	/*
	 * public IIcon[] icons = new IIcon[2];
	 * 
	 * @Override public void registerIcons(IIconRegister reg) { for (int i = 0;
	 * i < 2; i ++) { this.icons[i] = reg.registerIcon(TheDarkEra.MODID + ":" +
	 * "tab_logo_" + i); } }
	 * 
	 * @Override public IIcon getIconFromDamage(int meta) { if (meta > 1) meta =
	 * 0;
	 * 
	 * return this.icons[meta]; }
	 * 
	 * @Override public void getSubItems(Item item, CreativeTabs tab, List list)
	 * { for (int i = 0; i < 2; i ++) { list.add(new ItemStack(item, 1, i)); } }
	 * 
	 * @Override public String getUnlocalizedName(ItemStack stack) { return
	 * this.getUnlocalizedName() + "_" + stack.getItemDamage(); }
	 */

}
