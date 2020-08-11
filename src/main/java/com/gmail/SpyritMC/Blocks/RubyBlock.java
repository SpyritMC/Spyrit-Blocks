package com.gmail.SpyritMC.Blocks;


import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class RubyBlock {

    public static final BlockBase RUBY_BLOCK = new BlockBase("ruby_block", 5.0f, 6.0f, Material.STONE, BlockSoundGroup.STONE, ItemGroup.BUILDING_BLOCKS, FabricToolTags.PICKAXES, 3);
}