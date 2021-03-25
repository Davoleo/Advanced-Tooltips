package com.rebirthofthenight.advancedtooltips.tooltips;

import com.rebirthofthenight.advancedtooltips.tooltips.conditionals.IToolTipConditional;
import com.rebirthofthenight.advancedtooltips.tooltips.values.IToolTipValue;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class ToolTipComponentBase implements IToolTipComponent {

    /**
     * The logic for how conditionals are interpreted.
     *
     * */
    public enum ConditionLogic{
        /**OR -> if any conditional is true, returns true, else false */OR,
        /**OR -> if any conditional is false, returns false, else true */AND;
    }

    // I think protected over private whenever possible would make this mod easier to extend for other developers -dracominer
    protected String internalName = "default_tooltip_name";
    protected ConditionLogic logic = ConditionLogic.AND;

    // TODO I'm not sure if LinkedList would be better? there should be relatively little insertion/deletion of these so array seems faster.
    // I may be completely confused though. -dracominer
    protected List<IToolTipConditional> conditions = new ArrayList<IToolTipConditional>();

    protected IToolTipValue value;


    @Override
    public String getInternalName() {
        return internalName;
    }

    @Override
    public void getLocation() {
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
