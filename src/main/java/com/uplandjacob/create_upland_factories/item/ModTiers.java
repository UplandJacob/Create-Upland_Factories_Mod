package com.uplandjacob.create_upland_factories.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ELECTRIFIED_DIAMOND = new ForgeTier(5, 5000, 10.0f,
            6f, 30, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ELECTRIFIED_DIAMOND_INGOT.get()));
}
