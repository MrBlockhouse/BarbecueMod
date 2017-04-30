package com.mrblockhouse.barbecue;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DropHandler {

    @SubscribeEvent
    public static void onEntityDrop(LivingDropsEvent event) {
        if (event.getEntityLiving() instanceof EntityCow) {
            event.getEntityLiving().entityDropItem(new ItemStack(BarbecueItems.HACK), randomAmount(1, 2, 0.2));
            event.getEntityLiving().entityDropItem(new ItemStack(BarbecueItems.BEEF_HIP_STEAK, randomAmount(1, 2, 0.4)), 0);
        }
        if (event.getEntityLiving() instanceof EntityPig) {
            event.getEntityLiving().entityDropItem(new ItemStack(BarbecueItems.PIG_HIP_STEAK, randomAmount(1, 2, 0.4)), 0);
        }
    }

    private static int randomAmount(int min, int max, double possibility) {
        return (int) Math.round(possibility * (min + (Math.random() * (max - min))));
    }
}
