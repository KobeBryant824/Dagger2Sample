package com.example.cxh.dagger2sample.dagger.noargs;

import javax.inject.Inject;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:17.
 */
public class Engine {
    @Inject // 用来标记构造函数，Dagger2通过@Inject注解可以在需要这个类实例的时候来找到这个构造函数并把相关实例构造出来，以此来为被@Inject标记了的变量提供依赖
    Engine() {
    }

    public void run() {
        System.out.println("引擎转起来了~~~");
    }
}
