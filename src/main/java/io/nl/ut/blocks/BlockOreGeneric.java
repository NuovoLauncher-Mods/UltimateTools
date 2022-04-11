package io.nl.ut.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import io.nl.ut.UltimateTools;

public class BlockOreGeneric extends Block {
	public BlockOreGeneric(String name, int level) {
		super(Material.rock);
		setBlockName(UltimateTools.MODID + "_" + name);
		setBlockTextureName(UltimateTools.MODID + ":" + name);
		setHardness(3F);
		setResistance(7F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", level);
		setCreativeTab(UltimateTools.tabOres);
	}
}
