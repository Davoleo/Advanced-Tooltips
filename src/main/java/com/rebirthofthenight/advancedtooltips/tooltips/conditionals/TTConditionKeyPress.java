package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

import com.rebirthofthenight.advancedtooltips.datatypes.Key;
import org.lwjgl.input.Keyboard;

public class TTConditionKeyPress implements IToolTipConditional<Key> {

    @Override
    public boolean isTooltipEnabled(Key info)
    {
        return Keyboard.isKeyDown(info.getId());
    }
}
