package com.fuzamei.command;

/**
 * Created by fuzamei on 2018/8/21.
 */
public abstract class Command {

    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public String toString() {
        return super.toString();
    }
}
