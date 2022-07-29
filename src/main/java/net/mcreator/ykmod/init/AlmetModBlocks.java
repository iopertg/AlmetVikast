
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ykmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.ykmod.block.RandomLanDPortalBlock;
import net.mcreator.ykmod.block.NO134123Block;
import net.mcreator.ykmod.block.MadeiraDeDavostyBlock;
import net.mcreator.ykmod.block.KiomeritaOreBlock;
import net.mcreator.ykmod.block.ChaoticTableBBlock;
import net.mcreator.ykmod.block.BancadadecheatBlock;
import net.mcreator.ykmod.AlmetMod;

public class AlmetModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlmetMod.MODID);
	public static final RegistryObject<Block> KIOMERITA_ORE = REGISTRY.register("kiomerita_ore", () -> new KiomeritaOreBlock());
	public static final RegistryObject<Block> BANCADADECHEAT = REGISTRY.register("bancadadecheat", () -> new BancadadecheatBlock());
	public static final RegistryObject<Block> NO_134123 = REGISTRY.register("no_134123", () -> new NO134123Block());
	public static final RegistryObject<Block> RANDOM_LAN_D_PORTAL = REGISTRY.register("random_lan_d_portal", () -> new RandomLanDPortalBlock());
	public static final RegistryObject<Block> CHAOTIC_TABLE_B = REGISTRY.register("chaotic_table_b", () -> new ChaoticTableBBlock());
	public static final RegistryObject<Block> MADEIRA_DE_DAVOSTY = REGISTRY.register("madeira_de_davosty", () -> new MadeiraDeDavostyBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			KiomeritaOreBlock.blockColorLoad(event);
		}
	}
}
