package naturix.divinerpg.objects.items;

import java.util.List;

import naturix.divinerpg.utils.TooltipLocalizer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemSlowingSword extends ItemSwordBase {

    public ItemSlowingSword(ToolMaterial toolMaterial, String name) {
        super(toolMaterial, name);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        if (entity instanceof EntityLivingBase)
            ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 50, 1));
        return false;
    }

    @Override
    public void addAdditionalInformation(List l) {
        l.add(TooltipLocalizer.slow(2.5));
    }
}