package divinerpg.objects.blocks;

import divinerpg.DivineRPG;
import divinerpg.registry.DivineRPGTabs;
import divinerpg.utils.BlockSoundTypeMap;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class BlockModPillar extends BlockRotatedPillar {
    public BlockModPillar(String name, Material material, float hardness) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(DivineRPG.MODID, name);
        this.setHardness(hardness);
        this.setSoundType(BlockSoundTypeMap.soundTypeForMaterial(material));
        this.setCreativeTab(DivineRPGTabs.BLOCKS);
    }

}
