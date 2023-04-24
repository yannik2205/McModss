package net.yannik.darquise.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    //duplicate with new name for new tab
    public static final CreativeModeTab Darquise = new CreativeModeTab("darquisetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL.get());
        }
    };
}
