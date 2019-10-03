package com.medialink.dagger2.dagger;

import com.medialink.dagger2.car.Rims;
import com.medialink.dagger2.car.Tires;
import com.medialink.dagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rim, Tires tires) {
        return new Wheels(rim, tires);
    }
}
