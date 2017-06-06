package com.example.cxh.dagger2sample.dagger.haveargs;

import com.example.cxh.dagger2sample.AppComponent;

import dagger.Component;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:21.
 */
//dependencies 多层依赖，此时CarComponent依赖于AppComponent
//对于具有依赖关系的Component，不能使用相同的Scope，如果使用相同的会带来语意不明
@ActivityScoped
@Component(dependencies = AppComponent.class, modules = MarkCarModule.class)
public interface CarComponent {

    void inject(Car car); // 直接注入
}
