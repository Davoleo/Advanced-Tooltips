package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

import java.util.function.Predicate;

public interface IToolTipConditional<T> extends Predicate<T> {

    /**
     *  The basic condition logic for when a tooltip should be added
     * @param info Condition information parameter
     * @return true if the tooltip should be added
     */
    boolean test(T info);

    //String getTypeName();

}
