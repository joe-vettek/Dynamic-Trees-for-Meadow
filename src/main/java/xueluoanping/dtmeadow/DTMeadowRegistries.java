package xueluoanping.dtmeadow;


import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xueluoanping.dtmeadow.systems.ModFeatures;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTMeadowRegistries {


    @SubscribeEvent
    public static void onGenFeatureRegistry(final com.ferreusveritas.dynamictrees.api.registry.RegistryEvent<GenFeature> event) {
      ModFeatures.register(event.getRegistry());
    }


}
