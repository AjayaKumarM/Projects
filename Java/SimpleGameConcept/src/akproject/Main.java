package akproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player 1 name: ");
        String name = scanner.next();

        System.out.println("Enter weapon: ");
        String weapon = scanner.next();

        Player1 player1 = new Player1(name, weapon, 100);
        System.out.println("\nName:"+player1.getName());
        System.out.println("Weapon: "+player1.getWeapon());
        System.out.println("Health: "+player1.getHealth());


        player1.damageByGun2();
        player1.damageByGun1();
        player1.heal();


        System.out.println("\nEnter player 2 name: ");
        String name2 = scanner.next();

        System.out.println("Enter weapon: ");
        String weapon2 = scanner.next();

        Player2 player2 = new Player2(name2,weapon2,100,true);

        player2.damageByGun2();
        player2.damageByGun1();
        player2.heal();
    }
}
