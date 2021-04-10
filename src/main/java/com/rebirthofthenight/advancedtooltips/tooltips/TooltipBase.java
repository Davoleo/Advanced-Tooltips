package com.rebirthofthenight.advancedtooltips.tooltips;

import javax.annotation.Nullable;
import java.util.List;

public class TooltipBase {

    private enum Location {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM
    }

    // TODO: Check if there's anything else needed for this class

    /** Whether these tooltip components should be added together with vanilla tooltip components */
    private final boolean shouldMergeWithVanilla = true;

    /** Tooltip Color Settings */
    private int backgroundColor = 0xF0100010;
    private int borderColor1 = 0x505000FF;
    private int borderColor2 = (borderColor1 & 0xFEFEFE) >> 1 | borderColor1 & 0xFF000000;

    /** Location of the tooltip relative to vanilla */
    @Nullable
    private Location location;

    /** A list of components present in this tooltip */
    private List<IToolTipComponent> components;


}
