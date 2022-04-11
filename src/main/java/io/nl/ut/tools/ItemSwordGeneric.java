package io.nl.ut.tools;

import net.minecraft.item.ItemSword;

import io.nl.ut.UltimateTools;

public class ItemSwordGeneric extends ItemSword {
    public ItemSwordGeneric(ToolMaterial material, String name) {
        super(material);
        this.setUnlocalizedName(UltimateTools.MODID + "_" + name);
        this.setTextureName(UltimateTools.MODID + ":" + name);
        this.canRepair = true;
        this.setCreativeTab(UltimateTools.tabSwords);
    }
}
