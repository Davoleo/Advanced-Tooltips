package com.rebirthofthenight.advancedtooltips.datatypes;

/**
 * The logic for how conditionals are combined
 */
public enum ConditionCombinationLogic {
    /**
     * OR -> if any conditional is true, returns true, else false
     */
    OR,
    /**
     * OR -> if any conditional is false, returns false, else true
     */
    AND,
    //Returns true only if one of the conditionals is true (false otherwise)
    XOR
}
