package com.rebirthofthenight.advancedtooltips.tooltips.conditionals;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.util.JsonUtils;
import org.lwjgl.input.Keyboard;

public class TTConditionKeyPress extends AbstractTooltipCondition {

    public TTConditionKeyPress(JsonObject object)
    {
        super(object);
    }

    @Override
    public boolean shouldAddToStack(ItemStack stack)
    {
        int key = JsonUtils.getInt(object, "key");
        return Keyboard.isKeyDown(key);
    }

    @Override
    public String getType()
    {
        return "key_held";
    }
}
