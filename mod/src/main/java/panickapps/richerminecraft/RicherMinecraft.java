package panickapps.richerminecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panickapps.richerminecraft.proxy.CommonProxy;
import panickapps.richerminecraft.tabs.RicherMinecraftTab;


//The main class of the mod.
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class RicherMinecraft {

	public static final CreativeTabs RMC_TAB = new RicherMinecraftTab("rmc_tab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}//end preInit()

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}//end init()

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}//end postInit()

}//end class RicherMinecraft
