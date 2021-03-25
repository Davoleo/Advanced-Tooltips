package com.rebirthofthenight.advancedtooltips.proxy;

import com.rebirthofthenight.advancedtooltips.tooltips.event.EventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyClient extends ProxyCommon {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e); // This may not really be necessary
        MinecraftForge.EVENT_BUS.register(new EventHandler()); // when config settings changed
    }
}
