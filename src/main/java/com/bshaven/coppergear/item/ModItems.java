package com.bshaven.coppergear.item;

import com.bshaven.coppergear.CopperGear;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static final ToolMaterial COPPER_TOOL_MATERIAL = new ToolMaterial() {
        @Override
        public int getDurability() {
            return ToolMaterials.IRON.getDurability();
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return ToolMaterials.IRON.getMiningSpeedMultiplier();
        }

        @Override
        public float getAttackDamage() {
            return ToolMaterials.IRON.getAttackDamage();
        }

        @Override
        public int getMiningLevel() {
            return ToolMaterials.IRON.getMiningLevel();
        }

        @Override
        public int getEnchantability() {
            return ToolMaterials.IRON.getEnchantability();
        }

        @Override
        public Ingredient getRepairIngredient() {
            return ToolMaterials.IRON.getRepairIngredient();
        }
    };

    // Tools
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(
            COPPER_TOOL_MATERIAL, // Tool material
            1,                    // Attack damage
            -2.8F,                // Attack speed
            new Item.Settings() // Item settings
    ));
    public static final Item COPPER_AXE = registerItem("copper_axe", new Item(new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new Item(new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new Item(new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new Item(new FabricItemSettings()));

    // Armor
    public static final Item COPPER_HELMET = registerItem("copper_helmet", new Item(new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new Item(new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings", new Item(new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_PICKAXE);
        entries.add(COPPER_AXE);
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_SWORD);
        entries.add(COPPER_HOE);

        entries.add(COPPER_HELMET);
        entries.add(COPPER_CHESTPLATE);
        entries.add(COPPER_LEGGINGS);
        entries.add(COPPER_BOOTS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CopperGear.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CopperGear.LOGGER.info("Registering Mod Items for " + CopperGear.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
