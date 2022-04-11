package io.nl.ut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import io.nl.ut.UltimateTools;

public class tabAxes extends CreativeTabs {
  public tabAxes() {
    super("UltimateTools Axes");
  }
  
  public Item getTabIconItem() {
    return UltimateTools.lead_axe;
  }
}