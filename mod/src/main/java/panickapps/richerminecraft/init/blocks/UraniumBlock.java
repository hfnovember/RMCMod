package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UraniumBlock extends Block {

    public UraniumBlock(String name, float hardness, float resistance) {
        super(Material.IRON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
    }//end UraniumBlock

}//end class UraniumBlock
