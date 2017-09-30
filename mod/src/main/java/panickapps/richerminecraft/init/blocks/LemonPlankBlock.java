package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LemonPlankBlock extends BlockPlanks {

    public LemonPlankBlock(String name, float hardness, float resistance) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(SoundType.WOOD);
    }//end LemonPlankBlock()

}//end class LemonPlankBlock
