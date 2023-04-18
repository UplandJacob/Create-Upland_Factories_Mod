package com.uplandjacob.create_upland_factories.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_JACOB_ADDITIONS = new CreativeModeTab("create_jacob_adds_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INFUSED_REDSTONE.get());
        }
    };
}
