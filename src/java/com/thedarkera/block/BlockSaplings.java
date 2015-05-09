package com.thedarkera.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.world.biome.features.WorldGenDeadTree;
import com.thedarkera.ztesting.EntityTreeFX;

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

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		Random rng = new Random();
		for (int l = 0; l < 4; ++l) {
		}
		double d0 = (double) ((float) x + rng.nextFloat());
		double d1 = (double) ((float) y + rng.nextFloat());
		double d2 = (double) ((float) z + rng.nextFloat());
		double d3 = 0.0D;
		double d4 = 0.0D;
		double d5 = 0.0D;
		int i1 = rng.nextInt(2) * 2 - 1;
		d3 = ((double) rng.nextFloat() - 0.5D) * 0.5D;
		d4 = ((double) rng.nextFloat() - 0.5D) * 0.5D;
		d5 = ((double) rng.nextFloat() - 0.5D) * 0.5D;

		if (world.getBlock(x - 1, y, z) != this && world.getBlock(x + 1, y, z) != this) {
			d0 = (double) x + 0.5D + 0.25D * (double) i1;
			d3 = (double) (rng.nextFloat() * 2.0F * (float) i1);
		} else {
			d2 = (double) z + 0.5D + 0.25D * (double) i1;
			d5 = (double) (rng.nextFloat() * 2.0F * (float) i1);
		}
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 202f, 35f, 22f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 210f, 61f, 22f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 217f, 91f, 15f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 220f, 110f, 13f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 237f, 158f, 10f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 247f, 189f, 0f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 251f, 213f, 10f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 230f, 226f, 9f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 197f, 211f, 0f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 165f, 197f, 15f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 146f, 192f, 14f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 113f, 179f, 14f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 85f, 164f, 28f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 58f, 155f, 32f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 43f, 155f, 34f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 3f, 147f, 49f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 12f, 140f, 75f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 8f, 141f, 108f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 11f, 141f, 148f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 13f, 155f, 196f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 20f, 141f, 198f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 12f, 123f, 187f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 19f, 90f, 158f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 13f, 66f, 132f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 18f, 49f, 121f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 27f, 26f, 95f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 30f, 16f, 89f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 58f, 11f, 89f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 115f, 8f, 97f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 139f, 10f, 98f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 194f, 15f, 104f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 198f, 0f, 75f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 197f, 11f, 33f));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 195f, 51f, 43f));

		return true;
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
		return block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland || block == TDEBlocks.dark_dirt || block == TDEBlocks.dark_grass;
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
			break;
		case 2:
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
	public boolean func_149880_a(World world, int x, int y, int z, int par1) {
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
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		for (int i = 0; i < saplingicon.length; ++i) {
			saplingicon[i] = p_149651_1_.registerIcon(TheDarkEra.MODID + ":saplings/" + saplings[i] + "_sapling");
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