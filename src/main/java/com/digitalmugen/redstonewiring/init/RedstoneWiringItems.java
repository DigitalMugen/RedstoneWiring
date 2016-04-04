package com.digitalmugen.redstonewiring.init;

import com.digitalmugen.redstonewiring.RedstoneWiringMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Collection of items added by Redstone Wiring
 * 
 * @author Bill Robitske, Jr. <bill.robitske.jr@gmail.com>
 *
 */
public class RedstoneWiringItems {
	public static Item redstoneClay;
	public static Item redstoneCoatedIronIngot;
	public static Item redstoneEnameledIronIngot;
	public static Item redstoneIronDustBlend;
	public static Item redironIngot;
	public static Item redironNugget;
	public static Item redironDust;
	public static Item redironWireSpool;
	public static Item wireDrawingDie;
	
	/**
	 * FML pre-initialization configuration of Redstone Wiring items
	 * @param event	FML's pre-initialization pass event details
	 */
	public static void preInit(FMLPreInitializationEvent event) {
		redstoneClay = registerItem(new Item(), RedstoneWiringRegistryNames.redstoneClay, null);
		redstoneCoatedIronIngot = registerItem(new Item(), RedstoneWiringRegistryNames.redstoneCoatedIronIngot, null);
		redstoneEnameledIronIngot = registerItem(new Item(), RedstoneWiringRegistryNames.redstoneEnameledIronIngot, null);
		redironIngot = registerItem(new Item(), RedstoneWiringRegistryNames.redironIngot, "ingotRediron");
		redironNugget = registerItem(new Item(), RedstoneWiringRegistryNames.redironNugget, "nuggetRediron");
		redironDust = registerItem(new Item(), RedstoneWiringRegistryNames.redironDust, "dustRediron");
		redironWireSpool = registerItem(new Item(), RedstoneWiringRegistryNames.redironWireSpool, null);
		wireDrawingDie = registerItem(new Item(), RedstoneWiringRegistryNames.wireDrawingDie, null);
	}

	/**
	 * FML post-initialization configuration of Redstone Wiring items
	 * @param event	FML's post-initialization pass event details
	 */
	public static void postInit(FMLPostInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

			registerItemRenderItem(renderItem, redstoneClay);
			registerItemRenderItem(renderItem, redstoneCoatedIronIngot);
			registerItemRenderItem(renderItem, redstoneEnameledIronIngot);
			registerItemRenderItem(renderItem, redironIngot);
			registerItemRenderItem(renderItem, redironNugget);
			registerItemRenderItem(renderItem, redironDust);
			registerItemRenderItem(renderItem, redironWireSpool);
			registerItemRenderItem(renderItem, wireDrawingDie);
		}
	}

	/**
	 * Registers an item for Minecraft as part of Redstone Wiring
	 * @param item	Item to be configured and registered
	 * @param name	Unique name to register the item under
	 * @return		The registered item
	 */
	private static Item registerItem(Item item, String name, String oreDictName) {
		item.setUnlocalizedName(RedstoneWiringMod.MODID + "." + name);
		item.setCreativeTab(RedstoneWiringMod.tabRedstoneWiring);
		GameRegistry.registerItem(item, name);
		if (oreDictName != null) {
			OreDictionary.registerOre(oreDictName, new ItemStack(item));
		}
		return item;
	}

	/**
	 * Registers an item for rendering in Minecraft
	 * @param renderItem	Minecraft's render item
	 * @param item			Item to be registered for rendering
	 * @param name			Item's registry name
	 */
	private static void registerItemRenderItem(RenderItem renderItem, Item item) {
		renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
