package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.AlioramusEntity;
import com.huskytacodile.alternacraft.entities.CeratosuchopsEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AlioramusModel extends AnimatedGeoModel<AlioramusEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(AlioramusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/alioramus.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(AlioramusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/alioramus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AlioramusEntity entity)    {
        return IndoraptorRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
