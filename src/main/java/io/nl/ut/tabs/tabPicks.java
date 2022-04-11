package io.nl.ut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class tabPicks extends CreativeTabs {
  public tabPicks() {
    super("UltimateTools Pickaxes");
  }
  
  public Item getTabIconItem() {
    return UltimateTools.lead_pickaxe;
  }
}