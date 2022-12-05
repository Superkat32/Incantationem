package me.luligabi.incantationem.enchantment.curse;

import me.luligabi.incantationem.Incantationem;
import me.luligabi.incantationem.enchantment.EnchantmentRegistry;
import me.luligabi.incantationem.enchantment.IncantationemEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;

/*
 * Original idea by u/celerysatan @ https://reddit.com/r/minecraftsuggestions/comments/mzyf9q/a_curse_with_a_compromise_curse_of_recklessness/
 */
public class RecklessnessCurse extends IncantationemEnchantment {

    public RecklessnessCurse() {
        super(
                Rarity.VERY_RARE,
                EnchantmentTarget.DIGGER,
                new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND},
                Incantationem.CONFIG.recklessnessAvailableRandomly,
                Incantationem.CONFIG.recklessnessAvailableAsTreasure
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
    public boolean isCursed() { return true; }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && (other != EnchantmentRegistry.FORGING_TOUCH || other != Enchantments.FORTUNE);
    }

}
