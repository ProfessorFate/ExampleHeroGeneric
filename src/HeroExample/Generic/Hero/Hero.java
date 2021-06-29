package HeroExample.Generic.Hero;

public  abstract class Hero<T> {

    private String name;
    private int damage;
    private T weapon;

    public Hero(String name,int damage){

        this.damage=damage;
        this.name=name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName(){
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
