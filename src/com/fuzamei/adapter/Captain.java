package com.fuzamei.adapter;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class Captain implements RowingBoat {

    private RowingBoat rowingBoat;

    public Captain(){}

    public Captain(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }

    @Override
    public void row() {
        rowingBoat.row();
    }
}
