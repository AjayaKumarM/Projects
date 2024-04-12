package akproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Ajaya Kumar","ajayxyz@gmail.com",
                "2132432","1",200);

        Scanner scanner = new Scanner(System.in);

        boolean choice = true;

        while(choice){

            System.out.println("\nEnter number 1 to deposit, 2 to withdraw, 3 to view current balance and 4 to exit");


            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                switch (input) {
                    case 1 -> {
                        System.out.println("\nEnter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        bank.DepositMoney(depositAmount);
                    }
                    case 2 -> {
                        System.out.println("\nEnter withdraw amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        bank.WithdrawMoney(withdrawAmount);
                    }
                    case 3->{
                        System.out.println("The current balance is "+bank.getBalance());
                    }
                    case 4 -> {
                        choice = false;
                        System.out.println("\nThank you");
                    }

                    default -> System.out.println("\nInvalid input, please try again");
                }
            }
            else{
                scanner.next();
                System.out.println("\nInvalid input, please type 1,2,3 or 4");
            }
        }
    }
}
