package io.nl.ut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class tabSwords extends CreativeTabs {
  public tabSwords() {
    super("UltimateTools Swords");
  }
  
  public Item getTabIconItem() {
    return UltimateTools.lead_sword;
  }
}