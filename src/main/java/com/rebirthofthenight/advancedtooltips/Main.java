package com.rebirthofthenight.advancedtooltips;

import com.rebirthofthenight.advancedtooltips.proxy.ProxyCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "advancedtooltips";
    public static final String NAME = "Advanced Tooltips";
    public static final String VERSION = "0.1.0";

    public static Logger logger;

    @SidedProxy(clientSide = "com.rebirthofthenight.advancedtooltips.proxy.ProxyClient", serverSide = "com.rebirthofthenight.advancedtooltips.proxy.ProxyCommon")
    public static ProxyCommon proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
