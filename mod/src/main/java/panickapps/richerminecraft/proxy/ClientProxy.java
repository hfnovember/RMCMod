package panickapps.richerminecraft.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panickapps.richerminecraft.handlers.RegistryHandler;

//This class registers items on the client-side.
public class ClientProxy extends CommonProxy {
	
	//The mod pre-initialization function.
	//Initialize item data here.
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}//end preInit()
	
	
	//The mod initialization function
	//Render graphics here.
	public void init(FMLInitializationEvent event) {
		super.init(event);
		RegistryHandler.Client();
	}//end init()
	
	//The mod post-initialization function
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}//end postInit()

}//end class ClientProxy