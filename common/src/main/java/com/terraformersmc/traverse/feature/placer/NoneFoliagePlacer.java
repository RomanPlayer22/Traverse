package com.terraformersmc.traverse.feature.placer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class NoneFoliagePlacer extends FoliagePlacer {
	public static final MapCodec<NoneFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec((instance) -> fillFoliagePlacerFields(instance).apply(instance, (uniformIntDistribution, uniformIntDistribution2) -> new NoneFoliagePlacer()));

	public NoneFoliagePlacer() {
		super(ConstantIntProvider.create(0), ConstantIntProvider.create(0));
	}

	@Override
	protected FoliagePlacerType<?> getType() {
		return TraversePlacerTypes.NONE_FOLIAGE_PLACER;
	}

	@Override
	protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
		// It's the "None" placer, after all...
	}

	@Override
	public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
		return 0;
	}

	@Override
	protected boolean isInvalidForLeaves(Random random, int baseHeight, int dx, int dy, int dz, boolean bl) {
		return false;
	}
}
