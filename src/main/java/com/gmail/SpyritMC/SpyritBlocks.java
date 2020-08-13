package com.gmail.SpyritMC;

import com.gmail.SpyritMC.Blocks.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class SpyritBlocks implements ModInitializer {
	public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MISC));
	private void handleBiome(Biome biome) {
		if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
			biome.addFeature(
					GenerationStep.Feature.UNDERGROUND_ORES,
					Feature.ORE.configure(
							new OreFeatureConfig(
									OreFeatureConfig.Target.NATURAL_STONE,
									RubyOre.RUBY_ORE.getDefaultState(),
									4 //Ore vein size
							)).createDecoratedFeature(
							Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
									4, //Number of veins per chunk
									0, //Bottom Offset
									5, //Min y level
									20 //Max y level

							))));
			biome.addFeature(
					GenerationStep.Feature.UNDERGROUND_ORES,
					Feature.ORE.configure(
							new OreFeatureConfig(
									OreFeatureConfig.Target.NATURAL_STONE,
									LimeStone.LIME_STONE.getDefaultState(),
									30 //Ore vein size
							)).createDecoratedFeature(
							Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
									15, //Number of veins per chunk
									0, //Bottom Offset
									5, //Min y level
									40 //Max y level
							))));
		}
	}
	@Override
	public void onInitialize() {
		new BloodStone();
		new BlackQuartz();
		new RubyBlock();
		new LimeStone();
		new LimeSmoothStone();
		final Item AMETHYST_SHARD = new Item(new Item.Settings().group(ItemGroup.MISC));
		Registry.register(Registry.ITEM, new Identifier("spyritblocks", "ruby"), RUBY);
		Registry.register(Registry.ITEM, new Identifier("spyritblocks", "amethyst_shard"), AMETHYST_SHARD);
		//Loop over existing biomes
		Registry.BIOME.forEach(this::handleBiome);

		//Listen for other biomes being registered
		RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));
	}
}
