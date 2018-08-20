package com.fuzamei.singleton;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class InnerClassSingleton {

    public static final InnerClassSingleton getInstance(){
        return Inner.getInstance();
    }

    public static class Inner{
        private static final InnerClassSingleton INNER_CLASS_SINGLETON = new InnerClassSingleton();
        public static final InnerClassSingleton getInstance(){
            return INNER_CLASS_SINGLETON;
        }
    }
}
