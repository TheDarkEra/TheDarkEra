package com.thedarkera.generation;

import java.util.Random;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenGrapePlant extends WorldGenerator
{
	@Override
	public boolean generate(World world, Random rand, int x, int y,int z) 
	{
		for (int l = 0; l < 64; ++l)
        {
            int x1 = x + rand.nextInt(8) - rand.nextInt(8);
            int y1 = y + rand.nextInt(4) - rand.nextInt(4);
            int z1 = y + rand.nextInt(8) - rand.nextInt(8);

            if (TDEBlocks.grape_plant.canPlaceBlockAt(world, x1, y1, z1) && world.getBlock(x1, y1 - 1, z1) == Blocks.grass)
            {
                world.setBlock(x1, y1, z1, TDEBlocks.grape_plant, rand.nextInt(3), 2);
            }
        }

        return true;
	}
}