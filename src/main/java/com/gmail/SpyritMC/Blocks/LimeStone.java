package com.gmail.SpyritMC.Blocks;


import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class LimeStone {

    public static final BlockBase LIME_STONE = new BlockBase("lime_stone", 2.0f, 6.0f, Material.STONE, BlockSoundGroup.STONE, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 1);
    public static final SlabBase LIME_STONE_SLAB = new SlabBase("lime_stone_slab", LIME_STONE, ItemGroup.BUILDING_BLOCKS);
    StairBase LIME_STONE_STAIRS = new StairBase(LIME_STONE.getDefaultState(), "lime_stone_stairs", LIME_STONE, ItemGroup.BUILDING_BLOCKS);
}