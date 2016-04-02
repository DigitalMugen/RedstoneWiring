package com.digitalmugen.redstonewiring.creativetab;

import com.digitalmugen.redstonewiring.init.RedstoneWiringItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Custom creative mode tab for Redstone Wiring mod items and blocks
 * 
 * @author Bill Robitske, Jr. <bill.Robitske.jr@gmail.com>
 *
 */
public class RedstoneWiringCreativeTab extends CreativeTabs {

	/**
	 * Constructs a new Redstone Wiring creating tab
	 * @param index Tab index, used for uniquely identifying tab and positioning in GUI
	 * @param label Tab label, used for displaying a name in the GUI
	 * @see CreativeTabs
	 */
	public RedstoneWiringCreativeTab(int index, String label) {
		super(index, label);
	}

	/**
	 * Returns an item to use as this tab's icon
	 * @return Item to use as this tab's icon
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		/*
		 * TODO: Replace Minecraft's redstone item with Redstone Wire's redstone
		 */
		return RedstoneWiringItems.redironWire;
	}

}
