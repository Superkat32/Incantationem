package me.luligabi.incantationem.enchantment;

import me.luligabi.incantationem.Incantationem;
import me.luligabi.incantationem.enchantment.curse.CurseRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class ForgingTouchEnchantment extends IncantationemEnchantment {

    public ForgingTouchEnchantment() {
        super(
                Rarity.RARE,
                EnchantmentTarget.DIGGER,
                new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND},
                Incantationem.CONFIG.forgingTouchMaxLevel,
                Incantationem.CONFIG.forgingTouchAvailableForBookOffer,
                Incantationem.CONFIG.forgingTouchAvailableRandomly,
                Incantationem.CONFIG.forgingTouchAvailableAsTreasure
        );
    }

    @Override
    public int getMinPower(int level) {
        return 15 + (level - 1) * 9;
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != CurseRegistry.RECKLESSNESS;
    }

}