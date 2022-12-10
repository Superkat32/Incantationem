package me.luligabi.incantationem.client.compat.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.isxander.yacl.api.ConfigCategory;
import dev.isxander.yacl.api.Option;
import dev.isxander.yacl.api.OptionGroup;
import dev.isxander.yacl.api.YetAnotherConfigLib;
import dev.isxander.yacl.gui.controllers.BooleanController;
import dev.isxander.yacl.gui.controllers.string.number.IntegerFieldController;
import me.luligabi.incantationem.common.Incantationem;
import me.luligabi.incantationem.common.ModConfig;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ConfigScreenEntrypoint implements ModMenuApi {

    @Override
    public ConfigScreenFactory<Screen> getModConfigScreenFactory() {
        return this::createConfigScreen;
    }

    private Screen createConfigScreen(Screen parent) {
        ModConfig config = Incantationem.CONFIG;

        /*
         * ENCHANTMENTS
         */
        // Bane of The Swine
        Option<Integer> baneOfTheSwineMaxLevel = Option.createBuilder(Integer.class)
                .name(Text.translatable("configOption.incantationem.maxLevel"))
                .tooltip(Text.translatable("configOption.incantationem.maxLevel.tooltip"))
                .binding(
                        5,
                        () -> config.baneOfTheSwineMaxLevel,
                        newValue -> config.baneOfTheSwineMaxLevel = newValue
                )
                .controller((intOption) -> new IntegerFieldController(intOption, 1, 10))
                .build();

        Option<Boolean> baneOfTheSwineAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.baneOfTheSwineAvailableRandomly,
                        newValue -> config.baneOfTheSwineAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> baneOfTheSwineAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.baneOfTheSwineAvailableForBookOffer,
                        newValue -> config.baneOfTheSwineAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> baneOfTheSwineAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.baneOfTheSwineAvailableAsTreasure,
                        newValue -> config.baneOfTheSwineAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Bunny's Hop
        Option<Integer> bunnysHopMaxLevel = Option.createBuilder(Integer.class)
                .name(Text.translatable("configOption.incantationem.maxLevel"))
                .tooltip(Text.translatable("configOption.incantationem.maxLevel.tooltip"))
                .binding(
                        3,
                        () -> config.bunnysHopMaxLevel,
                        newValue -> config.bunnysHopMaxLevel = newValue
                )
                .controller((intOption) -> new IntegerFieldController(intOption, 1, 10))
                .build();

        Option<Boolean> bunnysHopAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.bunnysHopAvailableRandomly,
                        newValue -> config.bunnysHopAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> bunnysHopAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.bunnysHopAvailableForBookOffer,
                        newValue -> config.bunnysHopAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> bunnysHopAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.bunnysHopAvailableAsTreasure,
                        newValue -> config.bunnysHopAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Charmed
        Option<Boolean> charmedAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.charmedAvailableRandomly,
                        newValue -> config.charmedAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> charmedAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.charmedAvailableForBookOffer,
                        newValue -> config.charmedAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> charmedAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.charmedAvailableAsTreasure,
                        newValue -> config.charmedAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Decay
        Option<Integer> decayMaxLevel = Option.createBuilder(Integer.class)
                .name(Text.translatable("configOption.incantationem.maxLevel"))
                .tooltip(Text.translatable("configOption.incantationem.maxLevel.tooltip"))
                .binding(
                        3,
                        () -> config.decayMaxLevel,
                        newValue -> config.decayMaxLevel = newValue
                )
                .controller((intOption) -> new IntegerFieldController(intOption, 1, 10))
                .build();

        Option<Boolean> decayAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.decayAvailableRandomly,
                        newValue -> config.decayAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> decayAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.decayAvailableForBookOffer,
                        newValue -> config.decayAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> decayAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.decayAvailableAsTreasure,
                        newValue -> config.decayAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Forging Touch
        Option<Integer> forgingTouchMaxLevel = Option.createBuilder(Integer.class)
                .name(Text.translatable("configOption.incantationem.maxLevel"))
                .tooltip(Text.translatable("configOption.incantationem.maxLevel.tooltip"))
                .binding(
                        3,
                        () -> config.forgingTouchMaxLevel,
                        newValue -> config.forgingTouchMaxLevel = newValue
                )
                .controller((intOption) -> new IntegerFieldController(intOption, 1, 10))
                .build();

        Option<Boolean> forgingTouchAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.forgingTouchAvailableRandomly,
                        newValue -> config.forgingTouchAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> forgingTouchAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.forgingTouchAvailableForBookOffer,
                        newValue -> config.forgingTouchAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> forgingTouchAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        true,
                        () -> config.forgingTouchAvailableAsTreasure,
                        newValue -> config.forgingTouchAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Last Stand
        Option<Integer> lastStandMaxLevel = Option.createBuilder(Integer.class)
                .name(Text.translatable("configOption.incantationem.maxLevel"))
                .tooltip(Text.translatable("configOption.incantationem.maxLevel.tooltip"))
                .binding(
                        3,
                        () -> config.lastStandMaxLevel,
                        newValue -> config.lastStandMaxLevel = newValue
                )
                .controller((intOption) -> new IntegerFieldController(intOption, 1, 10))
                .build();

        Option<Boolean> lastStandAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.lastStandAvailableRandomly,
                        newValue -> config.lastStandAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> lastStandAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.lastStandAvailableForBookOffer,
                        newValue -> config.lastStandAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> lastStandAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.lastStandAvailableAsTreasure,
                        newValue -> config.lastStandAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Magnetic
        Option<Integer> magneticMaxLevel = Option.createBuilder(Integer.class)
                .name(Text.translatable("configOption.incantationem.maxLevel"))
                .tooltip(Text.translatable("configOption.incantationem.maxLevel.tooltip"))
                .binding(
                        3,
                        () -> config.magneticMaxLevel,
                        newValue -> config.magneticMaxLevel = newValue
                )
                .controller((intOption) -> new IntegerFieldController(intOption, 1, 10))
                .build();

        Option<Boolean> magneticAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.magneticAvailableRandomly,
                        newValue -> config.magneticAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> magneticAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.magneticAvailableForBookOffer,
                        newValue -> config.magneticAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> magneticAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.magneticAvailableAsTreasure,
                        newValue -> config.magneticAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Reaping Rod
        Option<Boolean> reapingRodAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.reapingRodAvailableRandomly,
                        newValue -> config.reapingRodAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> reapingRodAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.reapingRodAvailableForBookOffer,
                        newValue -> config.reapingRodAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> reapingRodAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.reapingRodAvailableAsTreasure,
                        newValue -> config.reapingRodAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Retreat
        Option<Boolean> retreatAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.retreatAvailableRandomly,
                        newValue -> config.retreatAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> retreatAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.retreatAvailableForBookOffer,
                        newValue -> config.retreatAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> retreatAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.retreatAvailableAsTreasure,
                        newValue -> config.retreatAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Venomous
        Option<Integer> venomousMaxLevel = Option.createBuilder(Integer.class)
                .name(Text.translatable("configOption.incantationem.maxLevel"))
                .tooltip(Text.translatable("configOption.incantationem.maxLevel.tooltip"))
                .binding(
                        3,
                        () -> config.venomousMaxLevel,
                        newValue -> config.venomousMaxLevel = newValue
                )
                .controller((intOption) -> new IntegerFieldController(intOption, 1, 10))
                .build();

        Option<Boolean> venomousAvailableRandomly = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableRandomly"))
                .tooltip(Text.translatable("configOption.incantationem.availableRandomly.tooltip"))
                .binding(
                        true,
                        () -> config.venomousAvailableRandomly,
                        newValue -> config.venomousAvailableRandomly = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> venomousAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.venomousAvailableForBookOffer,
                        newValue -> config.venomousAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> venomousAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        false,
                        () -> config.venomousAvailableAsTreasure,
                        newValue -> config.venomousAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        /*
         * CURSES
         */
        // Curse of Recklessness
        Option<Boolean> recklessnessAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.recklessnessAvailableForBookOffer,
                        newValue -> config.recklessnessAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> recklessnessAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        true,
                        () -> config.recklessnessAvailableAsTreasure,
                        newValue -> config.recklessnessAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Curse of the Thunders
        Option<Boolean> thunderAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.thunderAvailableForBookOffer,
                        newValue -> config.thunderAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> thunderAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        true,
                        () -> config.thunderAvailableAsTreasure,
                        newValue -> config.thunderAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        // Curse of Tough Luck
        Option<Boolean> toughLuckAvailableForBookOffer = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableForBookOffer"))
                .tooltip(Text.translatable("configOption.incantationem.availableForBookOffer.tooltip"))
                .binding(
                        true,
                        () -> config.toughLuckAvailableForBookOffer,
                        newValue -> config.toughLuckAvailableForBookOffer = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();

        Option<Boolean> toughLuckAvailableAsTreasure = Option.createBuilder(Boolean.class)
                .name(Text.translatable("configOption.incantationem.availableAsTreasure"))
                .tooltip(Text.translatable("configOption.incantationem.availableAsTreasure.tooltip"))
                .binding(
                        true,
                        () -> config.toughLuckAvailableAsTreasure,
                        newValue -> config.toughLuckAvailableAsTreasure = newValue
                )
                .controller((booleanOption) -> new BooleanController(booleanOption, BooleanController.YES_NO_FORMATTER, true))
                .build();


        return YetAnotherConfigLib.createBuilder()
                .title(Text.of("Incantationem"))
                .category(ConfigCategory.createBuilder()
                        .name(Text.translatable("configCategory.incantationem.enchantment"))
                        .group(
                                createEnchantmentGroup(
                                    "swine_bane",
                                    baneOfTheSwineMaxLevel,
                                    baneOfTheSwineAvailableRandomly,
                                    baneOfTheSwineAvailableForBookOffer,
                                    baneOfTheSwineAvailableAsTreasure
                                )
                        )
                        .group(
                                createEnchantmentGroup(
                                        "bunnys_hop",
                                        bunnysHopMaxLevel,
                                        bunnysHopAvailableRandomly,
                                        bunnysHopAvailableForBookOffer,
                                        bunnysHopAvailableAsTreasure
                                )
                        )
                        .group(
                                createLevellessEnchantmentGroup(
                                        "charmed",
                                        charmedAvailableRandomly,
                                        charmedAvailableForBookOffer,
                                        charmedAvailableAsTreasure
                                )
                        )
                        .group(
                                createEnchantmentGroup(
                                        "decay",
                                        decayMaxLevel,
                                        decayAvailableRandomly,
                                        decayAvailableForBookOffer,
                                        decayAvailableAsTreasure
                                )
                        )
                        .group(
                                createEnchantmentGroup(
                                        "forging_touch",
                                        forgingTouchMaxLevel,
                                        forgingTouchAvailableRandomly,
                                        forgingTouchAvailableForBookOffer,
                                        forgingTouchAvailableAsTreasure
                                )
                        )
                        .group(
                                createEnchantmentGroup(
                                        "last_stand",
                                        lastStandMaxLevel,
                                        lastStandAvailableRandomly,
                                        lastStandAvailableForBookOffer,
                                        lastStandAvailableAsTreasure
                                )
                        )
                        .group(
                                createEnchantmentGroup(
                                        "magnetic",
                                        magneticMaxLevel,
                                        magneticAvailableRandomly,
                                        magneticAvailableForBookOffer,
                                        magneticAvailableAsTreasure
                                )
                        )
                        .group(
                                createLevellessEnchantmentGroup(
                                        "reaping_rod",
                                        reapingRodAvailableRandomly,
                                        reapingRodAvailableForBookOffer,
                                        reapingRodAvailableAsTreasure
                                )
                        )
                        .group(
                                createLevellessEnchantmentGroup(
                                        "retreat",
                                        retreatAvailableRandomly,
                                        retreatAvailableForBookOffer,
                                        retreatAvailableAsTreasure
                                )
                        )
                        .group(
                                createEnchantmentGroup(
                                        "venomous",
                                        venomousMaxLevel,
                                        venomousAvailableRandomly,
                                        venomousAvailableForBookOffer,
                                        venomousAvailableAsTreasure
                                )
                        )
                        .build())
                .category(ConfigCategory.createBuilder()
                        .name(Text.translatable("configCategory.incantationem.curse"))
                        .group(
                                createCurseGroup(
                                        "recklessness",
                                        recklessnessAvailableForBookOffer,
                                        recklessnessAvailableAsTreasure
                                )
                        )
                        .group(
                                createCurseGroup(
                                        "thunder",
                                        thunderAvailableForBookOffer,
                                        thunderAvailableAsTreasure
                                )
                        )
                        .group(
                                createCurseGroup(
                                        "tough_luck",
                                        toughLuckAvailableForBookOffer,
                                        toughLuckAvailableAsTreasure
                                )
                        )
                        .build())
                .save(() -> Incantationem.saveConfig(config))
                .build()
                .generateScreen(parent);
    }


    private OptionGroup createEnchantmentGroup(String enchantmentId, Option<Integer> maxLevel, Option<Boolean> availableRandomly, Option<Boolean> availableForBookOffer, Option<Boolean> availableAsTreasure) {
        return OptionGroup.createBuilder()
                .name(Text.translatable("enchantment.incantationem." + enchantmentId))
                .option(maxLevel)
                .option(availableRandomly)
                .option(availableForBookOffer)
                .option(availableAsTreasure)
                .build();
    }

    private OptionGroup createLevellessEnchantmentGroup(String enchantmentId, Option<Boolean> availableRandomly, Option<Boolean> availableForBookOffer, Option<Boolean> availableAsTreasure) {
        return OptionGroup.createBuilder()
                .name(Text.translatable("enchantment.incantationem." + enchantmentId))
                .option(availableRandomly)
                .option(availableForBookOffer)
                .option(availableAsTreasure)
                .build();
    }

    private OptionGroup createCurseGroup(String enchantmentId, Option<Boolean> availableForBookOffer, Option<Boolean> availableAsTreasure) {
        return OptionGroup.createBuilder()
                .name(Text.translatable("enchantment.incantationem." + enchantmentId))
                .option(availableForBookOffer)
                .option(availableAsTreasure)
                .build();
    }
    
}