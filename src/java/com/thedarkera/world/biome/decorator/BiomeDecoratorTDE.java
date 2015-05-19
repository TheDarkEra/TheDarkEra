package com.thedarkera.world.biome.decorator;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CLAY;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND_PASS2;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

		public class BiomeDecoratorTDE extends BiomeDecorator{

			public int bigMushroomsPerChunk;

			public int mushroomsPerChunk;

			public int flowersPerChunk;

			public int grassPerChunk;

			public int treesPerChunk;
			

			public BiomeDecoratorTDE(BiomeGenBase biomegenbase)
			{
			super();

			this.flowersPerChunk = 2;
			this.grassPerChunk = 1;
		

		//	this.plantYellowGen = new WorldGenTallGrass(ChocolateMod.chocolateflower.blockID, 0);
		//	this.plantRedGen = new WorldGenTallGrass(ChocolateMod.chocolateflower.blockID, 4);
		//	this.mushroomBrownGen = new WorldGenFlowers(ChocolateMod.chocolatemushroomwhite.blockID);
		//	this.mushroomRedGen = new WorldGenFlowers(ChocolateMod.chocolatemushroombrown.blockID);
		//	this.bigMushroomGen = new WorldGenBigChocolateMushroom();
			}

	@Override
    protected void genDecorations(BiomeGenBase p_150513_1_)
    {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));
        int i;
        int j;
        int k;
        
        boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND);
        for (i = 0; doGen && i < this.sandPerChunk2; ++i)
        {
            j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.sandGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, CLAY);
        for (i = 0; doGen && i < this.clayPerChunk; ++i)
        {
            j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.clayGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
        }

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND_PASS2);
        for (i = 0; doGen && i < this.sandPerChunk; ++i)
        {
            j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.gravelAsSandGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
        }

        i = this.treesPerChunk;

        if (this.randomGenerator.nextInt(10) == 0)
        {
            ++i;
        }

        int l;
        int i1;
        
	    doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, TREE);
	    for (j = 0; doGen && j < i; ++j)
	    {
	        k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
	        l = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
	        i1 = this.currentWorld.getHeightValue(k, l);
	        WorldGenAbstractTree worldgenabstracttree = p_150513_1_.func_150567_a(this.randomGenerator);
	        worldgenabstracttree.setScale(1.0D, 1.0D, 1.0D);
	
	        if (worldgenabstracttree.generate(this.currentWorld, this.randomGenerator, k, i1, l))
	        {
	            worldgenabstracttree.func_150524_b(this.currentWorld, this.randomGenerator, k, i1, l);
	        }
	        

	        }
    }
		}		

