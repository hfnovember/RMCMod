package panickapps.richerminecraft.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import panickapps.richerminecraft.gen.CopperOreGen;
import panickapps.richerminecraft.gen.UraniumOreGen;
import panickapps.richerminecraft.init.ArmorInit;
import panickapps.richerminecraft.init.BlockInit;
import panickapps.richerminecraft.init.ItemInit;
import panickapps.richerminecraft.init.ToolInit;

//Registers items into Minecraft.
public class RegistryHandler {

	//Initialize these items on the client side.
	public static void Client() {



	}//end Client()
	
	//Initialize these items on the server side.
	public static void Common() {

		BlockInit.init();
		BlockInit.register();
		
		ItemInit.init();
		ItemInit.register();

		ToolInit.init();
		ToolInit.register();

		ArmorInit.init();
		ArmorInit.register();

		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();

		GameRegistry.registerWorldGenerator(new CopperOreGen(), 0);
		GameRegistry.registerWorldGenerator(new UraniumOreGen(), 0);
		
	}//end Common()
	
}//end class RegistryHandler
