package com.rebirthofthenight.advancedtooltips.tooltips;

import com.rebirthofthenight.advancedtooltips.datatypes.ConditionCombinationLogic;
import com.rebirthofthenight.advancedtooltips.tooltips.conditionals.IToolTipConditional;
import com.rebirthofthenight.advancedtooltips.tooltips.values.IToolTipValue;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ToolTipComponentBase implements IToolTipComponent {

    protected enum EnumComponentFlow {
        BLOCK,
        INLINE
    }

    // I think protected over private whenever possible would make this mod easier to extend for other developers -dracominer
    protected String internalName = "default_tooltip_name";
    protected ConditionCombinationLogic logic = ConditionCombinationLogic.AND;
    protected EnumComponentFlow location;

    // TODO I'm not sure if LinkedList would be better? there should be relatively little insertion/deletion of these so array seems faster.
    // I may be completely confused though. -dracominer
    protected List<IToolTipConditional> conditions = new ArrayList<>();

    protected IToolTipValue value;

    @Override
    public String getInternalName() {
        return internalName;
    }

    @Override
    public EnumComponentFlow getLocation() {
        return location;
    }

    @Override
    public boolean shouldAddToStack(ItemStack stack) {
        return true; // TODO add conditionals
    }

    @Override
    public void addToGUI() {
        // TODO add gui logic
    }

    @Override
    public String getValue(ItemStack stack) {
        return value.getStringValue(stack);
    }

    @Override
    public void getIcon() {

    }
}
