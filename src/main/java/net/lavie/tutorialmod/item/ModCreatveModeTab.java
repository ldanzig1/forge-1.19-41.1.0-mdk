package net.lavie.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreatveModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}
