package com.example.cxh.dagger2sample.dagger.noargs;

import javax.inject.Inject;

/**
 * Desc: 注解注入
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:17.
 */
public class Car {
    @Inject // 用来标记需要依赖的变量，以此告诉Dagger2为它提供依赖
    Engine engineA;

    public Car(){
        DaggerCarComponent.builder().build().inject(this);
    }

    public Engine getEngineA() {
        return this.engineA;
    }

}
