package com.uplandjacob.create_upland_factories.block;

import com.uplandjacob.create_upland_factories.UplandFactoriesMod;
//import com.uplandjacob.create_upland_factories.block.custom.GemCuttingStationBlock;
import com.uplandjacob.create_upland_factories.item.ModCreativeModeTab;
import com.uplandjacob.create_upland_factories.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, UplandFactoriesMod.MOD_ID);


    public static final RegistryObject<Block> INFUSED_REDSTONE =
            registerBlock("infused_redstone", () -> new RedStoneWireBlock(
                    BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noCollission()), ModCreativeModeTab.CREATE_JACOB_ADDITIONS);



    public static final RegistryObject<Block> ELECTRIFIED_DIAMOND_ORE =
            registerBlock("el_diamond_ore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.CREATE_JACOB_ADDITIONS);
    public static final RegistryObject<Block> DEEPSLATE_ELECTRIFIED_DIAMOND_ORE =
            registerBlock("deep_el_diamond_ore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 8)), ModCreativeModeTab.CREATE_JACOB_ADDITIONS);

    public static final RegistryObject<Block> ELECTRIFIED_DIAMOND_BLOCK =
            registerBlock("el_diamond_block", () -> new Block(
                    BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.CREATE_JACOB_ADDITIONS);


//    public static final RegistryObject<Block> GEM_CUTTING_STATION =
//        registerBlock("gem_cutting_station", () -> new GemCuttingStationBlock(
//                BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
//                ModCreativeModeTab.CREATE_JACOB_ADDITIONS);



//    @SubscribeEvent
//    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
//        //event.getRegistry().register(ELECTRIFIED_DIAMOND_ORE_ITEM);
//        //event.getRegistry().register(CreeperSurpriseBlock.ITEM);
//
//    }
//
//    @SubscribeEvent
//    public static void registerBlocks(RegistryEvent.Register<Block> event) {
////        event.getRegistry().register(ELECTRIFIED_DIAMOND_ORE_BLOCK);
////        event.getRegistry().register(CreeperSurpriseBlock.INSTANCE);
//
//    }
//    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
//        RegistryObject<T> toReturn = BLOCKS.register(name, block);
//        registerBlockItem(name, toReturn, tab, tooltipKey);
//        return toReturn;
//    }
//
//    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
//        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
//                new Item.Properties().tab(tab)) {
//            @Override
//            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
//                pTooltip.add(new TranslatableComponent(tooltipKey));
//            }
//        });
//    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}





