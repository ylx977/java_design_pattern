package com.fuzamei.factory;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new DellFactory();
        Mouse mouse = factory.createMouse();
        mouse.sayHi();

        Factory factory1 = new HpFactory();
        Mouse mouse1 = factory1.createMouse();
        mouse1.sayHi();
    }

}
