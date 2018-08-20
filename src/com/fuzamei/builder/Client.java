package com.fuzamei.builder;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public class Client {

    public static void main(String[] args) {
        Hero jack = Hero.builder(Profession.THIEF, "Jack")
                .withArmor(Armor.CHAIN_MAIL)
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.AXE)
                .build();
        System.out.println(jack);
    }

}
