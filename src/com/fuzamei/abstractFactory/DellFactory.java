package com.fuzamei.abstractFactory;

/**
 * Created by fuzamei on 2018/8/20.
 */
public class DellFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
