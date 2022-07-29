package net.mcreator.ykmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.ykmod.init.AlmetModItems;

public class BcguiproProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(AlmetModItems.WITHER_KILLER.get()))
				: false) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Seres anormais vislumbram seu poder!"), (true));
			if (entity instanceof Player _player) {
				_player.getAbilities().flying = (true);
				_player.onUpdateAbilities();
			}
		}
	}
}
