
package net.mcreator.difficultmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.difficultmod.SuperdifficultmodModElements;

@SuperdifficultmodModElements.ModElement.Tag
public class DDaMaItem extends SuperdifficultmodModElements.ModElement {
	@ObjectHolder("superdifficultmod:d_da_ma")
	public static final Item block = null;

	public DDaMaItem(SuperdifficultmodModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("d_da_ma");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 32;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0.5F;
		}
	}
}
