
package net.mcreator.ykmod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ykmod.init.AlmetModTabs;
import net.mcreator.ykmod.init.AlmetModSounds;

import java.util.List;

public class NewmusicadItem extends RecordItem {
	public NewmusicadItem() {
		super(0, AlmetModSounds.REGISTRY.get(new ResourceLocation("almet:arcadia")),
				new Item.Properties().tab(AlmetModTabs.TAB_ALMET_TEMERAS).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("TheFatRat has all the rights on this Song"));
	}
}
