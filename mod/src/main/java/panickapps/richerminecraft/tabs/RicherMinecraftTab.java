package panickapps.richerminecraft.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import panickapps.richerminecraft.init.ItemInit;

public class RicherMinecraftTab extends CreativeTabs {

    public RicherMinecraftTab(String label) {
        super("rmc_tab");
    }//end RicherMinecraftTab()

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.copperIngot); //TODO Change this later.
    }//end getTabIconItem()

}//end class RicherMinecraftTab
