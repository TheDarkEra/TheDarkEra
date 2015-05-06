package com.thedarkera.world.biome.decorator;

import com.thedarkera.init.TDEBiomes;
import com.thedarkera.world.biome.BiomeDarkLand;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDecoratorHelper {

	private static WorldGenerator glowStone;

	public BiomeDecoratorHelper() {
		// glowStone = new WorldGenMinable(Blocks.glowstone, 30,
		// Blockss.lightStone);
	}

	protected static void decorateBiome(BiomeGenBase biome) {
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(
				BiomeDecoratorTDE.currentWorld,
				BiomeDecoratorTDE.randomGenerator, BiomeDecoratorTDE.chunk_X,
				BiomeDecoratorTDE.chunk_Z));
		// perpere ores for generation
		// InintOres();
		// GenerateOres
		// generateOreInBiome(biome);

		if (biome == TDEBiomes.dark_forrest) {
			// BiomeDecoratorTDE.howMenyTrees = BiomeDarkLand.treesPerChunk;
			int i = BiomeDecoratorTDE.howMenyTrees;
			/** Chunk Postions **/
			int chunkX;
			int chunkZ;
			int y;
			/** get blocks at the given locations **/
			Block block;
			Block blockA;
			/** Generates Small tree **/
			for (int a = 0; a < i; ++a) {
				if (i == BiomeDecoratorTDE.randomGenerator.nextInt(8)) {
					chunkX = BiomeDecoratorTDE.chunk_X
							+ BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
					chunkZ = BiomeDecoratorTDE.chunk_Z
							+ BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
					y = BiomeDecoratorTDE.currentWorld
							.getTopSolidOrLiquidBlock(chunkX, chunkZ);
					block = BiomeDecoratorTDE.currentWorld.getBlock(chunkX, y,
							chunkZ);
					blockA = BiomeDecoratorTDE.currentWorld.getBlock(chunkX,
							y - 1, chunkZ);
					if (block != Blocks.air || block != Blocks.water) {
						if (blockA != Blocks.air || blockA != Blocks.water) {
							// BiomeDecoratorTDE.smallTree.generate(BiomeDecoratorTDE.currentWorld,
							// BiomeDecoratorTDE.randomGenerator, chunkX, y,
							// chunkZ);
						}
					}
				}
				/** Generates Big tree **/
				if (i == BiomeDecoratorTDE.randomGenerator.nextInt(15)) {
					chunkX = BiomeDecoratorTDE.chunk_X
							+ BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
					chunkZ = BiomeDecoratorTDE.chunk_Z
							+ BiomeDecoratorTDE.randomGenerator.nextInt(16) + 8;
					y = BiomeDecoratorTDE.currentWorld
							.getTopSolidOrLiquidBlock(chunkX, chunkZ);
					block = BiomeDecoratorTDE.currentWorld.getBlock(chunkX, y,
							chunkZ);
					blockA = BiomeDecoratorTDE.currentWorld.getBlock(chunkX,
							y - 1, chunkZ);
					if (block != Blocks.air || block != Blocks.water) {
						if (blockA != Blocks.air || blockA != Blocks.water) {
							// BiomeDecoratorTDE.bigTree.generate(BiomeDecoratorTDE.currentWorld,
							// BiomeDecoratorTDE.randomGenerator, chunkX, y,
							// chunkZ);
						}
					}
				}
			}
			if (biome == TDEBiomes.dark_beach) {
				// GENERARTE DARK BEACH STUFF HERE
			}
		}
	}

	/**
	 * Prepare ores for generation
	 */
	// private static void initOres() {
	// glowstone used fotr testing generation
	// glowStone = new WorldGenMinable(Blocks.glowstone, 30,
	// Blockss.lightStone);
	// }

	/**
	 * Geberate Ores In a Biome
	 * 
	 * @param biome
	 */
	private static void generateOreInBiome(BiomeGenBase biome) {
		if (biome == TDEBiomes.dark_forrest) {
			genStandardOre(20, glowStone, 0, 128);
		}
	}

	/**
	 * Generate ores in chunks.
	 * 
	 * @param spawnWeight
	 * @param generatorToSpawn
	 * @param minSpawnHeight
	 * @param maxYSpawnHeight
	 */
	private static void genStandardOre(int spawnWeight,
			WorldGenerator generatorToSpawn, int minSpawnHeight,
			int maxYSpawnHeight) {
		for (int l = 0; l < spawnWeight; ++l) {
			int i1 = BiomeDecoratorTDE.chunk_X
					+ BiomeDecoratorTDE.randomGenerator.nextInt(16);
			int j1 = BiomeDecoratorTDE.randomGenerator.nextInt(maxYSpawnHeight
					- minSpawnHeight)
					+ minSpawnHeight;
			int k1 = BiomeDecoratorTDE.chunk_Z
					+ BiomeDecoratorTDE.randomGenerator.nextInt(16);
			generatorToSpawn.generate(BiomeDecoratorTDE.currentWorld,
					BiomeDecoratorTDE.randomGenerator, i1, j1, k1);
		}
	}
}
