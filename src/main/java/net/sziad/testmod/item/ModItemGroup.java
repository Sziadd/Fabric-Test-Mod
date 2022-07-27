package net.sziad.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sziad.testmod.TestMod;

public class ModItemGroup {

    public static final ItemGroup AQUAMARINE = FabricItemGroupBuilder.build(
            new Identifier(TestMod.MOD_ID, "aquamarine"), () -> new ItemStack(ModItems.AQUAMARINE_INGOT));

}
