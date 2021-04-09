package com.rebirthofthenight.advancedtooltips.tooltips;

import javax.annotation.Nullable;

public class TooltipBase {

    private enum Location {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM
    }

    // TODO: 09/04/2021 Complete this

    /** Whether these tooltip components should be added together with vanilla tooltip components */
    private final boolean shouldMergeWithVanilla = true;

    /** Tooltip Color Settings */
    private boolean enableColorOverride = false;
    private int backgroundColor = 0xF0100010;
    private int borderColor1 = 0x505000FF;
    private int borderColor2 = (borderColor1 & 0xFEFEFE) >> 1 | borderColor1 & 0xFF000000;

    @Nullable
    private Location location;

}
