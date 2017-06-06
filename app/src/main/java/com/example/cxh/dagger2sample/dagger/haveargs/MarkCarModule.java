package com.example.cxh.dagger2sample.dagger.haveargs;

import dagger.Module;
import dagger.Provides;

/**
 * Desc:
 * Created by Hai (haigod7@gmail.com) on 2017/6/5 14:32.
 */
@Module // 用于标注提供依赖的类，很多时候我们需要提供依赖的构造函数是第三方库的、或者无构造函数的，我们没法给它加上@Inject注解
        // 又比如说提供以来的构造函数是带参数的，如果我们之所简单的使用@Inject标记它，那么他的参数又怎么来呢？（需要传参）
        // 但也可在有参构造函数上用@Inject标注，则Dagger会自动为所有构造参数注入值，参数值的来源则与@Inject注解变量的值的来源一样。（自动去寻找@Moduel、@Inject）
        // 最后要注意的一点就是，在@Inject注解的变量或者有参构造方法的参数没有值提供方的情况下，其值会为null，大家需要注意这个问题。
public class MarkCarModule {
    public MarkCarModule(){ }

    // @Qulifier的存在是为了解决Model下面有多个一样的返回类型
    // 通过自定义的注解去标注提供依赖的方法和依赖需求方（也就是被@Inject标注的变量），这样Dagger2就知道为谁提供依赖了
    // 一个更为精简的定义：当类型不足以鉴别一个依赖的时候，我们就可以使用这个注解标示

    //在编写Module中，不能出现传入参数和返回参数一致的情况，会导致死循环。
   /* Engine provideEngineA(Engine engine){
        return engine;
    }*/

    @QualifierA
    @Provides
    Engine provideEngineA(){
        return new Engine("gearA");
    }

    @QualifierB
    @Provides // 用于标注Module所标注的类中的方法，该方法在需要提供依赖时被调用，从而把预先提供好的对象当做依赖给标注了@Inject的变量赋值
              // 通常与@Module一起使用
    Engine provideEngineB(){
        return new Engine("gearB");
    }
}
