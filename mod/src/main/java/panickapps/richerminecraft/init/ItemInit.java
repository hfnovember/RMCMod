package panickapps.richerminecraft.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import panickapps.richerminecraft.Reference;
import panickapps.richerminecraft.RicherMinecraft;
import panickapps.richerminecraft.init.items.*;

public class ItemInit {
	
	//DECLARE THE ITEMS HERE:
	public static Item copperIngot;
	public static Item tomato;
	public static Item tomatoSeeds;
	public static Item cheeseSlice;
	public static Item ham;
	public static Item lettuce;
	public static Item uraniumIngot;
	public static Item cucumber;
	public static Item salt;

	public static void init() {
		
		//INITIALIZE THE ITEMS HERE:
		copperIngot = new CopperIngot("copper_ingot");
		tomato = new Tomato("tomato");
		tomatoSeeds = new TomatoSeeds("tomato_seeds", BlockInit.tomatoCropBlock, Blocks.FARMLAND);
		cheeseSlice = new CheeseSlice("cheese_slice");
		ham = new Ham("ham");
		lettuce = new Lettuce("lettuce");
		uraniumIngot = new UraniumIngot("uranium_ingot");
		cucumber = new Cucumber("cucumber");
		salt = new Salt("salt");
		
	}//end init()

	public static void register() {
		
		//REGISTER ITEMS HERE:
		registerItem(copperIngot);
		registerItem(tomato);
		registerItem(tomatoSeeds);
		registerItem(cheeseSlice);
		registerItem(ham);
		registerItem(lettuce);
		registerItem(uraniumIngot);
		registerItem(cucumber);
		registerItem(salt);
		
	}//end register()
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(RicherMinecraft.RMC_TAB);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}//end registerItem()
	
}//end class ItemInit