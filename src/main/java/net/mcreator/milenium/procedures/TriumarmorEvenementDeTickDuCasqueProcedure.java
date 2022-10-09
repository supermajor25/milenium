package net.mcreator.milenium.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.milenium.MileniumMod;

import java.util.Map;

public class TriumarmorEvenementDeTickDuCasqueProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MileniumMod.LOGGER.warn("Failed to load dependency entity for procedure TriumarmorEvenementDeTickDuCasque!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 60, (int) 2));
	}
}
