package com.fuzamei.singleton;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class HungryModeSingleton {

    private static HungryModeSingleton hungryModeSingleton = new HungryModeSingleton();

    private HungryModeSingleton(){
        if(hungryModeSingleton != null){
            throw new RuntimeException();
        }
    }

    public static final HungryModeSingleton getInstance(){
        return hungryModeSingleton;
    }

}
