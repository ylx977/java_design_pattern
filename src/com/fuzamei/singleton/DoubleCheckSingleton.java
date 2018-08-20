package com.fuzamei.singleton;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){
        if(doubleCheckSingleton != null){
            throw new RuntimeException();
        }
    }

    public static final DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                    return doubleCheckSingleton;
                }
            }
        }
        return doubleCheckSingleton;
    }

}
