package io.nl.ut.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class ItemIngotGeneric extends Item {
	public ItemIngotGeneric(String name) {
		setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(UltimateTools.MODID + ":" + name);
		this.setUnlocalizedName(UltimateTools.MODID + "_" + name);
		this.setCreativeTab(UltimateTools.tabItems);
	}
}
