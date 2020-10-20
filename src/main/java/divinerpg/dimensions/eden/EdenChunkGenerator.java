package divinerpg.dimensions.eden;

import java.util.ArrayList;

import divinerpg.dimensions.IslandChunkGeneratorBase;
import divinerpg.registry.BlockRegistry;
import divinerpg.registry.StructureRegistry;
import divinerpg.structure.base.DRPGStructureHandler;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;

public class EdenChunkGenerator extends IslandChunkGeneratorBase {

    public EdenChunkGenerator(World world) {
        super(world, BlockRegistry.twilightStone, BlockRegistry.edenGrass, BlockRegistry.edenDirt);
    }

    @Override
    public void populate(int chunkX, int chunkZ) {
        this.rand.setSeed(this.world.getSeed());
        long k = this.rand.nextLong() / 2L * 2L + 1L;
        long l = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed(chunkX * k + chunkZ * l ^ this.world.getSeed());

        int baseX = chunkX * 16 + 1;
        int baseZ = chunkZ * 16 + 1;
        BlockPos pos = new BlockPos(baseX, 0, baseZ);
        Biome biome = this.world.getBiome(new BlockPos(baseX, 0, baseZ));

        if(this.rand.nextInt(60) == 0) {
            int x = baseX + this.rand.nextInt(16);
            int z = baseZ + this.rand.nextInt(16);
            int y = world.getHeight(x, z);

            if(this.world.getBlockState(new BlockPos(x + 3, y - 1, z + 3)).getBlock() == BlockRegistry.edenGrass) {
                StructureRegistry.SUNSTORM_DUNGEON.generate(world, this.rand, new BlockPos(x, y, z));
            }
        }

        if(this.rand.nextInt(20) == 0) {
            int x = baseX + this.rand.nextInt(16);
            int z = baseZ + this.rand.nextInt(16);
            int y = world.getHeight(x, z);

            if(this.world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == BlockRegistry.edenGrass) {
                int listSize = StructureRegistry.EDEN_SMALL_STRUCTURES.size();
                DRPGStructureHandler structure = StructureRegistry.EDEN_SMALL_STRUCTURES.get(this.rand.nextInt(listSize));
                structure.generate(world, this.rand, new BlockPos(x, y, z));
            }
        }

        this.rand.setSeed(chunkX * k + chunkZ * l ^ this.world.getSeed());
        biome.decorate(this.world, this.rand, pos);
        WorldEntitySpawner.performWorldGenSpawning(this.world, biome, baseX + 8, baseZ + 8, 16, 16, this.rand);
    }
}
