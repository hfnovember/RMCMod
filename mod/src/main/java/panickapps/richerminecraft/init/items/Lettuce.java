package panickapps.richerminecraft.init.items;

import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import panickapps.richerminecraft.init.BlockInit;

import java.util.Random;

public class Lettuce extends ItemSeedFood {

    public Lettuce(String name) {
        super(2, 0.5F, BlockInit.lettuceCropBlock, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
    }//end Lettuce()

}//end class Lettuce
