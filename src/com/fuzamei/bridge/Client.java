package com.fuzamei.bridge;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class Client {

    public static void main(String[] args) {
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();

        Hammer hammer2 = new Hammer(new SoulEatingEnchantment());
        hammer2.wield();
        hammer2.swing();
        hammer2.unwield();
    }

}
