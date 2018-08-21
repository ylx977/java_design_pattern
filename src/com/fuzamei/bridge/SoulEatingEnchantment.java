package com.fuzamei.bridge;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/21.
 */
public class SoulEatingEnchantment implements Enchantment {

    @Override
    public void onActive() {
        System.out.println("this item can eat soul now");
    }

    @Override
    public void apply() {
        System.out.println("the item is eating the enemies souls");
    }

    @Override
    public void onDeactive() {
        System.out.println("soul eating ability now fade away");
    }
}
