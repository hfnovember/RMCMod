package panickapps.richerminecraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panickapps.richerminecraft.Reference;
import panickapps.richerminecraft.RicherMinecraft;
import panickapps.richerminecraft.init.armor.CopperArmor;
import panickapps.richerminecraft.init.items.CopperIngot;


public class ArmorInit {

    //ARMOR MATERIALS:
    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("copper_armor",Reference.MOD_ID + ":mod", 10, new int[]{1, 3, 5, 7}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F);

    //DECLARE THE ITEMS HERE:
    public static Item copperHelmet, copperChestplate, copperLeggings, copperBoots;

    public static void init() {

        //INITIALIZE THE ITEMS HERE:
        copperHelmet = new CopperArmor("copper_helmet", copperArmorMaterial, 1, EntityEquipmentSlot.HEAD);
        copperChestplate = new CopperArmor("copper_chestplate", copperArmorMaterial, 1, EntityEquipmentSlot.CHEST);
        copperLeggings = new CopperArmor("copper_leggings", copperArmorMaterial, 1, EntityEquipmentSlot.LEGS);
        copperBoots = new CopperArmor("copper_boots", copperArmorMaterial, 2, EntityEquipmentSlot.FEET);

    }//end init()

    public static void register() {

        //REGISTER ITEMS HERE:
        registerItem(copperHelmet);
        registerItem(copperChestplate);
        registerItem(copperBoots);
        registerItem(copperLeggings);

    }//end register()

    public static void registerItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
        item.setCreativeTab(RicherMinecraft.RMC_TAB);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }//end registerItem()

}//end class ArmorInit
