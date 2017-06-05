package com.example.cxh.dagger2sample.dagger.scope;


import dagger.Component;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:21.
 */
@CarScope
@Component(modules = {MarkCarModule.class})
public interface CarComponent {
    void inject(Car car);
}
