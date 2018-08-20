package com.fuzamei.builder;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public enum Profession {

    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
