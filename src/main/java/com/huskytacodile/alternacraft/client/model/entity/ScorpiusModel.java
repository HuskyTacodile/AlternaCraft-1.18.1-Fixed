package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.IndoraptorEntity;
import com.huskytacodile.alternacraft.entities.ScorpiusEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ScorpiusModel extends AnimatedGeoModel<ScorpiusEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(ScorpiusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/scorpius.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(ScorpiusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/scorpius.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ScorpiusEntity entity)    {
        return IndoraptorRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
