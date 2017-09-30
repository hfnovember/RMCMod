package panickapps.richerminecraft.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CheeseSlice extends ItemFood {

    public CheeseSlice(String name) {
        super(2, 0.5F, false);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }//end CheeseSlice()

}//end class CheeseSlice
