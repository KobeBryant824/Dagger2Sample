package com.example.cxh.dagger2sample.interfaces;

/**
 * Desc: 接口注入
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 15:45.
 */
public class Car implements Injection<Engine>{

    private Engine engine;

    public Car(){}

    public void inject(Engine engine){
        this.engine = engine;
    }

}
