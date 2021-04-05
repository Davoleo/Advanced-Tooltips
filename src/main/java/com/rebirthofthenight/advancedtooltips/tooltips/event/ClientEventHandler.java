package com.rebirthofthenight.advancedtooltips.tooltips.event;

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
}
