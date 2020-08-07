package com.gmail.SpyritMC.Blocks;


import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class BloodStone {

    public static final BlockBase BLOOD_STONE_BRICK = new BlockBase("blood_stone_brick", 1.5f, 6.0f, Material.STONE, BlockSoundGroup.STONE, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 1);

    public static final SlabBase BLOOD_STONE_BRICK_SLAB = new SlabBase("blood_stone_brick_slab", BLOOD_STONE_BRICK, ItemGroup.BUILDING_BLOCKS);
}