package com.mrblockhouse.barbecue;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BarbecueMod.MODID, useMetadata = true)
public class BarbecueMod {

    public static final String MODID = "mrblockhouse.barbecue";
    public static final String VERSION = "0.1";

    @SidedProxy(serverSide = "com.mrblockhouse.barbecue.CommonProxy",
            clientSide = "com.mrblockhouse.barbecue.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        BarbecueItems.init();
//        BarbecueItems.createItems();
//        ModelLoader.setCustomModelResourceLocation(BarbecueItems.itemHack, 0, new ModelResourceLocation(new ResourceLocation(MODID, "itemHack"), "inventory"));
    }
}
