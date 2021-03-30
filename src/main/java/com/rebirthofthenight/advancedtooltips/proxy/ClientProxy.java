package com.rebirthofthenight.advancedtooltips.proxy;

import com.rebirthofthenight.advancedtooltips.tooltips.event.EventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Client-side API calls only<br>
 * e.g.: Here you can import the Minecraft class directly
 */
public class ClientProxy implements IProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(new EventHandler()); // when config settings changed
    }
}
