package com.thedarkera.item.tool;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.sounds.Sounds;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWand extends Item {

	protected Item.ToolMaterial theToolMaterial;

	public ItemWand(Item.ToolMaterial m, String name) {
		theToolMaterial = m;
		maxStackSize = 1;
		setMaxDamage(m.getMaxUses());
		setCreativeTab(TheDarkEra.tabTDE);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}

	/**
	 * Callback for item usage. If the item does something special on right
	 * clicking, he will have one of those. Return True if something happen and
	 * false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
		if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_)) {
			return false;
		} else {
			UseHoeEvent event = new UseHoeEvent(p_77648_2_, p_77648_1_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_);
			if (MinecraftForge.EVENT_BUS.post(event)) {
				return false;
			}

			if (event.getResult() == Result.ALLOW) {
				p_77648_1_.damageItem(1, p_77648_2_);
				return true;
			}

			Block block = p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);

			/** Dirt */
			if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_dirt)) {
				Block block1 = Blocks.dirt;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			}else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.dirt)) {
				Block block1 = TDEBlocks.dark_dirt;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }
			/** Grass */
			else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.grass)) {
				Block block1 = TDEBlocks.dark_grass;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_grass)) {
				Block block1 = Blocks.grass;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
				/** Stone */
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.stone)) {
				Block block1 = TDEBlocks.dark_stone;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_stone)) {
				Block block1 = Blocks.stone;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
				/** Cobblestone */
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.cobblestone)) {
				Block block1 = TDEBlocks.dark_cobblestone;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_cobblestone)) {
				Block block1 = Blocks.cobblestone;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
				/** Gravel */
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.gravel)) {
				Block block1 = TDEBlocks.dark_gravel;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_gravel)) {
				Block block1 = Blocks.gravel;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
				/** Stone Bricks */
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.stonebrick)) {
				Block block1 = TDEBlocks.dark_stone_bricks;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_stone_bricks)) {
				Block block1 = Blocks.stonebrick;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
				/** Stone Stairs */
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.stone_stairs)) {
				Block block1 = TDEBlocks.dark_stone_stairs;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_stone_stairs)) {
				Block block1 = Blocks.stone_stairs;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
				/** Stone Slab */
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.stone_slab)) {
				Block block1 = TDEBlocks.dark_stone_slab;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == TDEBlocks.dark_stone_slab)) {
				Block block1 = Blocks.stone_slab;
				p_77648_3_.playSoundEffect((double) ((float) p_77648_4_ + 0.5F), (double) ((float) p_77648_5_ + 0.5F), (double) ((float) p_77648_6_ + 0.5F), Sounds.soundWand.getStepResourcePath(), 100.0F, 1.0F);
				
				if (p_77648_3_.isRemote) {
					return true;
				} else {
					p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
					p_77648_1_.damageItem(1, p_77648_2_);
					return true;
				}
			
		    }else {
				return false;
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	public String getToolMaterialName() {
		return this.theToolMaterial.toString();
	}

}
