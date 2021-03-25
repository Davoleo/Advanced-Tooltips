package com.rebirthofthenight.advancedtooltips.config;


import com.rebirthofthenight.advancedtooltips.Main;
import net.minecraftforge.common.config.Config;

@Config(modid = Main.MODID)
@Config.LangKey(ConfigRef.Lang_Key)
public class TTConfig {

    @Config.Comment("This may cause this to be incompatible with other mods when set to true")
    public static boolean useCustomFontRenderer = true;

}
