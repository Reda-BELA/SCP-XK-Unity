package gus.scpua.entity.living.scp.scp1499;

import gus.scpua.util.handlers.XKSoundHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntitySCP1499 extends EntityMob {

    public EntitySCP1499(World worldIn) {
        super(worldIn);
        this.setSize(0.9F, 2F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayerMP.class, true, true));
        this.tasks.addTask(2, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIWander(this, 1D));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.455D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(5.0D);
    }
}
