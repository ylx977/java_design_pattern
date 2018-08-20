package com.fuzamei.abstractFactory;

/**
 * Created by fuzamei on 2018/8/20.
 */
public class HpFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
