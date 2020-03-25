package gus.scpua.util.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber
public class ScpEventHandler {
//Used for Events that are handled by Multiple Objects

    private int tick = 0; // What tick the game is on
    //private int ticks = 0; // How many ticks have there been? (meant for some SPC's) max number is 200

    public static World worldIn; //World
    public static EntityPlayer playerIn; //Who?
    public static BlockPos blockPos; //Block Position

    public static boolean pnHit = false; //Pipe Nightmare hit?


    @SubscribeEvent
    public void generalTick(TickEvent.WorldTickEvent tickEvent) {
        if (tick != 20) tick = tick + 1;
        else tick = 0;

        /* i want to think of a new way of doing this, if i cant then ill just use this.
        if (tick == 20) ticks = ticks + 1;
        if (ticks == 201) ticks = 1;
        System.out.println(ticks);
         */

        //Pipe Nightmare
        //int pnTimes;
        if (pnHit) {
            if (tick == 20) {
                if (!playerIn.isSwingInProgress) { pnHit = false; return; }
                if (playerIn.isCreative()) { pnHit = false; return; }
                if (playerIn.isDead) { pnHit = false; return; }
                //System.out.println("Damaging Player");
                playerIn.addPotionEffect(new PotionEffect(MobEffects.POISON, 100, 2)); //Add Damage increase element
                playerIn.attackEntityFrom(DamageSource.MAGIC, 1); //Change Damage Source
                worldIn.playSound((EntityPlayer) null, blockPos, SoundsHandler.STEAM_015, SoundCategory.AMBIENT, 1F, 1F);
            }
        }

        //Other Code

    }
}
