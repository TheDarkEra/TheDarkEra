package com.thedarkera.ingameobjects.item.tool;

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
import com.thedarkera.shouts.SoulBar;
import com.thedarkera.shouts.UseShout;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWand extends Item {

	protected Item.ToolMaterial theToolMaterial;
	private static double mana = SoulBar.getMana();

	public ItemWand(Item.ToolMaterial m, String name) {
		theToolMaterial = m;
		maxStackSize = 1;
		setMaxDamage(m.getMaxUses());
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}

	/**
	 * Callback for item usage. If the item does something special on right
	 * clicking, he will have one of those. Return True if something happen and
	 * false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
		if (!player.canPlayerEdit(x, y, z, par7, stack) & (mana <= 2)) {
			return false;
		} else {
			UseShout.Shout(2, player, x, y, z);
			
			UseHoeEvent event = new UseHoeEvent(player, stack, world, x, y, z);
			if (MinecraftForge.EVENT_BUS.post(event)) {
				return false;
			}

			if (event.getResult() == Result.ALLOW) {
				stack.damageItem(1, player);
				return true;
			}

			Block block = world.getBlock(x, y, z);

			/** Dirt */
			if (par7 != 0 && (block == TDEBlocks.dark_dirt)) {
				Block block1 = Blocks.dirt;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			}else if (par7 != 0 &&   (block == Blocks.dirt)) {
				Block block1 = TDEBlocks.dark_dirt;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }
			/** Grass */
			else if (par7 != 0 &&   (block == Blocks.grass)) {
				Block block1 = TDEBlocks.dark_grass;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else if (par7 != 0 &&   (block == TDEBlocks.dark_grass)) {
				Block block1 = Blocks.grass;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
				/** Stone */
		    }else if (par7 != 0 &&   (block == Blocks.stone)) {
				Block block1 = TDEBlocks.dark_stone;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else if (par7 != 0 &&   (block == TDEBlocks.dark_stone)) {
				Block block1 = Blocks.stone;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
				/** Cobblestone */
		    }else if (par7 != 0 &&   (block == Blocks.cobblestone)) {
				Block block1 = TDEBlocks.dark_cobblestone;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else if (par7 != 0 &&   (block == TDEBlocks.dark_cobblestone)) {
				Block block1 = Blocks.cobblestone;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
				/** Gravel */
		    }else if (par7 != 0 &&   (block == Blocks.gravel)) {
				Block block1 = TDEBlocks.dark_gravel;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else if (par7 != 0 &&   (block == TDEBlocks.dark_gravel)) {
				Block block1 = Blocks.gravel;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
				/** Stone Bricks */
		    }else if (par7 != 0 &&   (block == Blocks.stonebrick)) {
				Block block1 = TDEBlocks.dark_stone_bricks;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else if (par7 != 0 &&   (block == TDEBlocks.dark_stone_bricks)) {
				Block block1 = Blocks.stonebrick;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
				/** Stone Stairs */
		    }else if (par7 != 0 &&   (block == Blocks.stone_stairs)) {
				Block block1 = TDEBlocks.dark_stone_stairs;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else if (par7 != 0 &&   (block == TDEBlocks.dark_stone_stairs)) {
				Block block1 = Blocks.stone_stairs;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				//p_77648_3_.playSoundEffect(20, 70, 20, TheDarkEra.MODID + ":" + "wand", 1, 1);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
				/** Stone Slab */
		    }else if (par7 != 0 &&   (block == Blocks.stone_slab)) {
				Block block1 = TDEBlocks.dark_stone_slab;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				//p_77648_3_.playSoundEffect(20, 70, 20, TheDarkEra.MODID + ":" + "wand", 1, 1);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else if (par7 != 0 &&   (block == TDEBlocks.dark_stone_slab)) {
				Block block1 = Blocks.stone_slab;
				world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), Blocks.grass.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 8.0F), block1.stepSound.getPitch() * 40.8F);
				
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			
		    }else{
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
