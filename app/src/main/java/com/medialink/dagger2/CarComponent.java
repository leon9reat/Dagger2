package com.medialink.dagger2;

import dagger.Component;

@Component (modules = {WheelsModule.class, DiselEngineModul.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
