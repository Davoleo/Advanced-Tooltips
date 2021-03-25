package com.rebirthofthenight.advancedtooltips.tooltips.event;

import com.rebirthofthenight.advancedtooltips.Main;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

    // For changes to configurations
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onConfigEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.getModID().equals(Main.MODID)){
            ConfigManager.sync(Main.MODID, Config.Type.INSTANCE);
        }
    }

}
