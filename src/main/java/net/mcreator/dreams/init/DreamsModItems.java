
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreams.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dreams.item.ClozyItemItem;
import net.mcreator.dreams.item.BoredItemItem;
import net.mcreator.dreams.DreamsMod;

public class DreamsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DreamsMod.MODID);
	public static final RegistryObject<Item> BORED_ITEM = REGISTRY.register("bored_item", () -> new BoredItemItem());
	public static final RegistryObject<Item> CLOZY_ITEM = REGISTRY.register("clozy_item", () -> new ClozyItemItem());
	public static final RegistryObject<Item> DREAM_GRASS_BLOCK = block(DreamsModBlocks.DREAM_GRASS_BLOCK);
	public static final RegistryObject<Item> DREAM_DIRT_BLOCK = block(DreamsModBlocks.DREAM_DIRT_BLOCK);
	public static final RegistryObject<Item> DREAM_STONE_BLOCK = block(DreamsModBlocks.DREAM_STONE_BLOCK);
	public static final RegistryObject<Item> MARE_STONE_BLOCK = block(DreamsModBlocks.MARE_STONE_BLOCK);
	public static final RegistryObject<Item> MARE_DIRT_BLOCK = block(DreamsModBlocks.MARE_DIRT_BLOCK);
	public static final RegistryObject<Item> MARE_GRASS_BLOCK = block(DreamsModBlocks.MARE_GRASS_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
