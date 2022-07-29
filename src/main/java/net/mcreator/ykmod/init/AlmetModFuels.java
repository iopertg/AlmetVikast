
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ykmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class AlmetModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == AlmetModBlocks.MADEIRA_DE_DAVOSTY.get().asItem())
			event.setBurnTime(160000);
	}
}
