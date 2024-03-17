package net.mcreator.dreams.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.dreams.network.DreamsModVariables;

public class FullMoonWarningProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.dimensionType().moonPhase(world.dayTime()) == 0 && !(entity.getCapability(DreamsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DreamsModVariables.PlayerVariables())).Warning
				&& !(world instanceof Level _lvl1 && _lvl1.isDay())) {
			{
				boolean _setval = true;
				entity.getCapability(DreamsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Warning = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7l\u00A70A full moon rises.. dreams are stronger than ever."), true);
		} else if (world.dimensionType().moonPhase(world.dayTime()) == 4 && !(entity.getCapability(DreamsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DreamsModVariables.PlayerVariables())).Warning
				&& !(world instanceof Level _lvl4 && _lvl4.isDay())) {
			{
				boolean _setval = true;
				entity.getCapability(DreamsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Warning = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7l\u00A70The night is new.. dreams roam the dark."), true);
		} else if (!(world.dimensionType().moonPhase(world.dayTime()) == 0) && (entity.getCapability(DreamsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DreamsModVariables.PlayerVariables())).Warning) {
			{
				boolean _setval = false;
				entity.getCapability(DreamsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Warning = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
