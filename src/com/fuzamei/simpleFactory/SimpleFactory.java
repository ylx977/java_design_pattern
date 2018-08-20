package com.fuzamei.simpleFactory;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class SimpleFactory {

    public static final Mouse createMouse(String name){
        if("dell".equals(name)){
            return new HpMouse();
        }
        if("hp".equals(name)){
            return new DellMouse();
        }else{
            return null;
        }
    }

}


interface Mouse{

    void sayHi();

}

class HpMouse implements Mouse{

    @Override
    public void sayHi() {
        System.out.println("I am HP mouse");
    }
}

class DellMouse implements Mouse{

    @Override
    public void sayHi() {
        System.out.println("I am Dell mouse");
    }
}