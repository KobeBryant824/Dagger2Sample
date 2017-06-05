package com.example.cxh.dagger2sample.dagger.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:51.
 */
@Scope // 自定义的注解来限定注解作用域，实现局部的单例
@Retention(RetentionPolicy.RUNTIME)
public @interface CarScope {
}
