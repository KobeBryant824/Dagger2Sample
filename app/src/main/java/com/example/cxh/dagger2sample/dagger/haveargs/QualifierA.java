package com.example.cxh.dagger2sample.dagger.haveargs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:41.
 */
@Qualifier // 用于自定义注解，同Java提供的几种基本元注解一样用来标记注解类
@Retention(RetentionPolicy.RUNTIME)
public @interface QualifierA {
}
