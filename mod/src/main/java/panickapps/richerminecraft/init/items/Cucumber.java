package panickapps.richerminecraft.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import panickapps.richerminecraft.init.BlockInit;

public class Cucumber extends ItemSeedFood {

    public Cucumber(String name) {
        super(2, 0.5F, BlockInit.cucumberCropBlock, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }//end Cucumber()

}//end class Cucumber
