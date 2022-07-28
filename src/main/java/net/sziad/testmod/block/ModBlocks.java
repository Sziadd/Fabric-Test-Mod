package net.sziad.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.sziad.testmod.TestMod;
import net.sziad.testmod.item.ModItemGroup;

public class  ModBlocks {

    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.AQUAMARINE);

    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.AQUAMARINE);

    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.AQUAMARINE);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block , ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering ModBlocks for " + TestMod.MOD_ID);
    }

}
