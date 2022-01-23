package com.huskytacodile.alternacraft.world.biome;

import com.huskytacodile.alternacraft.Alternacraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class AlternaBiomes {

    public static final ResourceKey<Biome> ALTERNA = register("alterna");
    public static final ResourceKey<Biome> ELEMENT = register("element");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Alternacraft.MOD_ID, name));
    }

}
