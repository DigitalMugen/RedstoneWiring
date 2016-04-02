package com.digitalmugen.redstonewiring.block;

import com.digitalmugen.redstonewiring.RedstoneWiringMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRedstoneWire extends Block {

	/**
	 * Constructs a redstone wire block
	 */
	public BlockRedstoneWire() {
		super(Material.circuits);
		
		this.setCreativeTab(RedstoneWiringMod.tabRedstoneWiring);
	}

}
