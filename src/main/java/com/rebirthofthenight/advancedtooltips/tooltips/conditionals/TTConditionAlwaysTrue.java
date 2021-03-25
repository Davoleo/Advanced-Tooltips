package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

import net.minecraft.item.ItemStack;

/**
 * A tooltip condition that always returns true
 * No practical application
 **/
public class TTConditionAlwaysTrue implements IToolTipConditional {

    @Override
    public boolean shouldAddToStack(ItemStack stack) {
        return true;
    }
}
