package gus.scpua.items.scp;

import gus.scpua.init.ItemInit;
import gus.scpua.scpua;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class WeedScp extends ItemFood{
    private Object Item;

    public WeedScp(String name, int amount, boolean isWolfFood) {
        super(amount, isWolfFood);
        setCreativeTab(scpua.tabxkunitytab);
        setUnlocalizedName(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
         playerIn.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 450, 1));
        {

        }
        playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,450, 1));
        {

        }
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (playerIn.canEat(true))
        {
            playerIn.setActiveHand(handIn);
            return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
        }
        else
        {
            return new ActionResult<>(EnumActionResult.FAIL, itemstack);
        }
    }
}
