package net.nittini.firstmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.nittini.firstmod.init.ModItems;
import net.nittini.firstmod.proxy.CommonProxy;

@Mod(modid=Reference.MOD_ID, name=Reference.NAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS)
public class FirstMOD {

	@Instance
	public static FirstMOD instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy; // Will be initialized by Forge
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("preInit");	
		ModItems.init();
		ModItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("init");
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("post");
	}
}
