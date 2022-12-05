package me.luligabi.incantationem.enchantment;

import me.luligabi.incantationem.Incantationem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class BunnysHopEnchantment extends IncantationemEnchantment {

    public BunnysHopEnchantment() {
        super(
                Enchantment.Rarity.UNCOMMON,
                EnchantmentTarget.ARMOR_FEET,
                new EquipmentSlot[]{EquipmentSlot.FEET},
                Incantationem.CONFIG.bunnysHopMaxLevel,
                Incantationem.CONFIG.bunnysHopAvailableForBookOffer,
                Incantationem.CONFIG.bunnysHopAvailableRandomly
        );
    }

    @Override
    public int getMinPower(int level) { return 10 + 10 * (level - 1); }

    @Override
    public int getMaxPower(int level) {
            return 50;
        }

}
