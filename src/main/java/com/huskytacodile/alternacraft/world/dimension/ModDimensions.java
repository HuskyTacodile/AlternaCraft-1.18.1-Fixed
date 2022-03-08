package com.huskytacodile.alternacraft.world.dimension;
import com.huskytacodile.alternacraft.Alternacraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModDimensions {

    public static ResourceKey<Level> AlternaDim = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Alternacraft.MOD_ID, "alternadim"));

    public static void register(IEventBus eventBus) {
    }
}
