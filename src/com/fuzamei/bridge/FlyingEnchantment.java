package com.fuzamei.bridge;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/21.
 */
public class FlyingEnchantment implements Enchantment {


    @Override
    public void onActive() {
        System.out.println("this item can fly now");
    }

    @Override
    public void apply() {
        System.out.println("this item flies and strikes the enemies finally returning to the owner's hand");
    }

    @Override
    public void onDeactive() {
        System.out.println("this item can not fly now");
    }
}
