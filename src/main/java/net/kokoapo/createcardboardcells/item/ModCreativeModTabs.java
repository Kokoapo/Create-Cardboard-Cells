package net.kokoapo.createcardboardcells.item;

import net.kokoapo.createcardboardcells.CreateCardboardCells;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCardboardCells.MODID);

    public static final RegistryObject<CreativeModeTab> CREATE_CARDBOARD_CELLS_TAB = CREATIVE_MODE_TABS.register("create_cardboard_cells_tab", 
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CARDBOARD_CELL_1K.get()))
            .title(Component.translatable("creativetab.create_cardboard_cells_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.CARDBOARD_CELL_1K.get());
                pOutput.accept(ModItems.CARDBOARD_CELL_4K.get());
                pOutput.accept(ModItems.CARDBOARD_CELL_16K.get());
                pOutput.accept(ModItems.CARDBOARD_CELL_64K.get());
            })
            .build());

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
