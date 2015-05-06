package com.thedarkera.iflatblocks;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class IItemBlock extends Block implements InterfaceItemBlocks {

	public IItemBlock() {
		super(Material.cloth);

		this.setBlockName(getName());
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
		this.setLightOpacity(1);
		this.setStepSound(soundTypeSnow);
		GameRegistry.registerBlock(this, getName());

	}

	public IIcon	top;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		top = iconRegister.registerIcon(TheDarkEra.MODID + ":" + TextureLocation() + getName());
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (meta == 0) {
			return top;
		} else {
			return null;
		}

	}

	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int wx, int wy, int wz) {
		return null;
	}

	@Override
	public Item getItemDropped(int par1, Random ran, int par2) {
		return Item();
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
}
