package com.uplandjacob.create_upland_factories.item;

import com.uplandjacob.create_upland_factories.UplandFactoriesMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UplandFactoriesMod.MOD_ID);

    public static final RegistryObject<Item> INFUSED_REDSTONE = ITEMS.register("infused_redstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
