package com.example.cxh.dagger2sample.dagger.scope;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:17.
 */
public class Engine {
    private String mType;

    Engine(String type) {
        mType = type;
        System.out.println("Create Engine");
    }

    public void run() {
        System.out.println(mType + "引擎转起来了~~~");
    }
}
