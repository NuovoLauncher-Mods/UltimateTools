package io.nl.ut.handlers;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import io.nl.ut.UltimateTools;

public class UltimateToolsOreHandler implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
		private void generateSurface(World world, Random random, int x, int z) {
			addOreSpawn(UltimateTools.lead_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.tin_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.galium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.potassium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.sodium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
		}
		private void generateEnd(World world, Random random, int x, int z) {
			addOreSpawn(UltimateTools.lead_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.tin_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.galium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.potassium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.sodium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
		}
		private void generateNether(World world, Random random, int x, int z) {
			addOreSpawn(UltimateTools.lead_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.tin_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.galium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.potassium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
			addOreSpawn(UltimateTools.sodium_ore, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(10), 4, 20, 60);
		}
		public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
			assert maxY > minY: "The maximum value must be greater than that of the minimum";
			assert maxX > 0 && maxX <= 16: "addOreSpawn: The maxiumum X must be greter than zero but less than 16";
			assert minY > 0: "The minumum value must be greater than zero";
			assert maxY < 256 && maxY > 0: "The maximum value must be greater than that of the minimum, and be less than 256";
			assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The maxiumum Z must be greter than zero but less than 16";
			int diffBetweenMinMaxY = maxY - minY;
			for(int x = 0; x < chancesToSpawn; x++) {
				int posX = blockXPos + random.nextInt(maxX);
				int posY = minY + random.nextInt(diffBetweenMinMaxY);
				int posZ = blockZPos + random.nextInt(maxZ);
				(new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
			}
		}
}
