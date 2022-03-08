package com.huskytacodile.alternacraft.events;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.entities.*;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Alternacraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.JPSPINO.get(), JPSpinoEntity.attributes().build());
        event.put(ModEntityTypes.INDOMINUS.get(), IndominusEntity.attributes().build());
        event.put(ModEntityTypes.ACRO.get(), AcroEntity.attributes().build());
        event.put(ModEntityTypes.OXALAIA.get(), OxalaiaEntity.attributes().build());
        event.put(ModEntityTypes.INDORAPTOR.get(), IndoraptorEntity.attributes().build());
        event.put(ModEntityTypes.CERATOSUCHOPS.get(), CeratosuchopsEntity.attributes().build());
        event.put(ModEntityTypes.ALTERNASAURUS.get(), AlternasaurusEntity.attributes().build());
        event.put(ModEntityTypes.TYLOSAURUS.get(), TylosaurusEntity.attributes().build());
        event.put(ModEntityTypes.MOSASAURUS.get(), MosasaurusEntity.attributes().build());
        event.put(ModEntityTypes.TYRANNOSAURUS.get(), TyrannosaurusEntity.attributes().build());
        event.put(ModEntityTypes.SCORPIUS.get(), ScorpiusEntity.attributes().build());
        event.put(ModEntityTypes.ALLOSAURUS.get(), AllosaurusEntity.attributes().build());
        event.put(ModEntityTypes.BARYONYX.get(), BaryonyxEntity.attributes().build());
        event.put(ModEntityTypes.BARYONYX_GEN2.get(), BaryonyxGen2Entity.attributes().build());
        event.put(ModEntityTypes.ALIORAMUS.get(), AlioramusEntity.attributes().build());
        event.put(ModEntityTypes.CARCHA.get(), CarchaEntity.attributes().build());
        event.put(ModEntityTypes.YUTYRANNUS.get(), YutyrannusEntity.attributes().build());
        event.put(ModEntityTypes.SPINO.get(), SpinoEntity.attributes().build());
        event.put(ModEntityTypes.COMPY.get(), CompsognathusEntity.attributes().build());
        event.put(ModEntityTypes.MEGALO.get(), MegaloEntity.attributes().build());
        event.put(ModEntityTypes.GIGA.get(), GigaEntity.attributes().build());
        event.put(ModEntityTypes.BLUE.get(), BlueEntity.attributes().build());
        event.put(ModEntityTypes.BETA.get(), BetaEntity.attributes().build());
    }
    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        SpawnEggItem.eggs();
    }
}