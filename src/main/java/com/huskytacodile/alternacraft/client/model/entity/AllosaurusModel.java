package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.AllosaurusEntity;
import com.huskytacodile.alternacraft.entities.IndoraptorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AllosaurusModel extends AnimatedGeoModel<AllosaurusEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(AllosaurusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(AllosaurusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/allosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AllosaurusEntity entity)    {
        return IndoraptorRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
