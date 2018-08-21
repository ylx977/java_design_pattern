package com.fuzamei.bridge;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class Sword implements Weapon {

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment){
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("sword is wielded");
        enchantment.onActive();
    }

    @Override
    public void swing() {
        System.out.println("sword is swinged");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("the sword is unwielded");
        enchantment.onDeactive();
    }

    @Override
    public Enchantment getEnchantment() {
        return this.enchantment;
    }
}
