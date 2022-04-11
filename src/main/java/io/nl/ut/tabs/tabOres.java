package io.nl.ut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class tabOres extends CreativeTabs {
  public tabOres() {
    super("UltimateTools Ores");
  }
  
  public Item getTabIconItem() {
    return UltimateTools.lead_ingot;
  }
}