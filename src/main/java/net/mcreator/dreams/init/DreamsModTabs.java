
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreams.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.dreams.DreamsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DreamsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DreamsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DreamsModBlocks.DREAM_GRASS_BLOCK.get().asItem());
			tabData.accept(DreamsModBlocks.DREAM_DIRT_BLOCK.get().asItem());
			tabData.accept(DreamsModBlocks.DREAM_STONE_BLOCK.get().asItem());
		}
	}
}
