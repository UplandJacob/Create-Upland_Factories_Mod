package com.uplandjacob.create_upland_factories.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_JACOB_ADDITIONS = new CreativeModeTab("create_fact_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LIGHTING_HAMMER.get());
        }
    };
}
