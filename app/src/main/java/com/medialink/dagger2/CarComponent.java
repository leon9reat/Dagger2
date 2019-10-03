package com.medialink.dagger2;

import com.medialink.dagger2.car.Car;
import com.medialink.dagger2.dagger.DiselEngineModul;
import com.medialink.dagger2.dagger.PetrolEngineModul;
import com.medialink.dagger2.dagger.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModul.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
