package panickapps.richerminecraft.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panickapps.richerminecraft.handlers.RegistryHandler;

//This class registers items on the server-side.
public class CommonProxy {
	
	//The mod pre-initialization function.
	//Initialize item data here.
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.Common();
	}//end preInit()
	
	
	//The mod initialization function
	//Render graphics here.
	public void init(FMLInitializationEvent event) {
		
	}//end init()
	
	//The mod post-initialization function
	public void postInit(FMLPostInitializationEvent event) {
		
	}//end postInit()

}//end class CommonProxy