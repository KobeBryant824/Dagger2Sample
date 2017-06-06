package com.example.cxh.dagger2sample.dagger.haveargs;


import com.example.cxh.dagger2sample.App;

import javax.inject.Inject;

/**
 * Desc: 此包用于演示@Moudle、@Provides、@Qualifier
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:17.
 */
public class Car {
    @QualifierA
    @Inject
    Engine engineA;

    @QualifierB
    @Inject
    Engine engineB;

    public Car() {
        DaggerCarComponent.builder()
                .appComponent(App.getAppComponent())
                .markCarModule(new MarkCarModule()).build().inject(this);
    }

    public Engine getEngineA() {
        return engineA;
    }

    public Engine getEngineB() {
        return engineB;
    }
}
