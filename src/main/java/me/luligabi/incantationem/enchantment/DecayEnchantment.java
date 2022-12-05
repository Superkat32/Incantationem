package me.luligabi.incantationem.enchantment;

import me.luligabi.incantationem.Incantationem;
import me.luligabi.incantationem.Util;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class DecayEnchantment extends IncantationemEnchantment {

    public DecayEnchantment() {
        super(
                Rarity.RARE,
                EnchantmentTarget.WEAPON,
                new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND},
                Incantationem.CONFIG.decayMaxLevel,
                Incantationem.CONFIG.decayAvailableForBookOffer,
                Incantationem.CONFIG.decayAvailableRandomly
        );
    }

    @Override
    public int getMinPower(int level) {
        return 10 + 30 * (level - 1);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity attacker, int level) {
        if(Util.positiveEffectRandomNumber(user, user.getRandom(),0, 10) < 1) {
            if(attacker instanceof LivingEntity) {
                Util.applyEffectIfNotPresent((LivingEntity) attacker, StatusEffects.WITHER, 3+level, level-1);
                Util.sendActionBarMessage(user, Text.translatable("message.incantationem.decay.applied"), Formatting.DARK_GRAY);
            }
        }
        super.onTargetDamaged(user, attacker, level);
    }

}