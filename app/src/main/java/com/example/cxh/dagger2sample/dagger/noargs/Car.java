package com.example.cxh.dagger2sample.dagger.noargs;

import javax.inject.Inject;

/**
 * Desc: 此包用于演示@Inject 无参构造
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:17.
 */
public class Car {
    @Inject // 用来标记需要依赖的变量，以此告诉Dagger2为它提供依赖，再通俗点就是Car类需要依赖于Engine
    Engine engineA; // 使用@Inject时，不能用private修饰符修饰类的成员属性。

    public Car(){
        DaggerCarComponent.builder().build().inject(this); // 开始编译注入
    }

    public Engine getEngineA() {
        return engineA;
    }

}
