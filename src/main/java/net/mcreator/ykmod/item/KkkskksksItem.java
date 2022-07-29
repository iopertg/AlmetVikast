
package net.mcreator.ykmod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

public class KkkskksksItem extends PickaxeItem {
	public KkkskksksItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 69f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 16;
			}

			public int getEnchantmentValue() {
				return 999;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AlmetModItems.AMETISTA_DO_PEDRUX.get()));
			}
		}, 1, 6f, new Item.Properties().tab(AlmetModTabs.TAB_ALMET_TEMERAS).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Verdadeiro poder d\u00E1 KIOMERITA!!!!1!! menos bedrok"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
