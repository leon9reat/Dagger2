package com.medialink.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class DiselEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;

    // constructor
    @Inject
    public DiselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "hidupin mesin disel. horse power: " + horsePower);
    }
}
