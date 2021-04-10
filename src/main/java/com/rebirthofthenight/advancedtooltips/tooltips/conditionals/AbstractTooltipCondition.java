package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public abstract class AbstractTooltipCondition {
    /** The json object describing this condition */
    protected JsonObject object;

    protected AbstractTooltipCondition(JsonObject object)
    {
        this.object = object;
    }

    /**
     * The basic condition logic for when a tooltip should be added
     * @param stack the stack that this component is being added to
     * @return true if the tooltip should be added
     */
    public abstract boolean shouldAddToStack(ItemStack stack);

    /**
     * @return The type id of the condition (reflects in JSON)
     */
    protected abstract String getType();

}
