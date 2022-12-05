package me.luligabi.incantationem.enchantment.curse;

import me.luligabi.incantationem.Incantationem;
import me.luligabi.incantationem.enchantment.EnchantmentRegistry;
import me.luligabi.incantationem.enchantment.IncantationemEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class ToughLuckCurse extends IncantationemEnchantment {

    public ToughLuckCurse() {
        super(
                Rarity.VERY_RARE,
                EnchantmentTarget.BREAKABLE,
                EquipmentSlot.values(),
                Incantationem.CONFIG.toughLuckAvailableRandomly,
                Incantationem.CONFIG.toughLuckAvailableAsTreasure
        );
    }

    @Override
    public int getMinPower(int level) {
        return level * 25;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + 50;
    }

    @Override
    public boolean isCursed() {
        return true;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && (other != EnchantmentRegistry.CHARMED);
    }

}
