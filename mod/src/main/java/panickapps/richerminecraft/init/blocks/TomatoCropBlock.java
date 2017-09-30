package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import panickapps.richerminecraft.init.ItemInit;

import java.util.Random;

public class TomatoCropBlock extends BlockCrops {

    public TomatoCropBlock(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
    }//end TomatoCropBlock()

    @Override
    protected Item getCrop() {
        return ItemInit.tomato;
    }//end getCrop()

    @Override
    protected Item getSeed() {
        return null;
    }

    @Override
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
        super.dropXpOnBlockBreak(worldIn, pos, 10);
    }//end dropXpOnBlockBreak()

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(3) + 2;
    }//end quantityDropped()

}//end class TomatoCropBlock
