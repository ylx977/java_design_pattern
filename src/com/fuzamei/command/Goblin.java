package com.fuzamei.command;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class Goblin extends Target{

    public Goblin(){
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
