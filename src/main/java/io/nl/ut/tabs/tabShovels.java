package io.nl.ut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class tabShovels extends CreativeTabs {
  public tabShovels() {
    super("UltimateTools Shovels");
  }
  
  public Item getTabIconItem() {
    return UltimateTools.lead_shovel;
  }
}