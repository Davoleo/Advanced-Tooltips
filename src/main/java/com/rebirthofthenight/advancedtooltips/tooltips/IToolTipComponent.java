package com.rebirthofthenight.advancedtooltips.tooltips;

import net.minecraft.item.ItemStack;

/**
 * The interface for all tooltip components.
 * Implementing this in a class allows it to be added as a tooltip component and
 * can apply custom logic for tooltip info.
 */
public interface IToolTipComponent {

    /**
     * @return the internal name for this tooltip component (archetype not instance)
     */
     String getInternalName();

    /**
     * @return The location of the tooltip component relative to the previous components in the same tooltip.
     */
     ToolTipComponentBase.EnumComponentFlow getLocation();

    /**
     *  Overriding this method allows for custom logic for determining when to add tooltips of this type.
     * @param stack the stack which might have this tooltip
     * @return true if this component should be applied to the tooltip render
     * TODO determine what values are needed for various conditionals
     */
     boolean shouldAddToStack(ItemStack stack);

    /**
     * applies the tooltip component to the current GUI render
     * TODO make this take in needed info so GUI handling can be done properly
     */
     void addToGUI(); // TODO add

    /**
     * @param stack the current ItemStack
     * @return the value of the tooltip component
     */
     String getValue(ItemStack stack);


    /**
     * @return the icon of the tooltip component.
     */
     void getIcon();


}
