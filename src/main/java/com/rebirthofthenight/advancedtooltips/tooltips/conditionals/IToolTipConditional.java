package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

import net.minecraft.item.ItemStack;

public interface IToolTipConditional {

    /**
     *  The basic condition logic for when a tooltip should be added
     * @param stack the current item stack
     * @return true if the tooltip should be added
     */
    boolean shouldAddToStack(ItemStack stack);
}
