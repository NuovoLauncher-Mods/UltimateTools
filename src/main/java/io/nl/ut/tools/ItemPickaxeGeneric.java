package io.nl.ut.tools;

import net.minecraft.item.ItemPickaxe;

import io.nl.ut.UltimateTools;

public class ItemPickaxeGeneric extends ItemPickaxe {
    public ItemPickaxeGeneric(ToolMaterial material, String name) {
        super(material);
        this.setUnlocalizedName(UltimateTools.MODID + "_" + name);
        this.setTextureName(UltimateTools.MODID + ":" + name);
        this.canRepair = true;
        this.setCreativeTab(UltimateTools.tabPicks);
    }
}