package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CheeseBlock extends Block {

    public CheeseBlock(String name) {
        super(Material.CLAY);
        setCreativeTab(CreativeTabs.FOOD);
        setRegistryName(name);
        setUnlocalizedName(name);
        setSoundType(SoundType.SLIME);
        setHardness(1);
        setResistance(1);
    }//end CheeseBlock()

}//end class CheeseBlock
