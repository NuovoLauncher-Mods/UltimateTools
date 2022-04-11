package io.nl.ut.tools;

import net.minecraft.item.ItemHoe;

import io.nl.ut.UltimateTools;

public class ItemHoeGeneric extends ItemHoe {
	public ItemHoeGeneric(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(UltimateTools.MODID + "_" + name);
		this.setTextureName(UltimateTools.MODID + ":" + name);
		this.canRepair = true;
		this.setCreativeTab(UltimateTools.tabHoes);
	}
}