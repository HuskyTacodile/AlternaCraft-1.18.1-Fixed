package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.AlternasaurusRenderer;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.AlternasaurusEntity;
import com.huskytacodile.alternacraft.entities.IndoraptorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AlternasaurusModel extends AnimatedGeoModel<AlternasaurusEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(AlternasaurusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/alternasaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(AlternasaurusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/alternasaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AlternasaurusEntity entity)    {
        return AlternasaurusRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
