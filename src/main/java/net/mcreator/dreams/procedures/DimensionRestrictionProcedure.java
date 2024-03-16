package net.mcreator.dreams.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DimensionRestrictionProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("dreams:the_world_of_shadows")))) {
			if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("world_of_shadows_monsters"))) || !(entity instanceof Player || entity instanceof ServerPlayer)) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
