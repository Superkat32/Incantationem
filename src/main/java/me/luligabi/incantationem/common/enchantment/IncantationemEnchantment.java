package me.luligabi.incantationem.common.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public abstract class IncantationemEnchantment extends Enchantment {

    public IncantationemEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes, int maxLevel, boolean availableForBookOffer, boolean availableRandomly, boolean availableAsTreasure) {
        super(weight, type, slotTypes);
        this.maxLevel = maxLevel;
        this.availableForBookOffer = availableForBookOffer;
        this.availableRandomly = availableRandomly;
        this.availableAsTreasure = availableAsTreasure;
    }

    public IncantationemEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes, boolean availableForBookOffer, boolean availableRandomly, boolean availableAsTreasure) {
        this(weight, type, slotTypes, 1, availableForBookOffer, availableRandomly, availableAsTreasure);
    }


    private final int maxLevel;
    private final boolean availableForBookOffer;
    private final boolean availableRandomly;
    private final boolean availableAsTreasure;

    @Override
    public int getMaxLevel() {
        return maxLevel;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return availableForBookOffer;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return availableRandomly;
    }

    @Override
    public boolean isTreasure() {
        return availableAsTreasure;
    }
}