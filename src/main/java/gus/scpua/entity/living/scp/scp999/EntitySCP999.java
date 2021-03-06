package gus.scpua.entity.living.scp.scp999;

import gus.scpua.util.handlers.XKSoundHandler;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntitySCP999 extends EntityCreature {

    public EntitySCP999(World worldIn) {
        super(worldIn);
        this.setSize(1F, 0.9F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(2, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIWander(this, 1D));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2001D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10.0D);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return XKSoundHandler.SCP999_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return XKSoundHandler.SCP999_IDLE;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return XKSoundHandler.SCP999_HURT;
    }
}
