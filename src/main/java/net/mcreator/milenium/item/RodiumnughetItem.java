
package net.mcreator.milenium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.milenium.itemgroup.MileniumItemGroup;
import net.mcreator.milenium.MileniumModElements;

@MileniumModElements.ModElement.Tag
public class RodiumnughetItem extends MileniumModElements.ModElement {
	@ObjectHolder("milenium:rodiumnughet")
	public static final Item block = null;

	public RodiumnughetItem(MileniumModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MileniumItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("rodiumnughet");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
