package net.nittini.firstmod;

public class Reference {
	public static final String MOD_ID="nnf";
	public static final String NAME="Nittini First Mod";
	public static final String VERSION="1.0";
	public static final String ACCEPTED_VERSIONS="[1.11]";
	
	public static final String CLIENT_PROXY_CLASS="net.nittini.firstmod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS="net.nittini.firstmod.proxy.ServerProxy";
	
	public static enum FirstMODItems {
		CHEESE("cheese", "ItemCheese");
		
		private String unlocalizedName;
		private String registryName;
		
		FirstMODItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
