package com.medialink.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModul {

    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
}
