package panickapps.richerminecraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.Random;

public class CopperOre extends Block {
	/**
	 * 
	 * @param name The name of the block
	 * @param hardness The hardness of the block
	 * @param resistance How much can I resist explosions?
	 * @param harvestLevel What level of tool can mine me? 2 = Iron
	 */
	public CopperOre(String name, float hardness, float resistance, int harvestLevel) {
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}//end CopperOre()

}//end class CopperOre