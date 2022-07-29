
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ykmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.ykmod.world.features.ores.NO134123Feature;
import net.mcreator.ykmod.world.features.ores.KiomeritaOreFeature;
import net.mcreator.ykmod.world.features.TemploDaDeusaDaAguaFeature;
import net.mcreator.ykmod.AlmetMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class AlmetModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AlmetMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> KIOMERITA_ORE = register("kiomerita_ore", KiomeritaOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, KiomeritaOreFeature.GENERATE_BIOMES, KiomeritaOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NO_134123 = register("no_134123", NO134123Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NO134123Feature.GENERATE_BIOMES, NO134123Feature::placedFeature));
	public static final RegistryObject<Feature<?>> TEMPLO_DA_DEUSA_DA_AGUA = register("templo_da_deusa_da_agua", TemploDaDeusaDaAguaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, TemploDaDeusaDaAguaFeature.GENERATE_BIOMES,
					TemploDaDeusaDaAguaFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
