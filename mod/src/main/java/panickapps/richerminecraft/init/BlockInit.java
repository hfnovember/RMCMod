package panickapps.richerminecraft.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import panickapps.richerminecraft.Reference;
import panickapps.richerminecraft.RicherMinecraft;
import panickapps.richerminecraft.init.blocks.*;

public class BlockInit {
	
	//DECLARE BLOCKS HERE:
	public static Block copperOre;
	public static CopperBlock copperBlock;
	public static TomatoCropBlock tomatoCropBlock;
	public static CheeseBlock cheeseBlock;
	public static LettuceCropBlock lettuceCropBlock;
	public static UraniumBlock uraniumBlock;
	public static UraniumOre uraniumOre;
	public static CucumberCropBlock cucumberCropBlock;
	public static LemonLogBlock lemonLogBlock;
	public static LemonPlankBlock lemonPlankBlock;
	public static LemonLeavesBlock lemonLeavesBlock;

	public static void init() {
		
		//INITIALIZE BLOCKS HERE:
		copperOre = new CopperOre("copper_ore", 3.0f, 15.0f, 1);
		copperBlock = new CopperBlock("copper_block", 5.0f, 15.0f);
		tomatoCropBlock = new TomatoCropBlock("tomato_crop_block");
		cheeseBlock = new CheeseBlock("cheese_block");
		lettuceCropBlock = new LettuceCropBlock("lettuce_crop_block");
		uraniumBlock = new UraniumBlock("uranium_block", 5.0f, 20f);
		uraniumOre = new UraniumOre("uranium_ore", 7.0f, 25f, 2);
		cucumberCropBlock = new CucumberCropBlock("cucumber_crop_block");
		lemonLogBlock = new LemonLogBlock("lemon_log_block", 3.0f, 10.0f);
		lemonPlankBlock = new LemonPlankBlock("lemon_plank_block", 3.0f, 10.0f);
		lemonLeavesBlock = new LemonLeavesBlock("lemon_leaves_block", 1.0f, 2.0f);

	}//end init()
	
	public static void register() {
		
		//REGISTER BLOCKS HERE:
		registerBlock(copperOre);
		registerBlock(copperBlock);
		registerBlock(tomatoCropBlock);
		registerBlock(cheeseBlock);
		registerBlock(lettuceCropBlock);
		registerBlock(uraniumBlock);
		registerBlock(uraniumOre);
		registerBlock(cucumberCropBlock);
		registerBlock(lemonLeavesBlock);
		registerBlock(lemonLogBlock);
		registerBlock(lemonPlankBlock);
		
	}//end register()
	
	public static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(RicherMinecraft.RMC_TAB);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}//end registerBlock()

    public static void registerBlock(Block block, ItemBlock itemBlock) {
	    ForgeRegistries.BLOCKS.register(block);
	    block.setCreativeTab(RicherMinecraft.RMC_TAB);
	    itemBlock.setRegistryName(block.getRegistryName());
	    ForgeRegistries.ITEMS.register(itemBlock);
	    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }//end registerBlock()

    public static void registerBlockWithVariant(Block block, ItemBlock itemBlock) {
	    ForgeRegistries.BLOCKS.register(block);
	    block.setCreativeTab(RicherMinecraft.RMC_TAB);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);
    }//end registerBlockWithVariant()

    /*public static void registerRenders() {
        for (int i = 0; i < LemonTreePlank.EnumType.values().length; i++) {
            registerRender(lemonTreePlanks, i,"planks_" + LemonTreePlank.EnumType.values()[i].getName());
        }//end for
    }//end registerRenders()

    public static void registerRender(Block block, int meta, String filename) {
	    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), "inventory"));
    }//end registerRender()*/
	
}//end class BlockInit
