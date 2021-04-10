package com.rebirthofthenight.advancedtooltips.datatypes;

import java.util.function.BinaryOperator;

/**
 * The logic for how conditionals are combined
 */
public enum ConditionLogicOperators {
    /** OR -> if any condition is true, returns true, else false */
    OR((o1, o2) -> o1 || o2),
    /** AND -> if any condition is false, returns false, else true */
    AND((o1, o2) -> o1 && o2),
    /** Returns true only if one of the conditionals is true (false otherwise) */
    XOR((o1, o2) -> o1 != o2),
    /** Returns true if the two conditionals have the same value */
    XNOR((o1, o2) -> o1 == o2);

    private final BinaryOperator<Boolean> logic;

    ConditionLogicOperators(BinaryOperator<Boolean> logic)
    {
        this.logic = logic;
    }

    public BinaryOperator<Boolean> getOperator()
    {
        return logic;
    }

    /**
     * TODO: I have no idea if this makes any sense at all
     * @param firstValue The evaluation of the first condition in the array
     * @return The identity for that specific logic operator
     */
    public boolean getIdentity(boolean firstValue)
    {
        switch (this) {
            case OR:
                return false;
            case AND:
                return true;
            case XOR:
                return !firstValue;
            case XNOR:
                return firstValue;
            default:
                throw new IllegalStateException("Can't be anything else, sorry");
        }
    }
}
