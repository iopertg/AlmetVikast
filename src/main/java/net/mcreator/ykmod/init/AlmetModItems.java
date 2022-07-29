
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ykmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ykmod.item.WitherKillerItem;
import net.mcreator.ykmod.item.RandomLanDItem;
import net.mcreator.ykmod.item.NewmusicadItem;
import net.mcreator.ykmod.item.KkkskksksItem;
import net.mcreator.ykmod.item.KiomeritaItem;
import net.mcreator.ykmod.item.KayvmetitaBrutaItem;
import net.mcreator.ykmod.item.KPickaxeItem;
import net.mcreator.ykmod.item.DdddddItem;
import net.mcreator.ykmod.item.AmetistaDoPedruxItem;
import net.mcreator.ykmod.AlmetMod;

public class AlmetModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlmetMod.MODID);
	public static final RegistryObject<Item> DDDDDD = REGISTRY.register("dddddd", () -> new DdddddItem());
	public static final RegistryObject<Item> WITHER_KILLER = REGISTRY.register("wither_killer", () -> new WitherKillerItem());
	public static final RegistryObject<Item> KIOMERITA = REGISTRY.register("kiomerita", () -> new KiomeritaItem());
	public static final RegistryObject<Item> KIOMERITA_ORE = block(AlmetModBlocks.KIOMERITA_ORE, AlmetModTabs.TAB_ALMET_TEMERAS);
	public static final RegistryObject<Item> AMETISTA_DO_PEDRUX = REGISTRY.register("ametista_do_pedrux", () -> new AmetistaDoPedruxItem());
	public static final RegistryObject<Item> NEWMUSICAD = REGISTRY.register("newmusicad", () -> new NewmusicadItem());
	public static final RegistryObject<Item> BANCADADECHEAT = block(AlmetModBlocks.BANCADADECHEAT, AlmetModTabs.TAB_ALMET_TEMERAS);
	public static final RegistryObject<Item> K_PICKAXE = REGISTRY.register("k_pickaxe", () -> new KPickaxeItem());
	public static final RegistryObject<Item> KKKSKKSKS = REGISTRY.register("kkkskksks", () -> new KkkskksksItem());
	public static final RegistryObject<Item> NO_134123 = block(AlmetModBlocks.NO_134123, AlmetModTabs.TAB_ALMET_TEMERAS);
	public static final RegistryObject<Item> KAYVMETITA_BRUTA = REGISTRY.register("kayvmetita_bruta", () -> new KayvmetitaBrutaItem());
	public static final RegistryObject<Item> RANDOM_LAN_D = REGISTRY.register("random_lan_d", () -> new RandomLanDItem());
	public static final RegistryObject<Item> CHAOTIC_TABLE_B = block(AlmetModBlocks.CHAOTIC_TABLE_B, AlmetModTabs.TAB_ALMET_TEMERAS);
	public static final RegistryObject<Item> MADEIRA_DE_DAVOSTY = block(AlmetModBlocks.MADEIRA_DE_DAVOSTY, AlmetModTabs.TAB_ALMET_TEMERAS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
