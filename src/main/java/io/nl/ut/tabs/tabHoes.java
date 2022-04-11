package io.nl.ut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class tabHoes extends CreativeTabs {
  public tabHoes() {
    super("UltimateTools Hoes");
  }
  
  public Item getTabIconItem() {
    return UltimateTools.lead_hoe;
  }
}
