package com.medialink.dagger2.dagger;

import com.medialink.dagger2.car.DiselEngine;
import com.medialink.dagger2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DiselEngineModul {

    @Binds
    abstract Engine bindEngine(DiselEngine engine);
}
