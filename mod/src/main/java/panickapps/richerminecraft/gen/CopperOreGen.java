package panickapps.richerminecraft.gen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import panickapps.richerminecraft.init.BlockInit;

import java.util.Random;

/**
 * Generates copper ore in the world.
 */
public class CopperOreGen implements IWorldGenerator {

    private WorldGenerator copperOre;

    public CopperOreGen() {
        copperOre = new WorldGenMinable(BlockInit.copperOre.getDefaultState(), 5);
    }//end CopperOreGen()

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 0: //Overworld
                runGenerator(copperOre, world, random, chunkX, chunkZ, 20, 5, 70);
                break;
            case 1: //End
                break;
            case -1: //Nether
                break;
        }//end switch
    }//end generate()

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunckX, int chunckZ, int chanceOfSpawn, int minHeight, int maxHeight) {
        if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds.");
        int heightDifference = maxHeight - minHeight + 1;
        for (int i = 0; i < chanceOfSpawn; i++) {
            int x = chunckX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDifference);
            int z = chunckZ * 16 + rand.nextInt(16);
            gen.generate(world, rand, new BlockPos(x, y, z));
        }//end for
    }//end runGenerator()

}//end class CopperOreGen
