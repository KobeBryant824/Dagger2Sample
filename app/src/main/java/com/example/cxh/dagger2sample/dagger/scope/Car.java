package com.example.cxh.dagger2sample.dagger.scope;



import javax.inject.Inject;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:17.
 */
public class Car {
    @Inject
    Engine engineA;

    @Inject
    Engine engineB;

    public Car() {
        DaggerCarComponent.builder().markCarModule(new MarkCarModule()).build().inject(this);
    }

    public Engine getEngineA() {
        return this.engineA;
    }

    public Engine getEngineB() {
        return this.engineB;
    }
}
