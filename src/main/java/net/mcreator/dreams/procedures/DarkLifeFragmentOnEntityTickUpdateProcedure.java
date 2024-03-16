package net.mcreator.dreams.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DarkLifeFragmentOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 10, 2, 2, 2, 0.4);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 1, 2, 2, 2, 0.4);
	}
}
