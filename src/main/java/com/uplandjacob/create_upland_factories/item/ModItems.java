package com.uplandjacob.create_upland_factories.item;

import com.uplandjacob.create_upland_factories.UplandFactoriesMod;

import com.uplandjacob.create_upland_factories.item.custom.LightningHammerItem;
import com.uplandjacob.create_upland_factories.item.custom.ModArmorItem;
import com.uplandjacob.create_upland_factories.item.custom.SwordItemWEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.redstone.Redstone;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UplandFactoriesMod.MOD_ID);

//    public static final RegistryObject<Item> INFUSED_REDSTONE =
//            ITEMS.register("infused_redstone", () -> new Item(
//                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS)));
    public static final RegistryObject<Item> GEM_CUTTER_TOOL =
            ITEMS.register("gem_cutter_tool", () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).durability(32)));

    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_INGOT =
            ITEMS.register("el_diamond_ingot", () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_STICK =
            ITEMS.register("el_diamond_stick", () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS)));



    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_SWORD =
            ITEMS.register("el_diamond_sword", () -> new SwordItemWEffect(ModTiers.ELECTRIFIED_DIAMOND,5, 7f,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant(), MobEffects.MOVEMENT_SLOWDOWN, 3));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_PICKAXE =
            ITEMS.register("el_diamond_pickaxe", () -> new PickaxeItem(ModTiers.ELECTRIFIED_DIAMOND,4, 6f,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_SHOVEL =
            ITEMS.register("el_diamond_shovel", () -> new ShovelItem(ModTiers.ELECTRIFIED_DIAMOND,2, 9f,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_AXE =
            ITEMS.register("el_diamond_axe", () -> new AxeItem(ModTiers.ELECTRIFIED_DIAMOND,7, 2f,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_HOE =
            ITEMS.register("el_diamond_hoe", () -> new HoeItem(ModTiers.ELECTRIFIED_DIAMOND,2, 9f,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));

    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_HELMET =
            ITEMS.register("el_diamond_helmet", () -> new ModArmorItem(ModArmorMaterials.ELECTRIFIED_DIAMOND, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_CHESTPLATE =
            ITEMS.register("el_diamond_chestplate", () -> new ArmorItem(ModArmorMaterials.ELECTRIFIED_DIAMOND, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_LEGGINGS =
            ITEMS.register("el_diamond_leggings", () -> new ArmorItem(ModArmorMaterials.ELECTRIFIED_DIAMOND, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));
    public static final RegistryObject<Item> ELECTRIFIED_DIAMOND_BOOTS =
            ITEMS.register("el_diamond_boots", () -> new ArmorItem(ModArmorMaterials.ELECTRIFIED_DIAMOND, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));




    public static final RegistryObject<Item> LIGHTING_HAMMER =
            ITEMS.register("lightning_hammer", () -> new LightningHammerItem(ModTiers.ELECTRIFIED_DIAMOND,2, 9f,
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_JACOB_ADDITIONS).fireResistant()));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
