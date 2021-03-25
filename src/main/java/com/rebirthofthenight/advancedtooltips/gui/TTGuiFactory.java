package com.rebirthofthenight.advancedtooltips.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Set;

public class TTGuiFactory implements IModGuiFactory {

    // TODO add in the necesssary GUI stuff


    @Override
    public void initialize(Minecraft minecraft) {

    }

    @Override
    public boolean hasConfigGui() {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen guiScreen) {
        return null;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }
}
