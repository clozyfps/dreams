
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreams.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dreams.block.DreamStoneBlockBlock;
import net.mcreator.dreams.block.DreamGrassBlockBlock;
import net.mcreator.dreams.block.DreamDirtBlockBlock;
import net.mcreator.dreams.DreamsMod;

public class DreamsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DreamsMod.MODID);
	public static final RegistryObject<Block> DREAM_GRASS_BLOCK = REGISTRY.register("dream_grass_block", () -> new DreamGrassBlockBlock());
	public static final RegistryObject<Block> DREAM_DIRT_BLOCK = REGISTRY.register("dream_dirt_block", () -> new DreamDirtBlockBlock());
	public static final RegistryObject<Block> DREAM_STONE_BLOCK = REGISTRY.register("dream_stone_block", () -> new DreamStoneBlockBlock());
}
