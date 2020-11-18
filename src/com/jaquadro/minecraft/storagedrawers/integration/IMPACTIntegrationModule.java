package com.jaquadro.minecraft.storagedrawers.integration;

import com.jaquadro.minecraft.storagedrawers.StorageDrawers;
import com.jaquadro.minecraft.storagedrawers.integration.impact.ModRecipes;
import cpw.mods.fml.common.Loader;

public class IMPACTIntegrationModule extends IntegrationModule {

    private static final boolean IMPACTEnabled = (Loader.isModLoaded("gregtech") && StorageDrawers.config.integrationConfig.isIMPACTEnabled());

    public static boolean isEnabled() {
        return IMPACTEnabled;
    }

    @Override
    public String getModID() {
        return "impact";
    }

    @Override
    public void init() throws Throwable {
        ModRecipes.init();
    }

    @Override
    public void postInit() {

    }
}
