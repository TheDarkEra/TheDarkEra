package com.thedarkera.world.biome.features;

import java.util.Random;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

public class TDEWorldGenOriginalTree extends WorldGenAbstractTree{
    private final int minTreeHeight;
    private final int randomTreeHeight;
    
    private final boolean vinesGrow;
    
    private final Block wood;
    private final Block leaves;
    
    private final int metaWood;
    private final int metaLeaves;

    public TDEWorldGenOriginalTree(Block wood, Block leaves)
    {
        this(wood, leaves, 0, 0);
    }
    
    public TDEWorldGenOriginalTree(Block wood, Block leaves, int minTreeHeight, int randomTreeHeight, boolean vinesGrow)
    {
        this(wood, leaves, 0, 0, false, minTreeHeight, randomTreeHeight, vinesGrow);
    }
    
    public TDEWorldGenOriginalTree(Block wood, Block leaves, int metaWood, int metaLeaves)
    {
        this(wood, leaves, metaWood, metaLeaves, false, 4, 3, false);
    }

    public TDEWorldGenOriginalTree(Block wood, Block leaves, int metaWood, int metaLeaves, boolean doBlockNotify, int minTreeHeight, int randomTreeHeight, boolean vinesGrow)
    {
        super(doBlockNotify);
        
        this.wood = wood;
        this.leaves = leaves;
        
        this.minTreeHeight = minTreeHeight;
        this.randomTreeHeight = randomTreeHeight;
        
        this.metaWood = metaWood;
        this.metaLeaves = metaLeaves;
        this.vinesGrow = vinesGrow;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
    	while (par1World.isAirBlock(par3, par4, par5) && par4 > 2) {
    		par4--;
		}
		Block block = par1World.getBlock(par3, par4, par5);
		if (block != Blocks.grass && block != Blocks.dirt  && block != TDEBlocks.dead_grass && block != TDEBlocks.dark_dirt && block != TDEBlocks.dark_grass) {
			return false;
		} else {
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if (par1World.isAirBlock(par3 + i, par4 - 1, par5 + j) && par1World.isAirBlock(par3 + i, par4 - 2, par5 + j) && !par1World.isAirBlock(par3 + i, par4, par5 + j)) {
						return false;
					}
				}
			}
    	
        int l = par2Random.nextInt(this.randomTreeHeight) + this.minTreeHeight;
        boolean flag = true;

        if (par4 >= 1 && par4 + l + 1 <= 256)
        {
            byte b0;
            int k1;

            for (int i1 = par4; i1 <= par4 + 1 + l; ++i1)
            {
                b0 = 1;

                if (i1 == par4)
                {
                    b0 = 0;
                }

                if (i1 >= par4 + 1 + l - 2)
                {
                    b0 = 2;
                }

                for (int j1 = par3 - b0; j1 <= par3 + b0 && flag; ++j1)
                {
                    for (k1 = par5 - b0; k1 <= par5 + b0 && flag; ++k1)
                    {
                        if (i1 >= 0 && i1 < 256)
                        {
                            block = par1World.getBlock(j1, i1, k1);

                            if (!this.isReplaceable(par1World, j1, i1, k1))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                Block block2 = par1World.getBlock(par3, par4 - 1, par5);

                boolean isSoil;
                
                if(wood == TDEBlocks.blockLog1) isSoil = block2.canSustainPlant(par1World, par3, par4 - 1, par5, ForgeDirection.UP, (BlockSapling)Blocks.sapling);
                        
               {
                    block2.onPlantGrow(par1World, par3, par4 - 1, par5, par3, par4, par5);
                    b0 = 3;
                    byte b1 = 0;
                    int l1;
                    int i2;
                    int j2;
                    int i3;

                    for (k1 = par4 - b0 + l; k1 <= par4 + l; ++k1)
                    {
                        i3 = k1 - (par4 + l);
                        l1 = b1 + 1 - i3 / 2;

                        for (i2 = par3 - l1; i2 <= par3 + l1; ++i2)
                        {
                            j2 = i2 - par3;

                            for (int k2 = par5 - l1; k2 <= par5 + l1; ++k2)
                            {
                                int l2 = k2 - par5;

                                if (Math.abs(j2) != l1 || Math.abs(l2) != l1 || par2Random.nextInt(2) != 0 && i3 != 0)
                                {
                                    Block block1 = par1World.getBlock(i2, k1, k2);

                                    if (block1.isAir(par1World, i2, k1, k2) || block1.isLeaves(par1World, i2, k1, k2))
                                    {
                                        this.setBlockAndNotifyAdequately(par1World, i2, k1, k2, leaves, this.metaLeaves);
                                    }
                                }
                            }
                        }
                    }

                    for (k1 = 0; k1 < l; ++k1)
                    {
                        block = par1World.getBlock(par3, par4 + k1, par5);

                        if (block.isAir(par1World, par3, par4 + k1, par5) || block.isLeaves(par1World, par3, par4 + k1, par5))
                        {
                            this.setBlockAndNotifyAdequately(par1World, par3, par4 + k1, par5, wood, this.metaWood);

                            if (this.vinesGrow && k1 > 0)
                            {
                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 - 1, par4 + k1, par5))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3 - 1, par4 + k1, par5, Blocks.vine, 8);
                                }

                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 + 1, par4 + k1, par5))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3 + 1, par4 + k1, par5, Blocks.vine, 2);
                                }

                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + k1, par5 - 1))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3, par4 + k1, par5 - 1, Blocks.vine, 1);
                                }

                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + k1, par5 + 1))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3, par4 + k1, par5 + 1, Blocks.vine, 4);
                                }
                            }
                        }
                    }

                    if (this.vinesGrow)
                    {
                        for (k1 = par4 - 3 + l; k1 <= par4 + l; ++k1)
                        {
                            i3 = k1 - (par4 + l);
                            l1 = 2 - i3 / 2;

                            for (i2 = par3 - l1; i2 <= par3 + l1; ++i2)
                            {
                                for (j2 = par5 - l1; j2 <= par5 + l1; ++j2)
                                {
                                    if (par1World.getBlock(i2, k1, j2).isLeaves(par1World, i2, k1, j2))
                                    {
                                        if (par2Random.nextInt(4) == 0 && par1World.getBlock(i2 - 1, k1, j2).isAir(par1World, i2 - 1, k1, j2))
                                        {
                                            this.growVines(par1World, i2 - 1, k1, j2, 8);
                                        }

                                        if (par2Random.nextInt(4) == 0 && par1World.getBlock(i2 + 1, k1, j2).isAir(par1World, i2 + 1, k1, j2))
                                        {
                                            this.growVines(par1World, i2 + 1, k1, j2, 2);
                                        }

                                        if (par2Random.nextInt(4) == 0 && par1World.getBlock(i2, k1, j2 - 1).isAir(par1World, i2, k1, j2 - 1))
                                        {
                                            this.growVines(par1World, i2, k1, j2 - 1, 1);
                                        }

                                        if (par2Random.nextInt(4) == 0 && par1World.getBlock(i2, k1, j2 + 1).isAir(par1World, i2, k1, j2 + 1))
                                        {
                                            this.growVines(par1World, i2, k1, j2 + 1, 4);
                                        }
                                    }
                                }
                            }
                        }

                        if (par2Random.nextInt(5) == 0 && l > 5)
                        {
                            for (k1 = 0; k1 < 2; ++k1)
                            {
                                for (i3 = 0; i3 < 4; ++i3)
                                {
                                    if (par2Random.nextInt(4 - k1) == 0)
                                    {
                                        l1 = par2Random.nextInt(3);
                                        if(par2Random.nextInt(2) < 1) {
                                        	this.setBlockAndNotifyAdequately(par1World, par3 + Direction.offsetX[Direction.rotateOpposite[i3]], par4 + l - 5 + k1, par5 + Direction.offsetZ[Direction.rotateOpposite[i3]], this.wood, this.metaWood);
                                        } else {
                                        	this.setBlockAndNotifyAdequately(par1World, par3 + Direction.offsetX[Direction.rotateOpposite[i3]], par4 + l - 5 + k1, par5 + Direction.offsetZ[Direction.rotateOpposite[i3]], this.leaves, this.metaLeaves);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    return true;
                }
            }
        }
        else
        {
            return false;
        }
	}
    }

    /**
     * Grows vines downward from the given block for a given length. Args: World, x, starty, z, vine-length
     */
    private void growVines(World par1World, int par2, int par3, int par4, int par5)
    {
        this.setBlockAndNotifyAdequately(par1World, par2, par3, par4, Blocks.vine, par5);
        int i1 = 4;

        while (true)
        {
            --par3;

            if (par1World.getBlock(par2, par3, par4).isAir(par1World, par2, par3, par4) || i1 <= 0)
            {
                return;
            }

            this.setBlockAndNotifyAdequately(par1World, par2, par3, par4, Blocks.vine, par5);
            --i1;
        }
    }
}

