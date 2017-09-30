package panickapps.richerminecraft.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import panickapps.richerminecraft.init.ArmorInit;
import panickapps.richerminecraft.init.BlockInit;
import panickapps.richerminecraft.init.ItemInit;
import panickapps.richerminecraft.init.ToolInit;

public class RecipeHandler {

    /**************************************************************************************************************/
    /**************************************************************************************************************/
    /**************************************************************************************************************/

    /**
     * REGISTER CRAFTING RECIPES HERE
     */
    public static void registerCrafting() {

        //------------------------------------------------------------------
        //1 Copper Block from 9 Copper Ingots:
        GameRegistry.addShapedRecipe(
                new ResourceLocation("rmc:copper_block"), //Name of outputted resource
                new ResourceLocation("rmc:copper_blocks"), //Group name of outputted resource
                new ItemStack(BlockInit.copperBlock), //Object of outputted resource
                new Object[] { "SSS", "SSS", "SSS", 'S', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );
        //------------------------------------------------------------------
        //Copper Armor:
        registerArmorCrafting(ArmorInit.copperHelmet, ArmorInit.copperChestplate, ArmorInit.copperLeggings, ArmorInit.copperBoots, ItemInit.copperIngot);
        //------------------------------------------------------------------
        //Copper Tools:
        registerToolCrafting(ToolInit.copperAxe, ToolInit.copperHoe, ToolInit.copperPickaxe, ToolInit.copperShovel, ToolInit.copperSword, ItemInit.copperIngot);
        //------------------------------------------------------------------
        //9 Copper ingots from 1 Copper Block:
        GameRegistry.addShapelessRecipe(
                new ResourceLocation("rmc:copper_ingot"), //Name of outputted resource
                new ResourceLocation("rmc:copper_items"), //Group name of outputted resource
                new ItemStack(ItemInit.copperIngot, 9), //Object of outputted resource + amount
                new Ingredient[] {
                        Ingredient.fromItem(Item.getItemFromBlock(BlockInit.copperBlock))
                        /* More ingredients can be added here */
                } //Ingredient to place anywhere in the crafting table.
        );
        //------------------------------------------------------------------
        //2 Tomato seeds from 1 Tomato:
        GameRegistry.addShapelessRecipe(
                new ResourceLocation("rmc:tomato_seeds"),
                new ResourceLocation("rmc:crops"),
                new ItemStack(ItemInit.tomatoSeeds, 2),
                new Ingredient[]{
                        Ingredient.fromItem(ItemInit.tomato)
                }//end Ingredient[]
        );
        //------------------------------------------------------------------
        //9 Cheese Slices from 1 Cheese Block:
        GameRegistry.addShapelessRecipe(
                new ResourceLocation("rmc:cheese_slice"),
                new ResourceLocation("rmc:food"),
                new ItemStack(ItemInit.cheeseSlice, 9),
                new Ingredient[]{
                        Ingredient.fromItem(Item.getItemFromBlock(BlockInit.cheeseBlock))
                }//end Ingredient[]
        );
        //------------------------------------------------------------------
        //1 Cheese Block from 9 Cheese Slices:
        GameRegistry.addShapedRecipe(
                new ResourceLocation("rmc:cheese_block"),
                new ResourceLocation("rmc:cheese_block"),
                new ItemStack(BlockInit.cheeseBlock),
                new Object[] { "SSS", "SSS", "SSS", 'S', ItemInit.cheeseSlice }
        );
        //------------------------------------------------------------------
        //4 ham from 1 raw pork chop
        GameRegistry.addShapelessRecipe(
                new ResourceLocation("rmc:ham"),
                new ResourceLocation("rmc:food"),
                new ItemStack(ItemInit.ham, 4),
                new Ingredient[]{
                        Ingredient.fromItem(Items.PORKCHOP)
                }//end Ingredient[]
        );
        //------------------------------------------------------------------

    }//end registerCrafting()

    /**************************************************************************************************************/
    /**************************************************************************************************************/
    /**************************************************************************************************************/

    /**
     * REGISTER SMELTING RECIPES HERE
     */
    public static void registerSmelting() {

        //------------------------------------------------------------------
        //1 Copper Ingot from 1 Copper Ore:
        GameRegistry.addSmelting(
                BlockInit.copperOre,
                new ItemStack(ItemInit.copperIngot),
                10
        );
        //------------------------------------------------------------------
        //1 Cheese Block from 1 Milk Bucket
        GameRegistry.addSmelting(
                Items.MILK_BUCKET,
                new ItemStack(Item.getItemFromBlock(BlockInit.cheeseBlock)),
                10
        );
        //------------------------------------------------------------------
        //8 Salt from 1 Water Bucket
        GameRegistry.addSmelting(
                Items.WATER_BUCKET,
                new ItemStack(ItemInit.salt, 8),
                10
        );
        //------------------------------------------------------------------

    }//end registerSmelting()

    /**************************************************************************************************************/
    /**************************************************************************************************************/
    /**************************************************************************************************************/

    /**
     * REGISTER TOOL CRAFTING HERE
     */
    private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item ingot) {

        //Copper Axe
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + axe.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_tools"), //Group name of outputted resource
                new ItemStack(axe), //Object of outputted resource
                new Object[] { "II ", "IS ", " S ", 'S', Items.STICK, 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

        //Copper Hoe
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + hoe.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_tools"), //Group name of outputted resource
                new ItemStack(hoe), //Object of outputted resource
                new Object[] { "II ", " S ", " S ", 'S', Items.STICK, 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

        //Copper pickaxe
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + pickaxe.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_tools"), //Group name of outputted resource
                new ItemStack(pickaxe), //Object of outputted resource
                new Object[] { "III", " S ", " S ", 'S', Items.STICK, 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

        //Copper shovel
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + shovel.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_tools"), //Group name of outputted resource
                new ItemStack(shovel), //Object of outputted resource
                new Object[] { " I ", " S ", " S ", 'S', Items.STICK, 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

        //Copper sword
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + sword.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_tools"), //Group name of outputted resource
                new ItemStack(sword), //Object of outputted resource
                new Object[] { " I ", " I ", " S ", 'S', Items.STICK, 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

    }//end registerToolCrafting()

    /**
     * REGISTER ARMOR CRAFTING HERE
     */
    private static void registerArmorCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {

        //Copper helmet
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + helmet.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_armor"), //Group name of outputted resource
                new ItemStack(helmet), //Object of outputted resource
                new Object[] { "III", "I I", "   ", 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

        //Copper chestplate
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + chestplate.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_armor"), //Group name of outputted resource
                new ItemStack(chestplate), //Object of outputted resource
                new Object[] { "I I", "III", "III", 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

        //Copper leggings
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + leggings.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_armor"), //Group name of outputted resource
                new ItemStack(leggings), //Object of outputted resource
                new Object[] { "III", "I I", "I I", 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

        //Copper boots
        GameRegistry.addShapedRecipe(
                new ResourceLocation("" + boots.getRegistryName()), //Name of outputted resource
                new ResourceLocation("rmc:copper_armor"), //Group name of outputted resource
                new ItemStack(boots), //Object of outputted resource
                new Object[] { "   ", "I I", "I I", 'I', ItemInit.copperIngot }
                //3x3 table with letters, then define what resource each letter stands for.
        );

    }//end registerArmorCrafting()

}//end class RecipeHandler
