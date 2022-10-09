
package net.mcreator.milenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.milenium.itemgroup.MileniumItemGroup;
import net.mcreator.milenium.MileniumModElements;

@MileniumModElements.ModElement.Tag
public class RodiumaxeItem extends MileniumModElements.ModElement {
	@ObjectHolder("milenium:rodiumaxe")
	public static final Item block = null;

	public RodiumaxeItem(MileniumModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RodiumingotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(MileniumItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("rodiumaxe"));
	}
}
