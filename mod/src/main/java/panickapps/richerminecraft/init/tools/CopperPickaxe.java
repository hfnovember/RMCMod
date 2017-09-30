package panickapps.richerminecraft.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class CopperPickaxe extends ItemPickaxe {

    public CopperPickaxe(String name, Item.ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }//end CopperPickaxe()

}//end class CopperPickaxe
