package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;
import java.util.List;

public class LemonLeavesBlock extends Block {

    public LemonLeavesBlock(String name, float hardness, float resistance) {
        super(Material.LEAVES);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(SoundType.PLANT);
    }//end LemonLeavesBlock()

}//end class LemonLeavesBlock
