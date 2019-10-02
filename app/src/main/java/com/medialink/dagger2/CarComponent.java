package com.medialink.dagger2;

import com.medialink.dagger2.car.Car;
import com.medialink.dagger2.MainActivity;
import com.medialink.dagger2.dagger.DiselEngineModul;
import com.medialink.dagger2.dagger.WheelsModule;

import dagger.Component;

@Component (modules = {WheelsModule.class, DiselEngineModul.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
