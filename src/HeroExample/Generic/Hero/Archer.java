package HeroExample.Generic.Hero;

import HeroExample.Generic.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{



    public Archer(String name,int damage) {
        super(name,damage);
    }



        @Override
         public void attackEnemy(Enemy enemy){
            System.out.println(getName()+ " выстрелил из лука" + enemy.getName());
       enemy.takeDamage(getDamage());
        }




}

