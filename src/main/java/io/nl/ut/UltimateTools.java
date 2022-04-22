package io.nl.ut;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

import java.io.IOException;
import java.lang.Exception;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import io.nl.ut.blocks.*;
import io.nl.ut.handlers.*;
import io.nl.ut.tabs.*;
import io.nl.ut.tools.*;
import io.nl.ut.items.*;

@Mod(modid = UltimateTools.MODID, version = UltimateTools.VERSION, name = UltimateTools.NAME, useMetadata = true)
public class UltimateTools {
    public static final String MODID = "ultimate-tools";
    public static final String VERSION = "1.7.10-Stable-0.2.7a";
    public static final String NAME = "Ultimate Tools";

    // Ores
    public static Block tin_ore;
    public static Block lead_ore;
    public static Block galium_ore;
    public static Block sodium_ore;
    public static Block potassium_ore;
    public static Block cesium_ore;

    
    // Cesiun Tools
    public static Item cesium_ingot;
    public static Item cesium_sword;
    public static Item cesium_pickaxe;
    public static Item cesium_axe;
    public static Item cesium_hoe;
    public static Item cesium_shovel;
    ToolMaterial cesium = EnumHelper.addToolMaterial("cesium", 3, 075, 0.66F, 055F, 3);

    // Sodium Tools
    public static Item sodium_ingot;
    public static Item sodium_sword;
    public static Item sodium_pickaxe;
    public static Item sodium_axe;
    public static Item sodium_hoe;
    public static Item sodium_shovel;
    ToolMaterial sodium = EnumHelper.addToolMaterial("sodium", 3, 075, 0.66F, 055F, 3);

    // Potassium Tools
    public static Item potassium_ingot;
    public static Item potassium_sword;
    public static Item potassium_pickaxe;
    public static Item potassium_axe;
    public static Item potassium_hoe;
    public static Item potassium_shovel;
    ToolMaterial potassium = EnumHelper.addToolMaterial("potassium", 3, 075, 0.66F, 055F, 3);

    // Galium Tools
    public static Item galium_ingot;
    public static Item galium_sword;
    public static Item galium_pickaxe;
    public static Item galium_axe;
    public static Item galium_hoe;
    public static Item galium_shovel;
    ToolMaterial galium = EnumHelper.addToolMaterial("galium", 3, 050, 0.55F, 050F, 4);

    // Lead Tools
    public static Item lead_ingot;
    public static Item lead_sword;
    public static Item lead_pickaxe;
    public static Item lead_axe;
    public static Item lead_hoe;
    public static Item lead_shovel;
    ToolMaterial lead = EnumHelper.addToolMaterial("lead", 3, 100, 0.75F, 100.00F, 5);

    // Tin Tools
    public static Item tin_ingot;
    public static Item tin_sword;
    public static Item tin_pickaxe;
    public static Item tin_axe;
    public static Item tin_hoe;
    public static Item tin_shovel;
    ToolMaterial tin = EnumHelper.addToolMaterial("tin", 3, 250, 1.55F, 250.00F, 5);

    // Creative Tabs
    public static CreativeTabs tabItems = new tabItems();
    public static CreativeTabs tabPicks = new tabPicks();
    public static CreativeTabs tabSwords = new tabSwords();
    public static CreativeTabs tabAxes = new tabAxes();
    public static CreativeTabs tabHoes = new tabHoes();
    public static CreativeTabs tabOres = new tabOres();
    public static CreativeTabs tabShovels = new tabShovels();

    // Event Handlers
    UltimateToolsOreHandler handler = new UltimateToolsOreHandler();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Check for an update
        try {
            String[] ver_info = UpdateChecker.getUpdateJson();
            if(VERSION.equals(ver_info[0])) {
                ;
            } else {
                try{
                    UpdateGetter.getUpdate(ver_info[0]);
                } catch(Exception e) {
                    ; //do nothing
                }
                
            }
        } catch(IOException e1) {
            ; //do nothing
        }
       
        
        // Ores
        lead_ore = new BlockOreGeneric("lead_ore", 1, 3, 7);
        tin_ore = new BlockOreGeneric("tin_ore", 1, 3, 7);
        galium_ore = new BlockOreGeneric("galium_ore", 1, 3, 7);
        sodium_ore = new BlockOreGeneric("sodium_ore", 2, 3, 7);
        potassium_ore = new BlockOreGeneric("potassium_ore", 2, 3, 7);
        cesium_ore = new BlockOreGeneric("cesium_ore", 2, 3, 7);

        GameRegistry.registerBlock(lead_ore, "LeadOre");
        GameRegistry.registerBlock(tin_ore, "TinOre");
        GameRegistry.registerBlock(galium_ore, "GaliumOre");
        GameRegistry.registerBlock(sodium_ore, "SodiumOre");
        GameRegistry.registerBlock(potassium_ore, "PotassiumOre");
        GameRegistry.registerBlock(cesium_ore, "CesiumOre");
        OreDictionary.registerOre("ingotCesium", cesium_ore);
        OreDictionary.registerOre("ingotTin", tin_ore);
        OreDictionary.registerOre("ingotLead", lead_ore);
        OreDictionary.registerOre("ingotGalium", galium_ore);
        OreDictionary.registerOre("ingotSodium", sodium_ore);
        OreDictionary.registerOre("ingotPotassium", potassium_ore);

        /// Ingots
        tin_ingot = new ItemIngotGeneric("tin_ingot");
        lead_ingot = new ItemIngotGeneric("lead_ingot");
        galium_ingot = new ItemIngotGeneric("galium_ingot");
        sodium_ingot = new ItemIngotGeneric("sodium_ingot");
        potassium_ingot = new ItemIngotGeneric("potassium_ingot");
        cesium_ingot = new ItemIngotGeneric("cesium_ingot");
        GameRegistry.registerItem(cesium_ingot, "CesiumIngot");
        GameRegistry.registerItem(tin_ingot, "TinIngot");
        GameRegistry.registerItem(lead_ingot, "LeadIngot");
        GameRegistry.registerItem(galium_ingot, "GaliumIngot");
        GameRegistry.registerItem(sodium_ingot, "SodiumIngot");
        GameRegistry.registerItem(potassium_ingot, "PotassiumIngot");

        // Lead tools
        lead_pickaxe = new ItemPickaxeGeneric(lead, "lead_pickaxe");
        lead_sword = new ItemSwordGeneric(lead, "lead_sword");
        lead_axe = new ItemAxeGeneric(lead, "lead_axe");
        lead_hoe = new ItemHoeGeneric(lead, "lead_hoe");
        lead_shovel = new ItemShovelGeneric(lead, "lead_shovel");
        GameRegistry.registerItem(lead_pickaxe, "LeadPickaxe");
        GameRegistry.registerItem(lead_sword, "LeadSword");
        GameRegistry.registerItem(lead_axe, "LeadAxe");
        GameRegistry.registerItem(lead_hoe, "LeadHoe");
        GameRegistry.registerItem(lead_shovel, "LeadShovel");

        // Tin tools
        tin_pickaxe = new ItemPickaxeGeneric(tin, "tin_pickaxe");
        tin_sword = new ItemSwordGeneric(tin, "tin_sword");
        tin_axe = new ItemAxeGeneric(tin, "tin_axe");
        tin_hoe = new ItemHoeGeneric(tin, "tin_hoe");
        tin_shovel = new ItemShovelGeneric(tin, "tin_shovel");
        GameRegistry.registerItem(tin_pickaxe, "TinPickaxe");
        GameRegistry.registerItem(tin_sword, "TinSword");
        GameRegistry.registerItem(tin_axe, "TinAxe");
        GameRegistry.registerItem(tin_hoe, "TinHoe");
        GameRegistry.registerItem(tin_shovel, "TinShovel");

        // Galium tools
        galium_pickaxe = new ItemPickaxeGeneric(galium, "galium_pickaxe");
        galium_sword = new ItemSwordGeneric(galium, "galium_sword");
        galium_axe = new ItemAxeGeneric(galium, "galium_axe");
        galium_hoe = new ItemHoeGeneric(galium, "galium_hoe");
        galium_shovel = new ItemShovelGeneric(galium, "galium_shovel");
        GameRegistry.registerItem(galium_pickaxe, "GaliumPickaxe");
        GameRegistry.registerItem(galium_sword, "GaliumSword");
        GameRegistry.registerItem(galium_axe, "GaliumAxe");
        GameRegistry.registerItem(galium_hoe, "GaliumHoe");
        GameRegistry.registerItem(galium_shovel, "GaliumShovel");

        // Sodium tools
        sodium_pickaxe = new ItemPickaxeGeneric(sodium, "sodium_pickaxe");
        sodium_sword = new ItemSwordGeneric(sodium, "sodium_sword");
        sodium_axe = new ItemAxeGeneric(sodium, "sodium_axe");
        sodium_hoe = new ItemHoeGeneric(sodium, "sodium_hoe");
        sodium_shovel = new ItemShovelGeneric(sodium, "sodium_shovel");
        GameRegistry.registerItem(sodium_pickaxe, "SodiumPickaxe");
        GameRegistry.registerItem(sodium_sword, "SodiumSword");
        GameRegistry.registerItem(sodium_axe, "SodiumAxe");
        GameRegistry.registerItem(sodium_hoe, "SodiumHoe");
        GameRegistry.registerItem(sodium_shovel, "SodiumShovel");

        // cesium tools
        cesium_pickaxe = new ItemPickaxeGeneric(cesium, "cesium_pickaxe");
        cesium_sword = new ItemSwordGeneric(cesium, "cesium_sword");
        cesium_axe = new ItemAxeGeneric(cesium, "cesium_axe");
        cesium_hoe = new ItemHoeGeneric(cesium, "cesium_hoe");
        cesium_shovel = new ItemShovelGeneric(cesium, "Cesium_shovel");
        GameRegistry.registerItem(cesium_pickaxe, "CesiumPickaxe");
        GameRegistry.registerItem(cesium_sword, "CesiumSword");
        GameRegistry.registerItem(cesium_axe, "CesiumAxe");
        GameRegistry.registerItem(cesium_hoe, "CesiumHoe");
        GameRegistry.registerItem(cesium_shovel, "CesiumShovel");

        // Potassium tools
        potassium_pickaxe = new ItemPickaxeGeneric(potassium, "potassium_pickaxe");
        potassium_sword = new ItemSwordGeneric(potassium, "potassium_sword");
        potassium_axe = new ItemAxeGeneric(potassium, "potassium_axe");
        potassium_hoe = new ItemHoeGeneric(potassium, "potassium_hoe");
        potassium_shovel = new ItemShovelGeneric(potassium, "potassium_shovel");
        GameRegistry.registerItem(potassium_pickaxe, "PotassiumPickaxe");
        GameRegistry.registerItem(potassium_sword, "PotassiumSword");
        GameRegistry.registerItem(potassium_axe, "PotassiumAxe");
        GameRegistry.registerItem(potassium_hoe, "PotassiumHoe");
        GameRegistry.registerItem(potassium_shovel, "PotassiumShovel");

        // Register handlers
        GameRegistry.registerWorldGenerator(handler, 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Lead Tools
        GameRegistry.addRecipe(new ItemStack(UltimateTools.lead_pickaxe),
                "AAA",
                " B ",
                " B ",
                'A', UltimateTools.lead_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.lead_sword),
                " A ",
                " A ",
                " B ",
                'A', UltimateTools.lead_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.lead_axe),
                "AA ",
                "AB ",
                " B ",
                'A', UltimateTools.lead_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.lead_hoe),
                " AA",
                " B ",
                " B ",
                'A', UltimateTools.lead_ingot, 'B', Items.stick

        );
        GameRegistry.addRecipe(new ItemStack(UltimateTools.lead_shovel),
                " A ",
                " B ",
                " B ",
                'A', UltimateTools.lead_ingot, 'B', Items.stick);

        // Tin Tools
        GameRegistry.addRecipe(new ItemStack(UltimateTools.tin_pickaxe),
                "AAA",
                " B ",
                " B ",
                'A', UltimateTools.tin_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.tin_sword),
                " A ",
                " A ",
                " B ",
                'A', UltimateTools.tin_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.tin_axe),
                "AA ",
                "AB ",
                " B ",
                'A', UltimateTools.tin_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.tin_hoe),
                " AA",
                " B ",
                " B ",
                'A', UltimateTools.tin_ingot, 'B', Items.stick

        );
        GameRegistry.addRecipe(new ItemStack(UltimateTools.tin_shovel),
                " A ",
                " B ",
                " B ",
                'A', UltimateTools.tin_ingot, 'B', Items.stick);

        // Galium Tools
        GameRegistry.addRecipe(new ItemStack(UltimateTools.galium_pickaxe),
                "AAA",
                " B ",
                " B ",
                'A', UltimateTools.galium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.galium_sword),
                " A ",
                " A ",
                " B ",
                'A', UltimateTools.galium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.galium_axe),
                "AA ",
                "AB ",
                " B ",
                'A', UltimateTools.galium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.galium_hoe),
                " AA",
                " B ",
                " B ",
                'A', UltimateTools.galium_ingot, 'B', Items.stick

        );
        GameRegistry.addRecipe(new ItemStack(UltimateTools.galium_shovel),
                " A ",
                " B ",
                " B ",
                'A', UltimateTools.galium_ingot, 'B', Items.stick);

        // Sodium Tools
        GameRegistry.addRecipe(new ItemStack(UltimateTools.sodium_pickaxe),
                "AAA",
                " B ",
                " B ",
                'A', UltimateTools.sodium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.sodium_sword),
                " A ",
                " A ",
                " B ",
                'A', UltimateTools.sodium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.sodium_axe),
                "AA ",
                "AB ",
                " B ",
                'A', UltimateTools.sodium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.sodium_hoe),
                " AA",
                " B ",
                " B ",
                'A', UltimateTools.sodium_ingot, 'B', Items.stick

        );
        GameRegistry.addRecipe(new ItemStack(UltimateTools.sodium_shovel),
                " A ",
                " B ",
                " B ",
                'A', UltimateTools.sodium_ingot, 'B', Items.stick
        );

        // Potassium Tools
        GameRegistry.addRecipe(new ItemStack(UltimateTools.potassium_pickaxe),
                "AAA",
                " B ",
                " B ",
                'A', UltimateTools.potassium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.potassium_sword),
                " A ",
                " A ",
                " B ",
                'A', UltimateTools.potassium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.potassium_axe),
                "AA ",
                "AB ",
                " B ",
                'A', UltimateTools.potassium_ingot, 'B', Items.stick);
        GameRegistry.addRecipe(new ItemStack(UltimateTools.potassium_hoe),
                " AA",
                " B ",
                " B ",
                'A', UltimateTools.potassium_ingot, 'B', Items.stick

        );
        GameRegistry.addRecipe(new ItemStack(UltimateTools.potassium_shovel),
                " A ",
                " B ",
                " B ",
                'A', UltimateTools.potassium_ingot, 'B', Items.stick
        );

        GameRegistry.addSmelting(UltimateTools.lead_ore, new ItemStack(UltimateTools.lead_ingot, 2), 5F);
        GameRegistry.addSmelting(UltimateTools.tin_ore, new ItemStack(UltimateTools.tin_ingot, 2), 5F);
        GameRegistry.addSmelting(UltimateTools.galium_ore, new ItemStack(UltimateTools.galium_ingot, 2), 5F);
        GameRegistry.addSmelting(UltimateTools.sodium_ore, new ItemStack(UltimateTools.sodium_ingot, 2), 5F);
        GameRegistry.addSmelting(UltimateTools.potassium_ore, new ItemStack(UltimateTools.potassium_ingot, 2), 5F);
    }

}
