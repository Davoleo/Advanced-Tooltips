package com.rebirthofthenight.advancedtooltips.gui;

import com.rebirthofthenight.advancedtooltips.config.GeneralConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Set;

/**
 * @deprecated AFAIK this isn't needed when you use the config annotation system in
 * {@link GeneralConfig}
 * -Davoleo
 */
@Deprecated
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
