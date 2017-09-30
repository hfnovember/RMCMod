package panickapps.richerminecraft.init.tools;

import net.minecraft.item.ItemSpade;

public class CopperShovel extends ItemSpade {

    public CopperShovel(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }//end CopperShovel()

}//end class CopperShovel
