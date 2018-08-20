package com.fuzamei.builder;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @author ylx
 * Created by fuzamei on 2018/8/20.
 */
public final class Hero {

    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;


    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
    }

    public Profession getProfession(){
        return this.profession;
    }

    public String getName(){
        return this.name;
    }

    public HairColor getHairColor(){
        return this.hairColor;
    }

    public HairType getHairType(){
        return this.hairType;
    }

    public Armor getArmor(){
        return this.armor;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("this is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if(hairColor != null || hairType != null){
            sb.append(" with ");
            if(hairColor != null){
                sb.append(hairColor).append(' ');
            }
            if(hairType != null){
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    public static Builder builder(Profession profession,String name){
        return new Builder(profession,name);
    }

    public static class Builder{
        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        public Builder(Profession profession,String name){
            if(profession == null || name == null){
                throw new IllegalArgumentException("profession and name can bot be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor){
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon){
            this.weapon = weapon;
            return this;
        }

        public Hero build(){
            return new Hero(this);
        }
    }
}
