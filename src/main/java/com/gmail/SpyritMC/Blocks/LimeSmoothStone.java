package com.gmail.SpyritMC.Blocks;


import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class LimeSmoothStone {

    public static final BlockBase LIME_SMOOTH_STONE = new BlockBase("lime_smooth_stone", 1.5f, 6.0f, Material.STONE, BlockSoundGroup.STONE, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 1);
    public static final SlabBase LIME_SMOOTH_STONE_SLAB = new SlabBase("lime_smooth_stone_slab", LIME_SMOOTH_STONE, ItemGroup.BUILDING_BLOCKS);
    public static final StairBase LIME_SMOOTH_STONE_STAIRS = new StairBase(LIME_SMOOTH_STONE.getDefaultState(), "lime_smooth_stone_stairs", LIME_SMOOTH_STONE, ItemGroup.BUILDING_BLOCKS);
}