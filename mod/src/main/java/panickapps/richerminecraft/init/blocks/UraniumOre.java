package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UraniumOre extends Block {

	public UraniumOre(String name, float hardness, float resistance, int harvestLevel) {
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}//end UraniumOre()

}//end class UraniumOre