
package net.mcreator.milenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.milenium.itemgroup.MileniumItemGroup;
import net.mcreator.milenium.MileniumModElements;

@MileniumModElements.ModElement.Tag
public class RodiumshearItem extends MileniumModElements.ModElement {
	@ObjectHolder("milenium:rodiumshear")
	public static final Item block = null;

	public RodiumshearItem(MileniumModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(MileniumItemGroup.tab).maxDamage(4000).isImmuneToFire()) {
			@Override
			public int getItemEnchantability() {
				return 2;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 8f;
			}
		}.setRegistryName("rodiumshear"));
	}
}
