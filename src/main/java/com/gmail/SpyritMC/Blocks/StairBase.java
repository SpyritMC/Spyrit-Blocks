package com.gmail.SpyritMC.Blocks;



import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StairBase extends StairsBlock {

    public StairBase(BlockState state, String name, AbstractBlock copy, ItemGroup group) {

        super(state, FabricBlockSettings.copy(copy));
        Registry.register(Registry.BLOCK, new Identifier("spyritblocks", name), this);
        Registry.register(Registry.ITEM,new Identifier("spyritblocks", name), new BlockItem(this, new Item.Settings().maxCount(64).group(group)));

    }
}