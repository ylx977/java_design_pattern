package com.fuzamei.command;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/21.
 */
public enum Size {

    SMALL("small"),NORMAL("normal"),LARGE("large"),UNIFIED("unified");

    private String title;

    Size(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
