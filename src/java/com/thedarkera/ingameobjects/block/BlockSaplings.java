package com.thedarkera.ingameobjects.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.biome.features.WorldGenDarkJungleTree;
import com.thedarkera.world.biome.features.WorldGenDeadTree;
import com.thedarkera.world.biome.features.WorldGenTestTree;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSaplings extends BlockSapling {
	public static final String[] saplings = TDEBlocks.allTreeTypes;
	private static final IIcon[] saplingicon = new IIcon[saplings.length];

	public BlockSaplings() {
		float f = 0.4F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setCreativeTab(TheDarkEra.tabTDE);
		this.setBlockName("sapling");
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (!world.isRemote) {
			super.updateTick(world, x, y, z, rand);

			if (world.getBlockLightValue(x, y + 1, z) >= 9 && rand.nextInt(7) == 0) {
				this.func_149879_c(world, x, y, z, rand);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		meta &= 7;
		return saplingicon[MathHelper.clamp_int(meta, 0, 5)];
	}

	// markOrGrowMarked
	public void func_149879_c(World world, int x, int y, int z, Random rand) {
		int l = world.getBlockMetadata(x, y, z);

		if ((l & 8) == 0) {
			world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
		} else {
			this.func_149878_d(world, x, y, z, rand);
		}
	}

	@Override
	protected boolean canPlaceBlockOn(Block block) {
		return block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland || block == TDEBlocks.dark_dirt || block == TDEBlocks.dark_grass || block == TDEBlocks.dead_grass;
	}

	// growTree
	@Override
	public void func_149878_d(World world, int x, int y, int z, Random rand) {
		if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, rand, x, y, y))
			return;
		int l = world.getBlockMetadata(x, y, z) & 7;
		Object object = rand.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
		int i1 = 0;
		int j1 = 0;
		boolean flag = false;
		switch (l) {
		case 0:
			object = new WorldGenDeadTree();
			break;
		case 1:
			object = new WorldGenDarkJungleTree(30);
			break;
		case 2:
			object = new WorldGenTestTree(false, 10, 20, 1, 3);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
		default:
			break;
		}
		Block block = Blocks.air;

		if (flag) {
			world.setBlock(x + i1, y, z + j1, block, 0, 4);
			world.setBlock(x + i1 + 1, y, z + j1, block, 0, 4);
			world.setBlock(x + i1, y, z + j1 + 1, block, 0, 4);
			world.setBlock(x + i1 + 1, y, z + j1 + 1, block, 0, 4);
		} else {
			world.setBlock(x, y, z, block, 0, 4);
		}

		if (!((WorldGenerator) object).generate(world, rand, x + i1, y, z + j1)) {
			if (flag) {
				world.setBlock(x + i1, y, z + j1, this, l, 4);
				world.setBlock(x + i1 + 1, y, z + j1, this, l, 4);
				world.setBlock(x + i1, y, z + j1 + 1, this, l, 4);
				world.setBlock(x + i1 + 1, y, z + j1 + 1, this, l, 4);
			} else {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
	}

	// isSameSapling
	public boolean getBlockAndMetadata(World world, int x, int y, int z, int par1) {
		return world.getBlock(x, y, z) == this && (world.getBlockMetadata(x, y, z) & 7) == par1;
	}

	public int damageDropped(int par1) {
		return MathHelper.clamp_int(par1 & 7, 0, 5);
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < saplings.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < saplings.length; ++i) {
			saplingicon[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":saplings/" + saplings[i] + "_sapling");
		}
	}

	public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_) {
		return true;
	}

	public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_) {
		return (double) p_149852_1_.rand.nextFloat() < 0.45D;
	}

	public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_) {
		this.func_149879_c(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_, p_149853_2_);
	}
}