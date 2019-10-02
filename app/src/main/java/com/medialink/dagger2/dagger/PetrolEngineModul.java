package com.medialink.dagger2.dagger;

import com.medialink.dagger2.car.Engine;
import com.medialink.dagger2.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModul {

    @Provides
    public Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
}
