package com.rebirthofthenight.advancedtooltips.tooltips;

import com.rebirthofthenight.advancedtooltips.datatypes.ConditionLogicOperators;
import com.rebirthofthenight.advancedtooltips.tooltips.conditionals.AbstractTooltipCondition;
import com.rebirthofthenight.advancedtooltips.tooltips.values.IToolTipValue;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ToolTipComponentBase implements IToolTipComponent {

    protected enum EnumComponentFlow {
        BLOCK,
        INLINE
    }

    protected TooltipBase parent;

    // I think protected over private whenever possible would make this mod easier to extend for other developers -dracominer
    protected String internalName = "default_tooltip_name";
    protected ConditionLogicOperators logic = ConditionLogicOperators.AND;
    protected EnumComponentFlow location;

    // TODO I'm not sure if LinkedList would be better? there should be relatively little insertion/deletion of these so array seems faster.
    // I may be completely confused though. -dracominer
    protected List<AbstractTooltipCondition> conditions = new ArrayList<>();

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
    public boolean shouldAddToStack(ItemStack stack)
    {
        boolean firstValue = conditions.get(1).shouldAddToStack(stack);
        return conditions.stream()
                .map(condition -> condition.shouldAddToStack(stack))
                .reduce(logic.getIdentity(firstValue), logic.getOperator());
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
