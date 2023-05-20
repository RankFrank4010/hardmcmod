package net.mcreator.difficultmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.difficultmod.SuperdifficultmodMod;

import java.util.Map;

public class BrunchoftreeDangWuPinBeiHeChengHuoShaoLianShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency entity for procedure BrunchoftreeDangWuPinBeiHeChengHuoShaoLianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(
					new DamageSource("\u4F60\u56E0\u4E3A\u6CA1\u6709\u6811\u679D\u800C\u6B7B\u4EA1\u4E86\u3002").setDamageBypassesArmor(), (float) 5);
		}
	}
}
