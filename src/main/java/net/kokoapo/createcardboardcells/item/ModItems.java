package net.kokoapo.createcardboardcells.item;

import net.kokoapo.createcardboardcells.CreateCardboardCells;
import net.kokoapo.createcardboardcells.item.custom.CardboardCell;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateCardboardCells.MODID);

    public static final RegistryObject<Item> CARDBOARD_CELL_1K = ITEMS.register("cardboard_cell_1k", () -> new CardboardCell(new Item.Properties(), 1024));
    public static final RegistryObject<Item> CARDBOARD_CELL_4K = ITEMS.register("cardboard_cell_4k", () -> new CardboardCell(new Item.Properties(), 4096));
    public static final RegistryObject<Item> CARDBOARD_CELL_16K = ITEMS.register("cardboard_cell_16k", () -> new CardboardCell(new Item.Properties(), 16384));
    public static final RegistryObject<Item> CARDBOARD_CELL_64K = ITEMS.register("cardboard_cell_64k", () -> new CardboardCell(new Item.Properties(), 65536));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
