
package net.mcreator.difficultmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.difficultmod.SuperdifficultmodModElements;

@SuperdifficultmodModElements.ModElement.Tag
public class OnlyforikunItem extends SuperdifficultmodModElements.ModElement {
	@ObjectHolder("superdifficultmod:onlyforikun")
	public static final Item block = null;

	public OnlyforikunItem(SuperdifficultmodModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SuperdifficultmodModElements.sounds.get(new ResourceLocation("superdifficultmod:kunkun_my_idol")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("onlyforikun");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
