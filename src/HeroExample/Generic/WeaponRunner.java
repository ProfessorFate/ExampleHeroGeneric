package HeroExample.Generic;


import HeroExample.Generic.Hero.Mage;
import HeroExample.Generic.Hero.Warrior;
import HeroExample.Generic.Hero.Archer;

public class WeaponRunner {
    public static void main(String[] args) {
     Archer<Bow> archer=new Archer<Bow>("Леголас",45);

     archer.setWeapon(new Bow()); //Благодаря Генерику, сделали так, что бы Лучник использовал только лук( класс арчер наследует интефрейс от RangeWeapon,а Bow наследуется от Range Weapon


        Warrior<Sword> warrior=new Warrior<>("Боромир",74);

        warrior.setWeapon(new Sword());

        Mage<Wand> mage=new Mage<>("Гендальф",44);
        mage.setWeapon(new Wand());


    }
}
