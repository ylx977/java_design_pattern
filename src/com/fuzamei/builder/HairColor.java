package com.fuzamei.builder;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public enum HairColor {

    WHITE,
    BLOND,
    RED,
    BROWN,
    BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
