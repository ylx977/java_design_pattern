package com.fuzamei.singleton;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class LazyModeSingleton {

    private static LazyModeSingleton lazyModeSingleton;

    private LazyModeSingleton(){
        if(lazyModeSingleton != null){
            throw new RuntimeException();
        }
    }

    public static final LazyModeSingleton getInstance(){
        if(lazyModeSingleton == null){
            return lazyModeSingleton = new LazyModeSingleton();
        }
        return lazyModeSingleton;
    }

}
