package net.wyat.magitech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAGITECH_TAB = new CreativeModeTab("magitechtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack((ModItems.RAW_ARCANIUM.get()));
        }
    };

}
