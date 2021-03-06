package com.thedarkera.ingameobjects.iflatblocks;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class IPlaceableItem extends Item implements
		InterfacePlaceables {

	public IPlaceableItem() {
		super();
		this.setUnlocalizedName(getName());
		this.setCreativeTab(TheDarkEra.tabTDEBlocks);
		GameRegistry.registerItem(this, getName());

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ TextureLocation() + getName());
	}

	public boolean onItemUse(ItemStack itemStack, EntityPlayer player,
			World World, int x, int y, int z, int side, float p_77648_8_,
			float p_77648_9_, float p_77648_10_) {

		int nx = x;
		int ny = y;
		int nz = z;

		switch(side){
			case 0: {ny--; break;}
			case 1: {ny++; break;}
			case 2: {nz--; break;}
			case 3: {nz++; break;}
			case 4: {nx--; break;}
			case 5: {nx++; break;}
		}

		if (World.getBlock(nx, ny, nz) == Blocks.air) {
			if (World.getBlock(x, y, z) instanceof IItemBlock) {
				return false;
			} else {
				World.setBlock(nx, ny, nz, ItemBlock());
				--itemStack.stackSize;
				return true;
			}
		} else {
			return false;
		}
	}
}
