package com.fuzamei.bridge;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/21.
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();

}
