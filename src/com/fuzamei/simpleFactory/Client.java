package com.fuzamei.simpleFactory;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class Client {

    public static void main(String[] args) {
        Mouse hp = SimpleFactory.createMouse("hp");
        hp.sayHi();

        Mouse dell = SimpleFactory.createMouse("dell");
        dell.sayHi();
    }

}
