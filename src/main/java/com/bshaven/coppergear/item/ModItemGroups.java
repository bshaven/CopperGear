package com.bshaven.coppergear.item;

import com.bshaven.coppergear.CopperGear;
import com.bshaven.coppergear.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COPPERGEAR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CopperGear.MOD_ID, "coppergear"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coppergear"))
                    .icon(() -> new ItemStack(Items.COPPER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_HOE);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                    }).build());


    public static void registerItemGroups() {
        CopperGear.LOGGER.info("Registering Item Groups for " + CopperGear.MOD_ID);
    }
}
