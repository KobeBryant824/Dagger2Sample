package com.example.cxh.dagger2sample.dagger.scope;

import dagger.Module;
import dagger.Provides;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:32.
 */
@Module
public class MarkCarModule {
    public MarkCarModule(){ }

    @CarScope
    @Provides
    Engine provideEngine(){
        return new Engine("gear");
    }

}
