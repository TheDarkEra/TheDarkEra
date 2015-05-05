package com.thedarkera.jodeltest;

import com.thedarkera.TheDarkEra;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class IPlaceableItem extends Item implements InterfacePlaceables {

	public IPlaceableItem() {
		super();
		this.setUnlocalizedName(getName());
		this.setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerItem(this, getName());

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(TheDarkEra.MODID + ":" + TextureLocation() + getName());
	}

	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World World, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
		if (World.getBlock(x, y + 1, z) == Blocks.air) {
			if (World.getBlock(x, y, z) instanceof IItemBlock){
				return false;
			}else{
			World.setBlock(x, y + 1, z, ItemBlock());
			--itemStack.stackSize;
			return true;
			}
		} else {
			return false;
		}
		}
	}
