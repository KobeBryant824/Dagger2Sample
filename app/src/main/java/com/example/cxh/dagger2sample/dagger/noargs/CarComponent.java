package com.example.cxh.dagger2sample.dagger.noargs;

import dagger.Component;

/**
 * Desc:注入器
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:21.
 */
@Component // 用于标注接口，是依赖需求方和依赖提供方之间的桥梁。
           // 被Component标注的接口在编译时会生成该接口的实现类（如果@Component标注的接口为CarComponent，则编译期生成的实现类为DaggerCarComponent）,我们通过调用这个实现类的方法完成注入；
public interface CarComponent {
    void inject(Car car);
}
