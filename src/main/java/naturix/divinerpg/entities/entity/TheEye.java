package naturix.divinerpg.entities.entity;

import javax.annotation.Nullable;

import naturix.divinerpg.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIFollow;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TheEye extends EntityMob {

    public TheEye(World worldIn) {
		super(worldIn);
		this.setSize(1.6F, 1.6f);
		this.setHealth(this.getMaxHealth());
	}

    protected boolean isMaster() {
        return false;
    }

    @Override
    protected boolean canDespawn() {
        return true;
    }

  
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.32D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);

    }

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.tasks.addTask(8, new EntityAIAttackMelee(this, 1, true));
        this.tasks.addTask(8, new EntityAIFollow(this, 1, 1, 1));
        this.applyEntityAI();
    }

    private void applyEntityAI() {
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[]{EntityPigZombie.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }

    @Override
    protected boolean isValidLightLevel() {
        return true;
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 3;
    }

    @Override
    public void setAttackTarget(@Nullable EntityLivingBase entitylivingbaseIn) {
        super.setAttackTarget(entitylivingbaseIn);
        if (entitylivingbaseIn instanceof EntityPlayer) {
            
        }
    }

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
        super.playStepSound(pos, blockIn);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }
    @Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
    {
    	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, ModItems.ingotRupee.getDefaultInstance()));
        
		int amount=rand.nextInt(16);
		if (amount > 1) {amount=1;}
		int amountout = 32-amount;
        switch(amountout) {
        case 16 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	break; // optional
        case 17 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 18 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break;
        case 19 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 20 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 21 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break;// optional
        case 22 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 23 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 24 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break;
        case 25 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 26 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 27 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break;
        case 28 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 29 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 30 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break;
        case 31 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));

        	break; // optional
        case 32 :
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, Item.getItemFromBlock(Blocks.TORCH).getDefaultInstance()));
        	break;
        default : // Optional
        	this.world.spawnEntity(new EntityItem(world, this.posX, this.posY, this.posZ, ModItems.tokensDungeon.getDefaultInstance()));
     }
    }
}