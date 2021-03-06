package com.topraktunca.element.util;
import com.topraktunca.element.element_t;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = element_t.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)

public class ClientEventBusSubscriber {

@SubscribeEvent
public static void clientSetup(FMLClientSetupEvent event) {
    RenderTypeLookup.setRenderLayer(RegistryHandler.T_SAPLING.get(), RenderType.getCutout());
    }
}
