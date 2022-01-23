
package com.huskytacodile.alternacraft.client.model.entity;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.render.entity.IndoraptorRenderer;
import com.huskytacodile.alternacraft.entities.BaryonyxGen2Entity;
import com.huskytacodile.alternacraft.entities.IndoraptorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BaryonyxGen2Model extends AnimatedGeoModel<BaryonyxGen2Entity> {
    @Override
    public ResourceLocation getAnimationFileLocation(BaryonyxGen2Entity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "animations/bary_gen2.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(BaryonyxGen2Entity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "geo/bary_gen_2.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BaryonyxGen2Entity entity)    {
        return IndoraptorRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}