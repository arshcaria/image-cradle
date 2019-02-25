package com.arshcaria.imagecradle;

import android.app.Application;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;

import timber.log.Timber;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        long time = System.currentTimeMillis();
        Fresco.initialize(this);
        Timber.tag("Aeo").i("Fresco initialization used " + (System.currentTimeMillis() - time) + " ms");
    }
}
