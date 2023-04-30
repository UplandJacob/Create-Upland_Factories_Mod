package com.uplandjacob.create_upland_factories.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SwordItemWEffect extends SwordItem {
    private final MobEffect effect;
    private final int effectAmp;
    public SwordItemWEffect(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties, MobEffect effect, int effectAmp) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
        this.effect = effect;
        this.effectAmp = effectAmp;
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
        p_43279_.addEffect(new MobEffectInstance(effect, 200, effectAmp), p_43280_);
        return super.hurtEnemy(p_43278_, p_43279_, p_43280_);
    }
}
