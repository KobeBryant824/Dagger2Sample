package com.example.cxh.dagger2sample;

import android.app.Application;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/6 11:30.
 */
public class App extends Application {

    private static App mInstance;

    private static AppComponent mAppComponent;

    public static App getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }
}
