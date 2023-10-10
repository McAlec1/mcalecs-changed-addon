
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalec.changedaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcalec.changedaddon.item.PrideBalloonItem;
import net.mcalec.changedaddon.item.DevItemItem;
import net.mcalec.changedaddon.item.BaseballBatToolItem;
import net.mcalec.changedaddon.item.AddonBookItem;
import net.mcalec.changedaddon.McalecsChangedMod;

public class McalecsChangedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McalecsChangedMod.MODID);
	public static final RegistryObject<Item> BASEBALL_BAT = REGISTRY.register("baseball_bat", () -> new BaseballBatToolItem());
	public static final RegistryObject<Item> ADDON_BOOK = REGISTRY.register("addon_book", () -> new AddonBookItem());
	public static final RegistryObject<Item> DEV_ITEM = REGISTRY.register("dev_item", () -> new DevItemItem());
	public static final RegistryObject<Item> DEV_ENTITY_TEST_SPAWN_EGG = REGISTRY.register("dev_entity_test_spawn_egg",
			() -> new ForgeSpawnEggItem(McalecsChangedModEntities.DEV_ENTITY_TEST, -13875586, -11253505, new Item.Properties().tab(McalecsChangedModTabs.TAB_MCALECS_CHANGED_TAB)));
	public static final RegistryObject<Item> PRIDE_BALLOON = REGISTRY.register("pride_balloon", () -> new PrideBalloonItem());
}