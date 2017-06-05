package com.example.cxh.dagger2sample.construction;

/**
 * Desc: 构造注入
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 15:45.
 */
public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
}
