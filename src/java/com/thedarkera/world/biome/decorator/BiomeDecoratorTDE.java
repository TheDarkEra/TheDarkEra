package com.thedarkera.world.biome.decorator;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND_PASS2;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import com.thedarkera.init.TDEBiomes;
import com.thedarkera.world.biome.features.WorldGenDeadTree;
import com.thedarkera.world.gen.WorldGenDeadTrees;

public class BiomeDecoratorTDE extends BiomeDecorator {
	
	/** The world the BiomeDecorator is currently decorating */
	public static World currentWorld;
	/** The Biome Decorator's random number generator. */
	public static Random randomGenerator;
	/** The X-coordinate of the chunk currently being decorated */
	public static int chunk_X;
	/** The Z-coordinate of the chunk currently being decorated */
	public static int chunk_Z;
	/** True if decorator should generate surface lava & water */
	public static boolean generateLakes;
	/** How meny trees per chunk, set in each biome class **/
	public static int treesPerChunk;

	/** Dimension Trees **/
	// public static WorldGenDeadTrees deadTree;
	// public static WorldGenForestTrees smallTree;
	// public static WorldGenForestBigTree bigTree;
	// public static WorldGenEffectTree effectTree;

	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000164";

	public BiomeDecoratorTDE() {
		System.out.println("BIOME CALLED");
		// coalGen = new WorldGenMinable(Blocks.coal_ore, 16,
		// Blockss.lightStone);
		// ironGen = new WorldGenMinable(Blocks.iron_ore, 8,
		// Blockss.lightStone);
		// goldGen = new WorldGenMinable(Blocks.gold_ore, 8,
		// Blockss.lightStone);
		// redstoneGen = new WorldGenMinable(Blocks.redstone_ore, 7,
		// Blockss.lightStone);
		// diamondGen = new WorldGenMinable(Blocks.diamond_ore, 7,
		// Blockss.lightStone);
		// lapisGen = new WorldGenMinable(Blocks.lapis_ore, 6,
		// Blockss.lightStone);
		// ebonyGen = new WorldGenMinable(TDEBlocks.ebony_ore, 6
		// Blockss.lightStone);

		// TREES
		//deadTree = new WorldGenDeadTrees(true);
		// smallTree = new WorldGenForestTrees(true);
		// bigTree = new WorldGenForestBigTree(true, 10, 1, 5);
		// effectTree = new WorldGenEffectTree(true);
		// dark_birch_tree = new WorldGenDarkBirchTree(true);

		// generates lakes and lava lakes in dimension.
		generateLakes = true;
	}

	public void decorateChunk(World world, Random random,
			BiomeGenBase biomeGenBase, int chunkX, int chunkZ) {
		if (currentWorld != null) {
			throw new RuntimeException("Already decorating!!");
		} else {
			currentWorld = world;
			randomGenerator = random;
			chunk_X = chunkX;
			chunk_Z = chunkZ;
			genDecorationsForBiome(biomeGenBase);
			currentWorld = null;
			randomGenerator = null;
		}
	}
//		private void TreeGen.decorate(World world, Random random, int x, int z) {
//		BiomeGenBase biomeGenBase = world.getWorldChunkManager().getBiomeGenAt(x + 16, z + 16);
//		
//		if (biomeGenBase == TDEBiomes.dark_land)
//		for (int i = 0; i < 20; i++){
//             int Xcoord1 = x + random.nextInt(16); //where in chuck it generates
//             int Ycoord1 = random.nextInt(100); //how high it generates
//             int Zcoord1 = z + random.nextInt(16); //where in chunk it generates
//             	new WorldGenDeadTree().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
//		}
//	}
	@Override
    protected void genDecorations(BiomeGenBase p_150513_1_)
    {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));
        int i;
        int j;
        int k;

  //      boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND);
  //      for (i = 0; doGen && i < this.sandPerChunk2; ++i)
   //     {
   //        j = BiomeDecoratorTDE.chunk_X + BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
   //        k = BiomeDecoratorTDE.chunk_Z + BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
  //          BiomeDecoratorTDE.deadTree.generate(BiomeDecoratorTDE.currentWorld, BiomeDecoratorTDE.randomGenerator, j, BiomeDecoratorTDE.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
  //      }
   //     doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND_PASS2);
   //     for (i = 0; doGen && i < this.sandPerChunk; ++i)
   //     {
   //         j = BiomeDecoratorTDE.chunk_X + BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
   //         k = BiomeDecoratorTDE.chunk_Z + BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
   //         this.gravelAsSandGen.generate(BiomeDecoratorTDE.currentWorld, BiomeDecoratorTDE.randomGenerator, j, BiomeDecoratorTDE.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
   //     }

        i = BiomeDecoratorTDE.treesPerChunk;

        if (BiomeDecoratorTDE.randomGenerator.nextInt(10) == 0)
        {
            ++i;
        }
    }
	protected void genDecorationsForBiome(BiomeGenBase biome) {
		BiomeDecoratorHelper.decorateBiome(biome);
	}
}
