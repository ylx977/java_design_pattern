package com.fuzamei.command;

/**
 * Created by fuzamei on 2018/8/21.
 */
public abstract class Target {

    private Size size;

    private Visibility visibility;

    public Size getSize(){
        return this.size;
    }

    public Visibility getVisibility(){
        return this.visibility;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public void setVisibility(Visibility visibility){
        this.visibility = visibility;
    }

    public void printStatus(){
        System.out.println("[size="+getSize()+",visibility="+getVisibility()+"]");
    }


}
