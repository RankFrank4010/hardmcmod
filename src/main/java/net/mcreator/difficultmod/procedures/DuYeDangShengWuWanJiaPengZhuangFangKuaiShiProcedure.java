package net.mcreator.difficultmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.difficultmod.SuperdifficultmodMod;

import java.util.Map;

public class DuYeDangShengWuWanJiaPengZhuangFangKuaiShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency entity for procedure DuYeDangShengWuWanJiaPengZhuangFangKuaiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("\u4F60\u88AB\u6BD2\u6DB2\u6BD2\u6B7B\u4E86\u3002").setDamageBypassesArmor(),
					(float) 5);
		}
	}
}
