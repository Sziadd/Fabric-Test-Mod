package net.sziad.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.sziad.testmod.TestMod;

import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item AQUAMARINE_INGOT = registerItem("aquamarine_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item AQUAMARINE_NUGGET = registerItem("aquamarine_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RAW_AQUAMARINE = registerItem("raw_aquamarine",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
    }

}
