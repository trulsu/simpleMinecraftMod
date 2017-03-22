package net.nittini.firstmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.nittini.firstmod.Reference;
import net.nittini.firstmod.items.ItemCheese;

public class ModItems {

	public static Item cheese;
	
	public static void init() {
		cheese = new ItemCheese();
	}
	
	public static void register() {
		GameRegistry.register(cheese);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
