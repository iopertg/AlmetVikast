
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ykmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AlmetModTabs {
	public static CreativeModeTab TAB_ALMET_TEMERAS;

	public static void load() {
		TAB_ALMET_TEMERAS = new CreativeModeTab("tabalmet_temeras") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AlmetModItems.DDDDDD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
