package me.luligabi.incantationem.enchantment;

import me.luligabi.incantationem.Incantationem;
import me.luligabi.incantationem.enchantment.curse.CurseRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class CharmedEnchantment extends IncantationemEnchantment {


    public CharmedEnchantment() {
        super(
                Enchantment.Rarity.RARE,
                EnchantmentTarget.BREAKABLE,
                EquipmentSlot.values(),
                Incantationem.CONFIG.charmedMaxLevel,
                Incantationem.CONFIG.charmedAvailableForBookOffer,
                Incantationem.CONFIG.charmedAvailableRandomly
        );
    }

    @Override
    public int getMinPower(int level) {
        return 5 + (level - 1) * 12;
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.isDamageable() || super.isAcceptableItem(stack);
    }

    @Override
    public boolean canAccept(Enchantment other) { return super.canAccept(other) && (other != CurseRegistry.TOUGH_LUCK); }

}