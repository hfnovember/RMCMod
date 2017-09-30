package panickapps.richerminecraft.init.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class TomatoSeeds extends ItemSeeds {

    public TomatoSeeds(String name, Block crops, Block soil) {
        super(crops, soil);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }//end TomatoSeeds()

}//end class TomatoSeeds
