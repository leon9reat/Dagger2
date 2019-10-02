package com.medialink.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.medialink.dagger2.car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        car.drive();

    }
}
