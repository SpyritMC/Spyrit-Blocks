package com.gmail.SpyritMC.Blocks;


import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class BlackQuartz {

    public static final BlockBase BLACK_QUARTZ = new BlockBase("black_quartz", 0.8f, 0.8f, Material.STONE, BlockSoundGroup.STONE, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 1);

    public static final SlabBase BLACK_QUARTZ_SLAB = new SlabBase("black_quartz_slab", BLACK_QUARTZ, ItemGroup.BUILDING_BLOCKS);

    public static final StairBase BLACK_QUARTZ_STAIRS = new StairBase(BLACK_QUARTZ.getDefaultState(), "black_quartz_stairs", BLACK_QUARTZ, ItemGroup.BUILDING_BLOCKS);
}