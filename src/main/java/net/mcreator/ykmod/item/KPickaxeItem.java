
package net.mcreator.ykmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ykmod.init.AlmetModTabs;
import net.mcreator.ykmod.init.AlmetModItems;

import java.util.List;

public class KPickaxeItem extends PickaxeItem {
	public KPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 270;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 3;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AlmetModItems.AMETISTA_DO_PEDRUX.get()));
			}
		}, 1, -3f, new Item.Properties().tab(AlmetModTabs.TAB_ALMET_TEMERAS).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Inutilidade em pessoa? sim"));
		list.add(new TextComponent("Picareta de netherite piorada!"));
	}
}
