package com.fuzamei.command;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/21.
 */
public class ShrinkSpell extends Command {

    private Size oldSize;

    private Target target;

    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if(oldSize != null && target != null){
            Size temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "shrink spell";
    }
}
