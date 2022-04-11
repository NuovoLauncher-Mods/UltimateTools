package io.nl.ut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class tabItems extends CreativeTabs {
  public tabItems() {
    super("UltimateTools Items");
  }
  
  public Item getTabIconItem() {
    return UltimateTools.lead_ingot;
  }
}