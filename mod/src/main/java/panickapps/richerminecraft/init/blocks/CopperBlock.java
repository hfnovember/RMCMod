package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;

import java.util.Random;

public class CopperBlock extends Block {

	public CopperBlock(String name, float hardness, float resistance) {
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}//end CopperBlock()
	
}//end class CopperBlock