package com.huskytacodile.alternacraft.recipe;

import com.huskytacodile.alternacraft.Alternacraft;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Alternacraft.MOD_ID);

    public static final RegistryObject<RecipeSerializer<DNAExtractorRecipe>> DNAEXTRACTOR_SERIALIZER =
            SERIALIZERS.register("dna_extracting", () -> DNAExtractorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        Registry.register(Registry.RECIPE_TYPE, DNAExtractorRecipe.Type.ID, DNAExtractorRecipe.Type.INSTANCE);
    }
}
