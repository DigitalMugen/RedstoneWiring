package com.digitalmugen.redstonewiring;

import com.digitalmugen.redstonewiring.creativetab.RedstoneWiringCreativeTab;
import com.digitalmugen.redstonewiring.init.RedstoneWiringBlocks;
import com.digitalmugen.redstonewiring.init.RedstoneWiringItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Redstone Wiring -- because there must be a better way of transporting
 * redstone signals than pouring dust on the ground.
 * 
 * @author Bill Robitske, Jr. <bill.robitske.jr@gmail.com>
 * @version 1.9-1.0.0
 *
 */
@Mod(modid = RedstoneWiringMod.MODID, name = RedstoneWiringMod.MODNAME, version = RedstoneWiringMod.VERSION)
public class RedstoneWiringMod {
	public static final String MODID = "dm_redstonewiring";
	public static final String MODNAME = "Redstone Wiring";
	public static final String VERSION = "1.9-1.0.0";

	public static CreativeTabs tabRedstoneWiring = new RedstoneWiringCreativeTab(CreativeTabs.getNextID(),
			MODID + ".creative_tab");

	/**
	 * Main Minecraft Forge pre-initialization pass handler
	 * 
	 * @param event
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RedstoneWiringBlocks.preInit(event);
		RedstoneWiringItems.preInit(event);
	}

	/**
	 * Main Minecraft Forge initialization pass handler
	 * 
	 * @param event
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	/**
	 * Main Minecraft Forge post-initialization pass handler
	 * 
	 * @param event
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		RedstoneWiringBlocks.postInit(event);
		RedstoneWiringItems.postInit(event);
	}
}
