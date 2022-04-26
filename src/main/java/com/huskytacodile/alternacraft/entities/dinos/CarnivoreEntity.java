package com.huskytacodile.alternacraft.entities.dinos;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.function.Predicate;

public abstract class CarnivoreEntity extends AlternaDinoEntity {
    public CarnivoreEntity(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    protected Predicate<LivingEntity> getPreySelection(Entity entity) {
        return (e) -> e.getType() != entity.getType() && (e.getType() == EntityType.SHEEP || e.getType() == EntityType.RABBIT
                || e.getType() == EntityType.COW || e.getType() == EntityType.CHICKEN || e.getType() == EntityType.PIG);
    }

    public boolean isFood(ItemStack stack) {
        Item item = stack.getItem();
        return item.isEdible() && item.getFoodProperties().isMeat();
    }
}
