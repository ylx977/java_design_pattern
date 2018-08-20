package com.fuzamei.singleton;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class Client {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++){
//            System.out.println(HungryModeSingleton.getInstance());
//            System.out.println(InnerClassSingleton.getInstance());
//            System.out.println(DoubleCheckSingleton.getInstance());
//            System.out.println(LazyModeSingleton.getInstance());
            System.out.println(EnumSingleton.INSTANCE);
        }

    }

}
