package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

/**
 * A tooltip condition that always returns true
 * No practical application
 **/
public class TTConditionAlwaysTrue extends AbstractTooltipCondition {

    public TTConditionAlwaysTrue(JsonObject object)
    {
        super(object);
    }

    @Override
    public boolean shouldAddToStack(ItemStack stack)
    {
        return true;
    }

    @Override
    public String getType()
    {
        return "always";
    }
}
