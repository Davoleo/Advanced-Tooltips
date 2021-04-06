package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

/**
 * A tooltip condition that always returns true
 * No practical application
 **/
public class TTConditionAlwaysTrue implements IToolTipConditional {

    @Override
    public boolean test(Object info)
    {
        return true;
    }
}
