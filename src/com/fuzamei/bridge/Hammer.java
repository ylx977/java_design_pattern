package com.fuzamei.bridge;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/21.
 */
public class Hammer implements Weapon {

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment){
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("the hammer is wielded");
        enchantment.onActive();
    }

    @Override
    public void swing() {
        System.out.println("the hammer is swinged");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("the hammer is unwielded");
        enchantment.onDeactive();
    }

    @Override
    public Enchantment getEnchantment() {
        return this.enchantment;
    }
}
