package com.thedarkera.world.biome.decorator;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CLAY;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND_PASS2;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.COAL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIAMOND;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIRT;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GOLD;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GRAVEL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.IRON;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.LAPIS;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.REDSTONE;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

		public class BiomeDecoratorTDE extends BiomeDecorator{

			public int bigMushroomsPerChunk;

			public int mushroomsPerChunk;

			public int flowersPerChunk;

			public int grassPerChunk;

			public int treesPerChunk;
			
			public Random randomGenerator;
			
			public WorldGenerator dirtGen;
			public WorldGenerator gravelGen;
			public WorldGenerator coalGen;
			public WorldGenerator ironGen;
			    /** Field that holds gold WorldGenMinable */
			public WorldGenerator goldGen;
			    /** Field that holds redstone WorldGenMinable */
			public WorldGenerator redstoneGen;
			    /** Field that holds diamond WorldGenMinable */
			public WorldGenerator diamondGen;
			    /** Field that holds Lapis WorldGenMinable */
			public WorldGenerator lapisGen;
			

			public BiomeDecoratorTDE(BiomeGenBase biomegenbase)
			{
				
			this.flowersPerChunk = 2;
			this.grassPerChunk = 1;
			this.dirtGen = new WorldGenMinable(Blocks.dirt, 32);
		    this.gravelGen = new WorldGenMinable(Blocks.gravel, 32);
		    this.coalGen = new WorldGenMinable(Blocks.coal_ore, 16);
		    this.ironGen = new WorldGenMinable(Blocks.iron_ore, 8);
		    this.goldGen = new WorldGenMinable(Blocks.gold_ore, 8);
		    this.redstoneGen = new WorldGenMinable(Blocks.redstone_ore, 7);
		    this.diamondGen = new WorldGenMinable(Blocks.diamond_ore, 7);
		    this.lapisGen = new WorldGenMinable(Blocks.lapis_ore, 6);
		

		//	this.plantYellowGen = new WorldGenTallGrass(ChocolateMod.chocolateflower.blockID, 0);
		//	this.plantRedGen = new WorldGenTallGrass(ChocolateMod.chocolateflower.blockID, 4);
		//	this.mushroomBrownGen = new WorldGenFlowers(ChocolateMod.chocolatemushroomwhite.blockID);
		//	this.mushroomRedGen = new WorldGenFlowers(ChocolateMod.chocolatemushroombrown.blockID);
		//	this.bigMushroomGen = new WorldGenBigChocolateMushroom();
			}
			
		@Override
		 public void decorateChunk(World p_150512_1_, Random p_150512_2_, BiomeGenBase p_150512_3_, int p_150512_4_, int p_150512_5_)
		    {
			       if (this.currentWorld != null)
		        {
		            throw new RuntimeException("Already decorating!!");
		        }
		        else
		        {
			         this.currentWorld = p_150512_1_;
			         this.randomGenerator = p_150512_2_;
			         this.chunk_X = p_150512_4_;
			         this.chunk_Z = p_150512_5_;
			         this.genDecorations(p_150512_3_);
			         this.currentWorld = null;
			         this.randomGenerator = null;
			        }
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
	    doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, GRASS);
        for (j = 0; doGen && j < this.grassPerChunk; ++j)
        {
            k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            l = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            i1 = nextInt(this.currentWorld.getHeightValue(k, l) * 2);
            WorldGenerator worldgenerator = p_150513_1_.getRandomWorldGenForGrass(this.randomGenerator);
            worldgenerator.generate(this.currentWorld, this.randomGenerator, k, i1, l);
	    }
    }
	    /**
	     * Standard ore generation helper. Generates most ores.
	     */
	    protected void genStandardOre1(int p_76795_1_, WorldGenerator p_76795_2_, int p_76795_3_, int p_76795_4_)
	    {
	        for (int l = 0; l < p_76795_1_; ++l)
	        {
	            int i1 = this.chunk_X + this.randomGenerator.nextInt(16);
	            int j1 = this.randomGenerator.nextInt(p_76795_4_ - p_76795_3_) + p_76795_3_;
	            int k1 = this.chunk_Z + this.randomGenerator.nextInt(16);
	            p_76795_2_.generate(this.currentWorld, this.randomGenerator, i1, j1, k1);
	        }
	    }

	    /**
	     * Standard ore generation helper. Generates Lapis Lazuli.
	     */
	    protected void genStandardOre2(int p_76793_1_, WorldGenerator p_76793_2_, int p_76793_3_, int p_76793_4_)
	    {
	        for (int l = 0; l < p_76793_1_; ++l)
	        {
	            int i1 = this.chunk_X + this.randomGenerator.nextInt(16);
	            int j1 = this.randomGenerator.nextInt(p_76793_4_) + this.randomGenerator.nextInt(p_76793_4_) + (p_76793_3_ - p_76793_4_);
	            int k1 = this.chunk_Z + this.randomGenerator.nextInt(16);
	            p_76793_2_.generate(this.currentWorld, this.randomGenerator, i1, j1, k1);
	        }
	    }

	    /**
	     * Generates ores in the current chunk
	     */
	    protected void generateOres()
	    {
	        MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, dirtGen, chunk_X, chunk_Z, DIRT))
	        this.genStandardOre1(20, this.dirtGen, 0, 256);
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, gravelGen, chunk_X, chunk_Z, GRAVEL))
	        this.genStandardOre1(10, this.gravelGen, 0, 256);
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, coalGen, chunk_X, chunk_Z, COAL))
	        this.genStandardOre1(20, this.coalGen, 0, 128);
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, ironGen, chunk_X, chunk_Z, IRON))
	        this.genStandardOre1(20, this.ironGen, 0, 64);
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, goldGen, chunk_X, chunk_Z, GOLD))
	        this.genStandardOre1(2, this.goldGen, 0, 32);
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, redstoneGen, chunk_X, chunk_Z, REDSTONE))
	        this.genStandardOre1(8, this.redstoneGen, 0, 16);
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, diamondGen, chunk_X, chunk_Z, DIAMOND))
	        this.genStandardOre1(1, this.diamondGen, 0, 16);
	        if (TerrainGen.generateOre(currentWorld, randomGenerator, lapisGen, chunk_X, chunk_Z, LAPIS))
	        this.genStandardOre2(1, this.lapisGen, 16, 16);
	        MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Post(currentWorld, randomGenerator, chunk_X, chunk_Z));
	    }

	    private int nextInt(int i) {
	        if (i <= 1)
	            return 0;
	        return this.randomGenerator.nextInt(i);
		}

	}
    	
		

