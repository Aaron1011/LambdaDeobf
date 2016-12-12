package com.aaron1011.lambdadeobf;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "lambdadeobf", version = "1.0.0")
public class LambdaDeobf {

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        ItemMeshDefinition handler = (p1) -> {
            System.err.println("Called: " + p1);
            return null;
        };
        handler.getModelLocation(null);

    }
}
