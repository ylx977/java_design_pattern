package com.fuzamei.command;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/21.
 */
public enum Visibility {

    VISIBLE("visible"), INVISIBLE("invisible"), UNDEFINED("");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
