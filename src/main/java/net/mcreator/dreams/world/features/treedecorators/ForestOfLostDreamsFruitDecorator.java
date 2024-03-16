
package net.mcreator.dreams.world.features.treedecorators;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public class ForestOfLostDreamsFruitDecorator extends CocoaDecorator {

    public static Codec<ForestOfLostDreamsFruitDecorator> CODEC = Codec.unit(ForestOfLostDreamsFruitDecorator::new);

    public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

    @SubscribeEvent public static void registerPointOfInterest(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("forest_of_lost_dreams_tree_fruit_decorator", DECORATOR_TYPE));
    }

    public ForestOfLostDreamsFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return DECORATOR_TYPE;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
