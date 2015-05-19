package com.thedarkera.world.biome.features;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

import com.thedarkera.init.TDEBlocks;

public class WorldGenDarkJungleTree extends WorldGenAbstractTree {
	private int BaseHeight;

	public WorldGenDarkJungleTree(int BaseHeight) {
		super(true);
		this.BaseHeight = BaseHeight;
	}

	protected int getHeight(Random rand) {
		int i = rand.nextInt(10) + BaseHeight;
		return i;
	}

	private void onPlantGrow(World world, int x, int y, int z, int sourceX, int sourceY, int sourceZ) {
		world.getBlock(x, y, z).onPlantGrow(world, x, y, z, sourceX, sourceY, sourceZ);
	}

	private boolean func_150532_c(World world, Random rand, int x, int y, int z) {
		Block block = world.getBlock(x, y - 1, z);

		boolean isSoil = block.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, (BlockSapling) Blocks.sapling);
		if (isSoil && y >= 2) {
			onPlantGrow(world, x, y - 1, z, x, y, z);
			onPlantGrow(world, x + 1, y - 1, z, x, y, z);
			onPlantGrow(world, x, y - 1, z + 1, x, y, z);
			onPlantGrow(world, x + 1, y - 1, z + 1, x, y, z);
			return true;
		} else {
			return false;
		}
	}

	protected boolean func_150537_a(World world, Random rand, int x, int y, int z, int p_150537_6_) {
		return this.func_150536_b(world, rand, x, y, z, p_150537_6_) && this.func_150532_c(world, rand, x, y, z);
	}

	private boolean func_150536_b(World world, Random p_150536_2_, int p_150536_3_, int p_150536_4_, int p_150536_5_, int p_150536_6_) {
		boolean flag = true;

		if (p_150536_4_ >= 1 && p_150536_4_ + p_150536_6_ + 1 <= 256) {
			for (int i1 = p_150536_4_; i1 <= p_150536_4_ + 1 + p_150536_6_; ++i1) {
				byte b0 = 2;

				if (i1 == p_150536_4_) {
					b0 = 1;
				}

				if (i1 >= p_150536_4_ + 1 + p_150536_6_ - 2) {
					b0 = 2;
				}

				for (int j1 = p_150536_3_ - b0; j1 <= p_150536_3_ + b0 && flag; ++j1) {
					for (int k1 = p_150536_5_ - b0; k1 <= p_150536_5_ + b0 && flag; ++k1) {
						if (i1 >= 0 && i1 < 256) {

							if (!this.isReplaceable(world, j1, i1, k1)) {
								flag = false;
							}
						} else {
							flag = false;
						}
					}
				}
			}

			return flag;
		} else {
			return false;
		}
	}

	private void func_150543_c(World p_150543_1_, int p_150543_2_, int p_150543_3_, int p_150543_4_, int p_150543_5_, Random p_150543_6_)
    {
        byte b0 = 2;

        for (int i1 = p_150543_4_ - b0; i1 <= p_150543_4_; ++i1)
        {
            int j1 = i1 - p_150543_4_;
            this.func_150535_a(p_150543_1_, p_150543_2_, i1, p_150543_3_, p_150543_5_ + 1 - j1, p_150543_6_);
        }
    }

	public boolean generate(World world, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_) {
		{
			int l = this.getHeight(p_76484_2_);

			if (!this.func_150537_a(world, p_76484_2_, p_76484_3_, p_76484_4_, p_76484_5_, l)) {
				return false;
			} else {
				this.func_150543_c(world, p_76484_3_, p_76484_5_, p_76484_4_ + l, 2, p_76484_2_);

				for (int i1 = p_76484_4_ + l - 2 - p_76484_2_.nextInt(4); i1 > p_76484_4_ + l / 2; i1 -= 2 + p_76484_2_.nextInt(4)) {
					float f = p_76484_2_.nextFloat() * (float) Math.PI * 2.0F;
					int j1 = p_76484_3_ + (int) (0.5F + MathHelper.cos(f) * 4.0F);
					int k1 = p_76484_5_ + (int) (0.5F + MathHelper.sin(f) * 4.0F);
					int l1;

					for (l1 = 0; l1 < 5; ++l1) {
						j1 = p_76484_3_ + (int) (1.5F + MathHelper.cos(f) * (float) l1);
						k1 = p_76484_5_ + (int) (1.5F + MathHelper.sin(f) * (float) l1);
						this.setBlockAndNotifyAdequately(world, j1, i1 - 3 + l1 / 2, k1, TDEBlocks.blockLog1, 1);
					}

					l1 = 1 + p_76484_2_.nextInt(2);
					int i2 = i1;

					for (int j2 = i1 - l1; j2 <= i2; ++j2) {
						int k2 = j2 - i2;
						this.func_150534_b(world, j1, j2, k1, 1 - k2, p_76484_2_);
					}
				}

				for (int l2 = 0; l2 < l; ++l2) {
					Block block = world.getBlock(p_76484_3_, p_76484_4_ + l2, p_76484_5_);

					if (block.isAir(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_) || block.isLeaves(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_)) {
						this.setBlockAndNotifyAdequately(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_, TDEBlocks.blockLog1, 1);

						if (l2 > 0) {
							if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_ - 1, p_76484_4_ + l2, p_76484_5_)) {
								this.setBlockAndNotifyAdequately(world, p_76484_3_ - 1, p_76484_4_ + l2, p_76484_5_, Blocks.vine, 8);
							}

							if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_, p_76484_4_ + l2, p_76484_5_ - 1)) {
								this.setBlockAndNotifyAdequately(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_ - 1, Blocks.vine, 1);
							}
						}
					}

					if (l2 < l - 1) {
						block = world.getBlock(p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_);

						if (block.isAir(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_) || block.isLeaves(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_)) {
							this.setBlockAndNotifyAdequately(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_, TDEBlocks.blockLog1, 1);

							if (l2 > 0) {
								if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_ + 2, p_76484_4_ + l2, p_76484_5_)) {
									this.setBlockAndNotifyAdequately(world, p_76484_3_ + 2, p_76484_4_ + l2, p_76484_5_, Blocks.vine, 2);
								}

								if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ - 1)) {
									this.setBlockAndNotifyAdequately(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ - 1, Blocks.vine, 1);
								}
							}
						}

						block = world.getBlock(p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ + 1);

						if (block.isAir(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ + 1) || block.isLeaves(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ + 1)) {
							this.setBlockAndNotifyAdequately(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ + 1, TDEBlocks.blockLog1, 1);

							if (l2 > 0) {
								if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_ + 2, p_76484_4_ + l2, p_76484_5_ + 1)) {
									this.setBlockAndNotifyAdequately(world, p_76484_3_ + 2, p_76484_4_ + l2, p_76484_5_ + 1, Blocks.vine, 2);
								}

								if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ + 2)) {
									this.setBlockAndNotifyAdequately(world, p_76484_3_ + 1, p_76484_4_ + l2, p_76484_5_ + 2, Blocks.vine, 4);
								}
							}
						}

						block = world.getBlock(p_76484_3_, p_76484_4_ + l2, p_76484_5_ + 1);

						if (block.isAir(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_ + 1) || block.isLeaves(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_ + 1)) {
							this.setBlockAndNotifyAdequately(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_ + 1, TDEBlocks.blockLog1, 1);

							if (l2 > 0) {
								if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_ - 1, p_76484_4_ + l2, p_76484_5_ + 1)) {
									this.setBlockAndNotifyAdequately(world, p_76484_3_ - 1, p_76484_4_ + l2, p_76484_5_ + 1, Blocks.vine, 8);
								}

								if (p_76484_2_.nextInt(3) > 0 && world.isAirBlock(p_76484_3_, p_76484_4_ + l2, p_76484_5_ + 2)) {
									this.setBlockAndNotifyAdequately(world, p_76484_3_, p_76484_4_ + l2, p_76484_5_ + 2, Blocks.vine, 4);
								}
							}
						}
					}
				}

				return true;
			}
		}
	}

	protected void func_150534_b(World p_150534_1_, int p_150534_2_, int p_150534_3_, int p_150534_4_, int p_150534_5_, Random p_150534_6_) {
		int i1 = p_150534_5_ * p_150534_5_;

		for (int j1 = p_150534_2_ - p_150534_5_; j1 <= p_150534_2_ + p_150534_5_; ++j1) {
			int k1 = j1 - p_150534_2_;

			for (int l1 = p_150534_4_ - p_150534_5_; l1 <= p_150534_4_ + p_150534_5_; ++l1) {
				int i2 = l1 - p_150534_4_;

				if (k1 * k1 + i2 * i2 <= i1) {
					Block block = p_150534_1_.getBlock(j1, p_150534_3_, l1);

					if (block.isAir(p_150534_1_, j1, p_150534_3_, l1) || block.isLeaves(p_150534_1_, j1, p_150534_3_, l1)) {
						this.setBlockAndNotifyAdequately(p_150534_1_, j1, p_150534_3_, l1, TDEBlocks.block_leaves, 1);
					}
				}
			}
		}
	}



	protected void func_150535_a(World p_150535_1_, int p_150535_2_, int p_150535_3_, int p_150535_4_, int p_150535_5_, Random p_150535_6_) {
		int i1 = p_150535_5_ * p_150535_5_;

		for (int j1 = p_150535_2_ - p_150535_5_; j1 <= p_150535_2_ + p_150535_5_ + 1; ++j1) {
			int k1 = j1 - p_150535_2_;

			for (int l1 = p_150535_4_ - p_150535_5_; l1 <= p_150535_4_ + p_150535_5_ + 1; ++l1) {
				int i2 = l1 - p_150535_4_;
				int j2 = k1 - 1;
				int k2 = i2 - 1;

				if (k1 * k1 + i2 * i2 <= i1 || j2 * j2 + k2 * k2 <= i1 || k1 * k1 + k2 * k2 <= i1 || j2 * j2 + i2 * i2 <= i1) {
					Block block = p_150535_1_.getBlock(j1, p_150535_3_, l1);

					if (block.isAir(p_150535_1_, j1, p_150535_3_, l1) || block.isLeaves(p_150535_1_, j1, p_150535_3_, l1)) {
						this.setBlockAndNotifyAdequately(p_150535_1_, j1, p_150535_3_, l1, TDEBlocks.block_leaves, 1);
					}
				}
			}
		}
	}

	public void func_150524_b(World p_150524_1_, Random p_150524_2_, int p_150524_3_, int p_150524_4_, int p_150524_5_) {
		this.func_150539_c(p_150524_1_, p_150524_2_, p_150524_3_ - 1, p_150524_4_, p_150524_5_ - 1);
		this.func_150539_c(p_150524_1_, p_150524_2_, p_150524_3_ + 2, p_150524_4_, p_150524_5_ - 1);
		this.func_150539_c(p_150524_1_, p_150524_2_, p_150524_3_ - 1, p_150524_4_, p_150524_5_ + 2);
		this.func_150539_c(p_150524_1_, p_150524_2_, p_150524_3_ + 2, p_150524_4_, p_150524_5_ + 2);

		for (int l = 0; l < 5; ++l) {
			int i1 = p_150524_2_.nextInt(64);
			int j1 = i1 % 8;
			int k1 = i1 / 8;

			if (j1 == 0 || j1 == 7 || k1 == 0 || k1 == 7) {
				this.func_150539_c(p_150524_1_, p_150524_2_, p_150524_3_ - 3 + j1, p_150524_4_, p_150524_5_ - 3 + k1);
			}
		}
	}

	private void func_150539_c(World p_150539_1_, Random p_150539_2_, int p_150539_3_, int p_150539_4_, int p_150539_5_) {
		for (int l = -2; l <= 2; ++l) {
			for (int i1 = -2; i1 <= 2; ++i1) {
				if (Math.abs(l) != 2 || Math.abs(i1) != 2) {
					this.func_150540_a(p_150539_1_, p_150539_3_ + l, p_150539_4_, p_150539_5_ + i1);
				}
			}
		}
	}

	private void func_150540_a(World p_150540_1_, int p_150540_2_, int p_150540_3_, int p_150540_4_) {
		for (int l = p_150540_3_ + 2; l >= p_150540_3_ - 3; --l) {
			Block block = p_150540_1_.getBlock(p_150540_2_, l, p_150540_4_);

			if (block.canSustainPlant(p_150540_1_, p_150540_2_, l, p_150540_4_, ForgeDirection.UP, (BlockSapling) Blocks.sapling)) {
				this.setBlockAndNotifyAdequately(p_150540_1_, p_150540_2_, l, p_150540_4_, Blocks.dirt, 2);
				break;
			}

			if (block.isAir(p_150540_1_, p_150540_2_, l, p_150540_4_) && l < p_150540_3_) {
				break;
			}
		}
	}
}