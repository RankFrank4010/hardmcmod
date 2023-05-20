package net.mcreator.difficultmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.difficultmod.SuperdifficultmodMod;

import java.util.Map;

public class BrunchoftreeDangWuPinYouWanJiaDiaoLuoProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency entity for procedure BrunchoftreeDangWuPinYouWanJiaDiaoLuo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("\u4F60\u6709\u6CA1\u6709\u6811\u679D\uFF01").setDamageBypassesArmor(),
					(float) 1);
		}
	}
}
