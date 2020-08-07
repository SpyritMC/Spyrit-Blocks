package com.gmail.SpyritMC.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockBase extends Block {

    public BlockBase(String name, float hardness, float resistance, Material material, BlockSoundGroup sound, ItemGroup itemgroup, Tag<Item> tag, int miningLevel) {

        super(FabricBlockSettings.of(material).sounds(sound).strength(hardness, resistance).requiresTool().breakByTool(tag, miningLevel));
        Registry.register(Registry.BLOCK, new Identifier("spyritblocks", name), this);
        Registry.register(Registry.ITEM,new Identifier("spyritblocks", name), new BlockItem(this, new Item.Settings().maxCount(64).group(itemgroup)));

    }
}