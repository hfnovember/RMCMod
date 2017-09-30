package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import panickapps.richerminecraft.init.ItemInit;

import java.util.Random;

public class CucumberCropBlock extends BlockCrops {

    public CucumberCropBlock(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
    }//end CucumberCropBlock()

    @Override
    protected Item getCrop() {
        return ItemInit.cucumber;
    }//end getCrop()

    @Override
    protected Item getSeed() { return null; }

    @Override
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
        super.dropXpOnBlockBreak(worldIn, pos, 5);
    }//end dropXpOnBlockBreak()

    @Override
    public int quantityDropped(Random random) {
        return random.nextInt(3) + 2;
    }//end quantityDropped()

}//end class CucumberCropBlock
