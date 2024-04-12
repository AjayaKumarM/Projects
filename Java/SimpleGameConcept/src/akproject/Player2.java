package akproject;

public class Player2 extends Player1{

    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            this.health -= 20;
            if(this.health <= 20){
                System.out.println("\nArmour is on. Got hit by Gun 1.  Health is reduced by 20. Health is critical. Current health is " +this.health+ ". Heal to restore health.");
            } else if (this.health <=0) {
                this.health = 0;
                System.out.println("\n"+getName()+" is dead");
            }
            else {
                System.out.println("\nArmour is on. Got hit by Gun 1. Health is reduced by 20. Current health is "+this.health+".");
            }
        }
        if(!armour){
            this.health -= 30;
            if(this.health <= 20){
                System.out.println("\nArmour is off. Got hit by Gun 1. Health is reduced by 30. Health is critical. Current health is " +this.health+ ". Heal to restore health.");
            } else if (this.health <=0) {
                this.health = 0;
                System.out.println("\n"+getName()+" is dead");
            }
            else {
                System.out.println("\nArmours is off. Got hit by Gun 1. Health is reduced by 30. Current health is "+this.health+".");
            }
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health -= 40;
            if(this.health <= 20){
                System.out.println("\nArmour is on. Got hit by Gun 2. Health is reduced by 40. Health is critical. Current health is " +this.health+ ". Heal to restore health.");
            } else if (this.health <=0) {
                this.health = 0;
                System.out.println("\n"+getName()+" is dead");
            }
            else {
                System.out.println("\nArmour is on. Got hit by Gun 2. Health is reduced by 40. Current health is "+this.health+".");
            }
        }
        if(!armour){
            this.health -= 50;
            if(this.health <= 20){
                System.out.println("\nArmour is off. Got hit by Gun 2. Health is reduced by 50. Health is critical. Current health is " +this.health+ ". Heal to restore health.");
            } else if (this.health <=0) {
                this.health = 0;
                System.out.println("\n"+getName()+" is dead");
            }
            else {
                System.out.println("\nArmour is off. Got hit by Gun 2. Health is reduced by 50. Current health is "+this.health+".");
            }
        }
    }

    @Override
    public void heal() {
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

    @Override
    public int getHealth() {
        return health;
    }

    public boolean isArmour() {
        return armour;
    }
}
