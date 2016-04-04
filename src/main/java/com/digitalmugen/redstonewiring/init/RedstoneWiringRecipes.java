package com.digitalmugen.redstonewiring.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RedstoneWiringRecipes {

	/**
	 * Register Redstone Wiring crafting recipes during FML post-initialization pass
	 * @param event		FML post-initialization pass event details
	 */
	public static void postInit(FMLPostInitializationEvent event) {
		// Tier 1 - Redstone Clay
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RedstoneWiringItems.redstoneClay), 
				"dustRedstone", Items.clay_ball));
		
		// Tier 2 - Redstone-Enameled Iron
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RedstoneWiringItems.redstoneCoatedIronIngot),
				"RRR",
				"RIR",
				"RRR",
				'R', "dustRedstone", 'I', "ingotIron"));
		GameRegistry.addSmelting(RedstoneWiringItems.redstoneCoatedIronIngot, 
				new ItemStack(RedstoneWiringItems.redstoneEnameledIronIngot), 0);
		
		// Tier 3 - Rediron
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RedstoneWiringItems.redstoneIronDustBlend), 
				"dustRedstone", "dustIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RedstoneWiringItems.redironNugget, 9), 
				"ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RedstoneWiringItems.redironIngot), 
				"NNN", 
				"NNN", 
				"NNN", 
				'N', "nuggetIron"));
		GameRegistry.addSmelting(RedstoneWiringItems.redironDust, 
				new ItemStack(RedstoneWiringItems.redironIngot), 0);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RedstoneWiringItems.wireDrawingDie), 
				"NNN", 
				"N N", 
				"NNN", 
				'N', "nuggetIron"));
	}
}
