package com.fuzamei.abstractFactory;

/**
 * Created by fuzamei on 2018/8/20.
 */
public class Client {

    public static void main(String[] args) {
        PcFactory factory = new DellFactory();
        Keybo keybo = factory.createKeybo();
        Mouse mouse = factory.createMouse();
        keybo.sayHi();
        mouse.sayHi();

        PcFactory factory1 = new HpFactory();
        Keybo keybo1 = factory1.createKeybo();
        Mouse mouse1 = factory1.createMouse();
        keybo1.sayHi();
        mouse1.sayHi();
    }

}
