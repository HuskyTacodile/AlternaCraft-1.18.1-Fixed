package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.AcroRenderer;
import com.huskytacodile.alternacraft.entities.BetaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BetaModel extends AnimatedGeoModel<BetaEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(BetaEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/blue.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(BetaEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/beta.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BetaEntity entity)    {
        return new ResourceLocation(Alternacraft.MOD_ID, "textures/entity/blue.png");
    }
}
