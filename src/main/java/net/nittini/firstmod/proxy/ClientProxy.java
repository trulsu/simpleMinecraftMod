package net.nittini.firstmod.proxy;

import net.nittini.firstmod.init.ModItems;

public class ClientProxy implements CommonProxy {

	// This should only be done on the client
	public void init() {
		ModItems.registerRenders();
	}
	
}
