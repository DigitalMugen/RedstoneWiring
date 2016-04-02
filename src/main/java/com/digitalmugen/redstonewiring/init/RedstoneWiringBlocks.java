package com.digitalmugen.redstonewiring.init;

import com.digitalmugen.redstonewiring.RedstoneWiringMod;
import com.digitalmugen.redstonewiring.block.BlockRedironWire;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Redstone Wiring's blocks
 * 
 * @author Bill Robitske, Jr. <bill.robitske.jr@gmail.com>
 *
 */
public class RedstoneWiringBlocks {
	public static Block redironWire;
	
	private static final String redironWireName = "block_rediron_wire";

	/**
	 * Pre-initialization of Redstone Wire blocks
	 * @param event FML pre-initialization event details
	 */
	public static void preInit(FMLPreInitializationEvent event) {
		redironWire = registerBlock(new BlockRedironWire(), redironWireName);
	}

	/**
	 * Post-initialization of Redstone Wire blocks
	 * @param event FML post-initialization event details
	 */
	public static void postInit(FMLPostInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

			registerBlockRenderItem(renderItem, redironWire, redironWireName);
		}
	}

	/**
	 * Registers a block with the GameRegistry
	 * @param block Block to be registered
	 * @param name	Unique name of the block
	 * @return		Registered block
	 */
	private static Block registerBlock(Block block, String name) {
		block.setUnlocalizedName(RedstoneWiringMod.MODID + "." + name);
		GameRegistry.registerBlock(block, name);
		return block;
	}

	/**
	 * Registers the rendering of a block as an item
	 * @param renderItem	Minecraft's renderItem
	 * @param block			Block to be registered as an item
	 * @param name			Unique name of the block
	 */
	private static void registerBlockRenderItem(RenderItem renderItem, Block block, String name) {
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(RedstoneWiringMod.MODID + ":" + name, "inventory"));
	}
}
