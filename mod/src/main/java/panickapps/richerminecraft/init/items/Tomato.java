package panickapps.richerminecraft.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Tomato extends ItemFood {

    public Tomato(String name) {
        super(2, 0.5F, false);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }//end Tomato()

}//end class Tomato
