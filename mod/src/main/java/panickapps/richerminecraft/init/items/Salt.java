package panickapps.richerminecraft.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Salt extends Item {

    public Salt(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }//end Salt()

}//end class Salt
