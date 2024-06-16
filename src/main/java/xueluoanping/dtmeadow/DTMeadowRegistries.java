package xueluoanping.dtmeadow;

import com.ferreusveritas.dynamictrees.api.registry.RegistryEvent;
import com.ferreusveritas.dynamictrees.api.registry.TypeRegistryEvent;
import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;


import com.ferreusveritas.dynamictrees.block.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.systems.fruit.Fruit;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xueluoanping.dtmeadow.systems.featuregen.CherryFeatures;
import xueluoanping.dtmeadow.systems.fruit.FruitTypes;
import xueluoanping.dtmeadow.systems.fruit.NamedFruitTypes;
import xueluoanping.dtmeadow.systems.leaves.CherryLeavesProperties;
import xueluoanping.dtmeadow.systems.leaves.FruitsLeavesProperties;
import xueluoanping.dtmeadow.systems.leaves.NamedVanillaCherryLeaveProperties;
import xueluoanping.dtmeadow.systems.worldgen.FruitTreesFeatureCanceller;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTMeadowRegistries {

    @SubscribeEvent
    public static void registerLeavesPropertiesTypes(final TypeRegistryEvent<LeavesProperties> event) {
        DTMeadow.LOGGER.debug("registerLeavesPropertiesTypes");
        event.registerType(new ResourceLocation(DTMeadow.MOD_ID, "cherry"), CherryLeavesProperties.TYPE);
        event.registerType(new ResourceLocation(DTMeadow.MOD_ID, "fruittrees"), FruitsLeavesProperties.TYPE);
        event.registerType(new ResourceLocation(DTMeadow.MOD_ID, "named_cherry_leaves"), NamedVanillaCherryLeaveProperties.TYPE);


    }

    @SubscribeEvent
    public static void registerFruitTypes(final TypeRegistryEvent<Fruit> event) {
        DTMeadow.LOGGER.debug("registerFruitTypes");
        event.registerType(new ResourceLocation(DTMeadow.MOD_ID, "fly_passable"), FruitTypes.TYPE);
        event.registerType(new ResourceLocation(DTMeadow.MOD_ID, "named_fruit"), NamedFruitTypes.TYPE);

    }


    public static final FeatureCanceller FRUIT_TREES_CANCELLER = new FruitTreesFeatureCanceller(DTMeadow.rl("fruittrees"));

    @SubscribeEvent
    public static void onFeatureCancellerRegistry(final RegistryEvent<FeatureCanceller> event) {
        event.getRegistry().registerAll(FRUIT_TREES_CANCELLER);
    }

    @SubscribeEvent
    public static void onGenFeatureRegistry(final com.ferreusveritas.dynamictrees.api.registry.RegistryEvent<GenFeature> event) {
        CherryFeatures.register(event.getRegistry());
    }


}
