package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LemonLogBlock extends BlockLog {

    public LemonLogBlock(String name, float hardness, float resistance) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(SoundType.WOOD);
    }//end LemonLogBlock()

}//end class LemonLogBlock
