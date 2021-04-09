package com.rebirthofthenight.advancedtooltips.tooltips.event;

import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class ClientEventHandler {

    @SubscribeEvent
    public static void onKeyEvent(InputEvent.KeyInputEvent event) {
        int key = Keyboard.getEventKey();
        boolean wasPressed = Keyboard.getEventKeyState();
        // TODO: 30/03/2021 These two methods could be useful to implement KeyToggleCondition
    }

    @SubscribeEvent
    public static void setupTooltips(RenderTooltipEvent.Pre event) {
        // TODO: 09/04/2021 Setup FontRenderer
    }
}
