package com.mrblockhouse.barbecue;

import com.mrblockhouse.barbecue.item.ItemBase;
import com.mrblockhouse.barbecue.item.ItemModelProvider;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BarbecueItems {

    public static Item BEEF_HIP_STEAK;

    public static Item HACK;

    public static Item PIG_HIP_STEAK;

    public static void init() {
        CreativeTabs tab = new CreativeTabs("Barbecue") {
            @Override
            public Item getTabIconItem() {
                return HACK;
            }
        };
        BEEF_HIP_STEAK = register(new ItemBase("itemBeefHipSteak")
                .setUnlocalizedName("mrblockhouse.barbecue.beefhipsteak")
                .setMaxStackSize(64)
                .setCreativeTab(tab));
        HACK = register(new ItemBase("itemHack")
                .setUnlocalizedName("mrblockhouse.barbecue.hack")
                .setMaxStackSize(64)
                .setCreativeTab(tab));
        PIG_HIP_STEAK = register(new ItemBase("itemPigHipSteak")
                .setUnlocalizedName("mrblockhouse.barbecue.pighipsteak")
                .setMaxStackSize(64)
                .setCreativeTab(tab));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider) item).registerItemModel(item);
        }
        return item;
    }
}
