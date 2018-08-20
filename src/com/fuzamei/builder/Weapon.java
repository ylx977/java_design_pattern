package com.fuzamei.builder;

/**
 * Created by fuzamei on 2018/8/20.
 */
public enum Weapon {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
