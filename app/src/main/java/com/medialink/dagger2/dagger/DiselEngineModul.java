package com.medialink.dagger2.dagger;

import com.medialink.dagger2.car.DiselEngine;
import com.medialink.dagger2.car.Engine;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class DiselEngineModul {

    private int horsePower;


    public DiselEngineModul(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DiselEngine engine) {
        return engine;
    }
}
