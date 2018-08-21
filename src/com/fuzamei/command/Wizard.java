package com.fuzamei.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class Wizard {

    /**
     * 当命令执行过后放入这个对列
     */
    private Deque<Command> undoStack = new LinkedList<>();

    /**
     * 当之前命令撤掉之后从undoStack拿出来执行undo，然后将命令放入redoStack，
     */
    private Deque<Command> redoStack = new LinkedList<>();


    public Wizard(){}

    public void castSpell(Command command,Target target){
        command.execute(target);
        //塞入undoStack最后
        undoStack.offerLast(command);
    }

    public void undoLastSpell(){
        if(!undoStack.isEmpty()){
            Command previousCommand = undoStack.pollLast();
            previousCommand.undo();
            redoStack.offerLast(previousCommand);
        }
    }

    public void redoLastSpell(){
        if(!redoStack.isEmpty()){
            Command previousCommand = redoStack.pollLast();
            previousCommand.redo();
            undoStack.offerLast(previousCommand);
        }
    }

    //todo 可以再加上全部命令撤消的方法...

}
