package com.rebirthofthenight.advancedtooltips.tooltips.values;

import net.minecraft.item.ItemStack;

public interface IToolTipValue {

    /**
     * Gets a string value for the tooltip given the current conditions.
     * @param stack the current itemstack. Used for calculations
     * @return the string representation of the tooltip
     */
    String getStringValue(ItemStack stack);
}
