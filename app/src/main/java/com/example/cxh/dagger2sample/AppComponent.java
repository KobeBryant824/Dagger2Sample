package com.example.cxh.dagger2sample;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

// 该Component只作为一种依赖的组织模块
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    App getApplication(); // 这里会获得AppModule提供的依赖

    Context getContext();  // 向其下层提供Context 对象

}
