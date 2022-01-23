package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.CarchaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CarchaModel extends AnimatedGeoModel<CarchaEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(CarchaEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/carcha.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(CarchaEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/carcharodontosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CarchaEntity entity)    {
        return IndoraptorRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
