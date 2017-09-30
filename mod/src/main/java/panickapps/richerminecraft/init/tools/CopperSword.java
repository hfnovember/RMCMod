package panickapps.richerminecraft.init.tools;

import net.minecraft.item.ItemSword;

public class CopperSword extends ItemSword {

    public CopperSword(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }//end CopperSword()

}//end class CopperSword
