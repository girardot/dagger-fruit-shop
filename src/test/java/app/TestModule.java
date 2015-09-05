package app;

import dagger.Module;
import provider.FruitShopModule;

@Module(includes = FruitShopModule.class,
        injects = FruitShopTest.class,
        overrides = true)
public class TestModule {

}
