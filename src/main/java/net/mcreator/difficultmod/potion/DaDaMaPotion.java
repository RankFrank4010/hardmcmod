
package net.mcreator.difficultmod.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DaDaMaPotion {
	@ObjectHolder("superdifficultmod:da_da_ma")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(Effects.SPEED, 1800, 6, false, true), new EffectInstance(Effects.POISON, 3150, 7, false, true),
					new EffectInstance(Effects.REGENERATION, 2250, 4, false, true), new EffectInstance(Effects.WITHER, 2050, 5, false, true),
					new EffectInstance(Effects.NAUSEA, 4000, 3, false, true), new EffectInstance(Effects.WEAKNESS, 3825, 24, false, true));
			setRegistryName("da_da_ma");
		}
	}
}
