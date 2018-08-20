package com.fuzamei.factory;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class HpFactory implements Factory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
