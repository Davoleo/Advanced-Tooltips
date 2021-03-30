package com.rebirthofthenight.advancedtooltips;

import com.rebirthofthenight.advancedtooltips.config.ConfigHelper;
import com.rebirthofthenight.advancedtooltips.proxy.IProxy;
import com.rebirthofthenight.advancedtooltips.tooltips.event.CommonEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
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

    @SidedProxy(clientSide = "com.rebirthofthenight.advancedtooltips.proxy.ClientProxy", serverSide = "com.rebirthofthenight.advancedtooltips.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
        //Register Config ref as an event bus subscriber to listen to config changes
        MinecraftForge.EVENT_BUS.register(ConfigHelper.class);
        //Common event handler
        MinecraftForge.EVENT_BUS.register(CommonEventHandler.class);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
