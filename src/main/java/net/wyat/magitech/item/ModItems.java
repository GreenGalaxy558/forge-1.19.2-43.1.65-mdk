package net.wyat.magitech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wyat.magitech.MagiTech;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagiTech.MOD_ID);

    public static final RegistryObject<Item> ARCANIUM = ITEMS.register("arcanium",
            () -> new Item((new Item.Properties().tab(ModCreativeModeTab.MAGITECH_TAB))));
    public static final RegistryObject<Item> RAW_ARCANIUM = ITEMS.register("raw_arcanium",
            () -> new Item((new Item.Properties().tab(ModCreativeModeTab.MAGITECH_TAB))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
