package HeroExample.Generic.Hero;

public class Enemy implements Mortal{
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage){
        this.health-=damage;
        System.out.println(name + " получил урон " + damage + " осталось " + health);
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health>0;
    }
}

