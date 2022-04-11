package io.nl.ut.tools;

import net.minecraft.item.ItemSpade;

import io.nl.ut.UltimateTools;

public class ItemShovelGeneric extends ItemSpade {
    public ItemShovelGeneric(ToolMaterial material, String name) {
        super(material);
        this.setUnlocalizedName(UltimateTools.MODID + "_" + name);
        this.setTextureName(UltimateTools.MODID + ":" + name);
        this.canRepair = true;
        this.setCreativeTab(UltimateTools.tabShovels);
    }
}