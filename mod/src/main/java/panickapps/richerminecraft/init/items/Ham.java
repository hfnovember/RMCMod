package panickapps.richerminecraft.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Ham extends ItemFood {

    public Ham(String name) {
        super(2, 0.5F, true);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }//end Ham()

}//end class Ham
