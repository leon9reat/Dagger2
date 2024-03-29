package com.medialink.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.medialink.dagger2.car.Car;
import com.medialink.dagger2.dagger.DiselEngineModul;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);

        car1.drive();
        car2.drive();

    }
}
