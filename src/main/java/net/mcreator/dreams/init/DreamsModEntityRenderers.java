
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreams.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dreams.client.renderer.DarkLifeFragmentRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DreamsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DreamsModEntities.DARK_LIFE_FRAGMENT.get(), DarkLifeFragmentRenderer::new);
	}
}
