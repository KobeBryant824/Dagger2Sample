package com.example.cxh.dagger2sample.dagger.haveargs;

/**
 * Desc: 有参的构造函数
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:17.
 */
public class Engine {
    private String mType;

    Engine(String type) {
        mType = type;
    }

    public void run() {
        System.out.println(mType + "引擎转起来了~~~");
    }
}
