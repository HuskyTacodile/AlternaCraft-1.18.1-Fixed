package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.BaryonyxEntity;
import com.huskytacodile.alternacraft.entities.IndoraptorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BaryonyxModel extends AnimatedGeoModel<BaryonyxEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(BaryonyxEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/baryonyx.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(BaryonyxEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/baryonyx.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BaryonyxEntity entity)    {
        return IndoraptorRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
