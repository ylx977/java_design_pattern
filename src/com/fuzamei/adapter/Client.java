package com.fuzamei.adapter;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class Client {

    public static void main(String[] args) {
        RowingBoat captain = new Captain(new FishingBoatAdapter());

        captain.row();
    }

}
