package com.aaron1011.lambdadeobf;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "lambdadeobf", version = "1.0.0")
public class LambdaDeobf {

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        ItemMeshDefinition handler = (stack) -> {
            System.err.println("Called: " + stack);
            return null;
        };
        handler.getModelLocation(null);

        String str = "Test";
        ItemMeshDefinition secondHandler = (itemstack) -> {
            System.err.println(String.format("Called: %s Capture: %s", itemstack, str));
            return null;
        };
        secondHandler.getModelLocation(null);

    }
}
