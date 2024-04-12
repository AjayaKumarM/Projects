package akproject;

public class Player1 {

    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;

        if(health <= 0 || health > 100){
            this.health = 100;
        }
        else{
            this.health = health;
        }

    }

    public void damageByGun1(){

        this.health -= 30;

        if(this.health <= 20){
            System.out.println("\nGot hit by Gun 1. Health is reduced by 30. Health is critical. Current health is " +this.health+ ". Heal to restore health.");
        } else if (this.health <=0) {
            this.health = 0;
            System.out.println("\n"+getName()+" is dead");
        }
        else {
            System.out.println("\nGot hit by Gun 1. Health is reduced by 30. Current health is "+this.health+".");
        }

    }

    public void damageByGun2(){

        this.health -= 50;

        if(this.health <= 20){
            System.out.println("\nGot hit by Gun 2. Health is reduced by 50. Health is critical. Current health is " +this.health+ ". Heal to restore health.");
        } else if (this.health <=0) {
            this.health = 0;
            System.out.println("\n"+getName()+" is dead");
        }
        else {
            System.out.println("\nGot hit by Gun 2. Health is reduced by 50. Current health is "+this.health+".");
        }
    }

    public void heal(){
        if (this.health <=0){
            System.out.println(getName()+ "\n is dead. Healing is not possible");
        } else if (this.health == 100) {
            System.out.println("\nHealth is full");
        }
        else{
            this.health = 100;
            System.out.println("\nHealing..... Health is restored. Current health is "+getHealth()+".");
        }
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }
}
