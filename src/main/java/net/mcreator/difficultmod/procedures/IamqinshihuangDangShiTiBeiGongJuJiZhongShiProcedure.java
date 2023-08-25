package net.mcreator.difficultmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.difficultmod.world.dimension.TianYuDimension;
import net.mcreator.difficultmod.SuperdifficultmodMod;

import java.util.Map;

public class IamqinshihuangDangShiTiBeiGongJuJiZhongShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency world for procedure IamqinshihuangDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency x for procedure IamqinshihuangDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency y for procedure IamqinshihuangDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency z for procedure IamqinshihuangDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SuperdifficultmodMod.LOGGER.warn("Failed to load dependency entity for procedure IamqinshihuangDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(
					new DamageSource("\u4F60\u7684\u751F\u547D\u503C\u88AB\u9A97\u8D70\u4E86").setDamageBypassesArmor(), (float) 20);
		}
		if (world instanceof World)
			TianYuDimension.portal.portalSpawn((World) world, new BlockPos(x, y, z));
	}
}
