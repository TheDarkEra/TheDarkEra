package com.darkteam.thedarkera.items;

import java.util.List;





import com.darkteam.thedarkera.Main;
import com.darkteam.thedarkera.tabs.ModTabs;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemKey extends Item 
{
	private String[] name = {"grey", "red"};
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public ItemKey()
	{
		setUnlocalizedName(Main.MODID + "_" + "key");
		setHasSubtypes(true);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int metadata = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getUnlocalizedName() + "." + name[metadata];
    }
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister par1IconRegister)
    {
		icons = new IIcon[name.length];
		
		for(int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(Main.MODID + ":" + (getUnlocalizedName().substring(5)) + " " + name[i]);
		}
    }

    @Override
    public IIcon getIconFromDamage(int par1)
    {
    	return icons[par1];
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
    	for (int x = 0; x < name.length; x++)
        {
            par3List.add(new ItemStack(this, 1, x));
        }
    }
}