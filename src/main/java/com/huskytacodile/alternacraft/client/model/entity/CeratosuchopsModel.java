package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.CeratosuchopsEntity;
import com.huskytacodile.alternacraft.entities.IndoraptorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CeratosuchopsModel extends AnimatedGeoModel<CeratosuchopsEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(CeratosuchopsEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/ceratosuchops.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(CeratosuchopsEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/ceratosuchops.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CeratosuchopsEntity entity)    {
        return IndoraptorRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
