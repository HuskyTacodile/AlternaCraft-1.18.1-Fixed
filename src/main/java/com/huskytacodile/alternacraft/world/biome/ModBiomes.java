package com.huskytacodile.alternacraft.world.biome;


import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes {

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event)
    {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(AlternaOverworldBiomes.alterna().setRegistryName(AlternaBiomes.ALTERNA.location()));
        registry.register(AlternaOverworldBiomes.element().setRegistryName(AlternaBiomes.ELEMENT.location()));
    }

}
