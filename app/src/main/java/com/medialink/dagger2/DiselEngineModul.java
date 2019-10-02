package com.medialink.dagger2;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DiselEngineModul {

    @Binds
    abstract Engine bindEngine(DiselEngine engine);
}
