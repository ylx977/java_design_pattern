package com.fuzamei.command;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class InvisibilitySpell extends Command {

    private Target target;

    private Visibility oldVisibility;

    @Override
    public void execute(Target target) {
        oldVisibility = target.getVisibility();
        target.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if(this.oldVisibility != null && this.target != null){
            Visibility temp = target.getVisibility();
            target.setVisibility(oldVisibility);
            this.oldVisibility = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "invisibility spell";
    }
}
