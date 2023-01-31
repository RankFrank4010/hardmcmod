
package net.mcreator.difficultmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.difficultmod.SuperdifficultmodModElements;

import java.util.List;

@SuperdifficultmodModElements.ModElement.Tag
public class OnlyalloypickaxeItem extends SuperdifficultmodModElements.ModElement {
	@ObjectHolder("superdifficultmod:onlyalloypickaxe")
	public static final Item block = null;

	public OnlyalloypickaxeItem(SuperdifficultmodModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4062;
			}

			public float getEfficiency() {
				return 80f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 500;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -1f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("made only of alloy"));
			}
		}.setRegistryName("onlyalloypickaxe"));
	}
}
