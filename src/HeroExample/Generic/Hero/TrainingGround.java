package HeroExample.Generic.Hero;

public class TrainingGround {
    public static void main(String[] args) {

        Hero warrior =new Warrior("Боромир",10);


        Hero mage =new Mage("Гендальф",15);


        Hero archer =new Archer("Леголас",5);

        Enemy enemy=new Enemy("Зомби",100);

        attackEnemy(enemy,warrior,mage,archer);

    }
    public static void attackEnemy(Enemy enemy,Hero... heroes){
        while (enemy.isAlive()){
            for (Hero hero:heroes){
                hero.attackEnemy(enemy);
            }
        }
    }



}
