package panickapps.richerminecraft.init.tools;

import net.minecraft.item.ItemHoe;

public class CopperHoe extends ItemHoe {

    public CopperHoe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }//end CopperHoe()

}//end class CopperHoe
