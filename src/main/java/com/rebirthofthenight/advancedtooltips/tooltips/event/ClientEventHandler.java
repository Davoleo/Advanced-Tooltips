package com.rebirthofthenight.advancedtooltips.tooltips.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void onKeyEvent(InputEvent.KeyInputEvent event) {
        int key = Keyboard.getEventKey();
        boolean wasPressed = Keyboard.getEventKeyState();
        // TODO: 30/03/2021 These two methods could be useful to implement KeyToggleCondition
    }

    @SubscribeEvent
    public static void setupTooltips(RenderTooltipEvent.Pre event) {
        if (event.getFontRenderer() == Minecraft.getMinecraft().fontRenderer)
        {
            // TODO: 09/04/2021 Setup Custom FontRenderer (that supports hex colors)
            //event.setFontRenderer();

            // TODO: 10/04/2021 Setup Tooltip position depending on the tooltip object enum
        }
    }
}
