package com.rebirthofthenight.advancedtooltips.config;

import com.rebirthofthenight.advancedtooltips.Main;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber()
public class ConfigHelper {

    public static final String Lang_Key = "advancedtooltips.config.title";

    // For changes to configurations
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onConfigEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.getModID().equals(Main.MODID)){
            ConfigManager.sync(Main.MODID, Config.Type.INSTANCE);
        }
    }

}
