package HeroExample.Generic.Hero;

import HeroExample.Generic.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{
    public Mage(String name,int damage) {
        super(name,damage);
    }


    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName()+ " заклинание " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
