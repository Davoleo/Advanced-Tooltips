package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

@FunctionalInterface
public interface IToolTipConditional<T> {

    /**
     *  The basic condition logic for when a tooltip should be added
     * @param info Condition information parameter
     * @return true if the tooltip should be added
     */
    boolean isTooltipEnabled(T info);
}
