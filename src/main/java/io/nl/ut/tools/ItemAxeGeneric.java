package io.nl.ut.tools;

import net.minecraft.item.ItemAxe;

import io.nl.ut.UltimateTools;

public class ItemAxeGeneric extends ItemAxe {
	public ItemAxeGeneric(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(UltimateTools.MODID + "_" + name);
		this.setTextureName(UltimateTools.MODID + ":" + name);
		this.canRepair = true;
		this.setCreativeTab(UltimateTools.tabAxes);
	
	}
}
