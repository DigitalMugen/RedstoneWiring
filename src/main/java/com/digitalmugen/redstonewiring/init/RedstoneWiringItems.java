package com.digitalmugen.redstonewiring.init;

import com.digitalmugen.redstonewiring.RedstoneWiringMod;
import com.digitalmugen.redstonewiring.item.ItemRedironWire;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class RedstoneWiringItems {
	public static Item redironWire;

	private static final String redironWireName = "item_rediron_wire";

	public static void preInit(FMLPreInitializationEvent event) {
		redironWire = registerItem(new ItemRedironWire(), redironWireName);
	}

	public static void postInit(FMLPostInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

			registerItemRenderItem(renderItem, redironWire, redironWireName);
		}
	}

	private static Item registerItem(Item item, String name) {
		item.setUnlocalizedName(RedstoneWiringMod.MODID + "." + name);
		GameRegistry.registerItem(item, name);
		return item;
	}

	private static void registerItemRenderItem(RenderItem renderItem, Item item, String name) {
		renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(RedstoneWiringMod.MODID + ":" + name, "inventory"));
	}
}
