package com.bshaven.coppergear.item.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {

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
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

}
