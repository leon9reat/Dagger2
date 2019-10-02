package com.medialink.dagger2;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote Connected");
    }
}
