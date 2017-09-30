package panickapps.richerminecraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panickapps.richerminecraft.RicherMinecraft;
import panickapps.richerminecraft.init.items.CopperIngot;
import panickapps.richerminecraft.init.tools.*;

public class ToolInit {

    //TOOL MATERIALS:
    public static final Item.ToolMaterial copperPickaxeMaterial  = EnumHelper.addToolMaterial("copper_pickaxe", 1, 180, 5.0F, 3.0F, 8);

    //DECLARE THE ITEMS HERE:
    public static Item copperPickaxe, copperAxe, copperSword, copperShovel, copperHoe;

    public static void init() {

        //INITIALIZE THE ITEMS HERE:
        copperPickaxe = new CopperPickaxe("copper_pickaxe", copperPickaxeMaterial);
        copperAxe = new CopperAxe("copper_axe", copperPickaxeMaterial);
        copperSword = new CopperSword("copper_sword", copperPickaxeMaterial);
        copperShovel = new CopperShovel("copper_shovel", copperPickaxeMaterial);
        copperHoe = new CopperHoe("copper_hoe", copperPickaxeMaterial);

    }//end init()

    public static void register() {

        //REGISTER ITEMS HERE:
        registerItem(copperPickaxe);
        registerItem(copperAxe);
        registerItem(copperHoe);
        registerItem(copperSword);
        registerItem(copperShovel);

    }//end register()

    public static void registerItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
        item.setCreativeTab(RicherMinecraft.RMC_TAB);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }//end registerItem()

}//end class ToolInit