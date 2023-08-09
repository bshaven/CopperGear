package com.bshaven.coppertools.item;

import com.bshaven.coppertools.CopperTools;
import com.bshaven.coppertools.item.material.CopperToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static final ToolMaterial COPPER_TOOL_MATERIAL = new CopperToolMaterial();

    // Tools
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(
            COPPER_TOOL_MATERIAL, 1, -2.8F, new FabricItemSettings()
    ));
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(
            COPPER_TOOL_MATERIAL, 5.0F, -3.1F, new FabricItemSettings()
    ));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(
            COPPER_TOOL_MATERIAL, 1.5F, -3.0F, new FabricItemSettings()
    ));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(
            COPPER_TOOL_MATERIAL, 3, -2.4F, new FabricItemSettings()
    ));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(
            COPPER_TOOL_MATERIAL, 0, -3.0F, new FabricItemSettings()
    ));

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_PICKAXE);
        entries.add(COPPER_AXE);
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_HOE);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_SWORD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CopperTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CopperTools.LOGGER.info("Registering Mod Items for " + CopperTools.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
