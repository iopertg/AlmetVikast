
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ykmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.ykmod.block.entity.ChaoticTableBBlockEntity;
import net.mcreator.ykmod.block.entity.BancadadecheatBlockEntity;
import net.mcreator.ykmod.AlmetMod;

public class AlmetModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, AlmetMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BANCADADECHEAT = register("bancadadecheat", AlmetModBlocks.BANCADADECHEAT,
			BancadadecheatBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHAOTIC_TABLE_B = register("chaotic_table_b", AlmetModBlocks.CHAOTIC_TABLE_B,
			ChaoticTableBBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
