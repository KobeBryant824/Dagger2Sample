package com.example.cxh.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cxh.dagger2sample.dagger.noargs.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car();
        car.getEngineA().run();

        com.example.cxh.dagger2sample.dagger.haveargs.Car haveArgsCar= new com.example.cxh.dagger2sample.dagger.haveargs.Car();
        haveArgsCar.getEngineA().run();
        haveArgsCar.getEngineB().run();

        com.example.cxh.dagger2sample.dagger.scope.Car scopeCar = new com.example.cxh.dagger2sample.dagger.scope.Car();
        System.out.println(scopeCar.getEngineA().hashCode());
        System.out.println(scopeCar.getEngineB().hashCode());

        /** @Inject和@Module都可以提供依赖，那如果我们即在构造函数上通过标记@Inject提供依赖，有通过@Module提供依赖Dagger2会如何选择呢？具体规则如下
         *  @Module 优先级高于 @Inject
         * <pre>
         *   步骤1：首先查找@Module标注的类中是否存在提供依赖的方法。
         *
             步骤2：若存在提供依赖的方法，查看该方法是否存在参数。
                   a：若存在参数，则按从步骤1开始依次初始化每个参数；
                   b：若不存在，则直接初始化该类实例，完成一次依赖注入。

             步骤3：若不存在提供依赖的方法，则查找@Inject标注的构造函数，看构造函数是否存在参数。
                   a：若存在参数，则从步骤1开始依次初始化每一个参数
                   b：若不存在，则直接初始化该类实例，完成一次依赖注入。
         *
         * </pre>
         */
    }
}
