
package net.mcreator.difficultmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.difficultmod.SuperdifficultmodModElements;

import java.util.List;

@SuperdifficultmodModElements.ModElement.Tag
public class ImissulaodaItem extends SuperdifficultmodModElements.ModElement {
	@ObjectHolder("superdifficultmod:imissulaoda")
	public static final Item block = null;

	public ImissulaodaItem(SuperdifficultmodModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SuperdifficultmodModElements.sounds.get(new ResourceLocation("superdifficultmod:mybrother_laoda")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("imissulaoda");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"\u79D1\u6BD4\u00B7\u5E03\u83B1\u6069\u7279\u662F\u4E00\u4F4D\u5907\u53D7\u5C0A\u656C\u7684NBA\u7BEE\u7403\u8FD0\u52A8\u5458\uFF0C\u4ED6\u7684\u804C\u4E1A\u751F\u6DAF\u5145\u6EE1\u4E86\u6210\u5C31\u548C\u6311\u6218\u3002"));
			list.add(new StringTextComponent("ChatGPT\u7ADF\u7136\u4FAE\u8FB1\u52B3\u5927\uFF01\u6211\u4EEC\u628A\u4ED6\u76D2\u5B50\u5F00\u4E86"));
		}
	}
}
